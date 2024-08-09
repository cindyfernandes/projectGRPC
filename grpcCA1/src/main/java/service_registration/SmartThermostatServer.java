package service_registration;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import service.SmartThermostat;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartThermostatServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Define the server port
        int port = 9092;

        // Initialize the logger
        Logger logger = Logger.getLogger(SmartThermostatServer.class.getName());

        // Build the gRPC server, binding it to the specified port and adding the SmartThermostatService
        Server server = ServerBuilder
                            .forPort(port)
                            .addService(new SmartThermostat())
                            .build();

        // Start the server
        System.out.println("Starting server... System 3: SmartThermostatServer");
        server.start();
        logger.info("Server started, listening on port " + port);

        // Register the service with JmDNS
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "smartthermostat", port, "Smart Thermostat gRPC Service");
        jmdns.registerService(serviceInfo);

        // Keep the server running and wait for termination
        server.awaitTermination();
    }
}
