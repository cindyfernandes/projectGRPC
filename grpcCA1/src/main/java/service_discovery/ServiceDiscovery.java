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

    // Static method to discover and return information about a specific service.
    public static ServiceInfo discoverService(String serviceType, String serviceName) {
        ServiceDiscovery sd = new ServiceDiscovery();
        sd.discoverServices(serviceType);

        try {
            // Wait a few seconds to allow the service to be discovered.
            Thread.sleep(3000); // You can adjust the time as needed.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return the discovered service info.
        return sd.getServiceInfo(serviceName);
    }

    // Private inner class that implements the ServiceListener interface to handle service events.
    private class SampleListener implements ServiceListener {

        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
            discoveredServices.remove(event.getName());
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            ServiceInfo info = event.getInfo();
            System.out.println("Service resolved: " + info);
            discoveredServices.put(info.getName(), info);
        }
    }

    // Main method for testing the service discovery functionality.
    public static void main(String[] args) {
        ServiceDiscovery sd = new ServiceDiscovery();
        sd.discoverServices("_grpc._tcp.local.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ServiceInfo lightingInfo = sd.getServiceInfo("smartlighting");
        ServiceInfo securityInfo = sd.getServiceInfo("smartsecurity");
        ServiceInfo thermostatInfo = sd.getServiceInfo("smartthermostat");

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
