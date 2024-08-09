package service_discovery;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

public class ServiceDiscovery {
    
    // Instance of JmDNS used to discover services on the local network.
    private JmDNS jmdns;

    // Map to store discovered services by their names.
    private Map<String, ServiceInfo> discoveredServices = new HashMap<>();

    // Constructor initializes JmDNS instance.
    public ServiceDiscovery() {
        try {
            jmdns = JmDNS.create(InetAddress.getLocalHost());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to start discovering services of a specific type.
    public void discoverServices(String serviceType) {
        jmdns.addServiceListener(serviceType, new SampleListener());
    }

    // Method to get the information of a discovered service by its name.
    public ServiceInfo getServiceInfo(String serviceName) {
        return discoveredServices.get(serviceName);
    }

    // Private inner class that implements the ServiceListener interface to handle service events.
    private class SampleListener implements ServiceListener {
        
        // Called when a service is added to the network.
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        // Called when a service is removed from the network.
        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
            discoveredServices.remove(event.getName());
        }

        // Called when a service is resolved (i.e., its details are fully available).
        @Override
        public void serviceResolved(ServiceEvent event) {
            ServiceInfo info = event.getInfo();
            System.out.println("Service resolved: " + info);
            // Store the resolved service info in the map with the service name as the key.
            discoveredServices.put(info.getName(), info);
        }
    }

    // Main method for testing the service discovery functionality.
    public static void main(String[] args) {
        ServiceDiscovery sd = new ServiceDiscovery();
        
        // Start discovering all gRPC services on the local network.
        sd.discoverServices("_grpc._tcp.local.");

        // Optional: wait for a few seconds to allow services to be discovered.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Access the discovered services by name.
        ServiceInfo lightingInfo = sd.getServiceInfo("smartlighting");
        ServiceInfo securityInfo = sd.getServiceInfo("smartsecurity");
        ServiceInfo thermostatInfo = sd.getServiceInfo("smartthermostat");

        // Print details of the discovered services.
        if (lightingInfo != null) {
            System.out.println("Smart Lighting Service - Host: " + lightingInfo.getHostAddresses()[0] + " Port: " + lightingInfo.getPort());
        }

        if (securityInfo != null) {
            System.out.println("Smart Security Service - Host: " + securityInfo.getHostAddresses()[0] + " Port: " + securityInfo.getPort());
        }

        if (thermostatInfo != null) {
            System.out.println("Smart Thermostat Service - Host: " + thermostatInfo.getHostAddresses()[0] + " Port: " + thermostatInfo.getPort());
        }
    }
}
