package service_registration;

import java.io.IOException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

import service.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartLightingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        
    	// Define the server port
        int port = 50051;

        // Initialize the logger
        Logger logger = Logger.getLogger(SmartLightingServer.class.getName());

        // Build the gRPC server, binding it to the specified port and adding the SmartLightingService
        Server server = ServerBuilder
                            .forPort(port)
                            .addService(new UserService())
                            .build();

        // Start the server
        System.out.println("Starting server... System 1: SmartLightingServer");
        server.start();
        logger.info("Server started, listening on port " + port);

        // Register the service with JmDNS
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "smartlighting", port, "Smart Lighting gRPC Service");
        jmdns.registerService(serviceInfo);

        // Keep the server running and wait for termination
        server.awaitTermination();
    }
}