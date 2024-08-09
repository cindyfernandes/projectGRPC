package server;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.SmartSecurityService;

public class SmartSecurityServer {
	
	public static void main(String[] args) throws IOException, InterruptedException {
        // Define the server port
        int port = 9094;

        // Initialize the logger
        Logger logger = Logger.getLogger(SmartSecurityServer.class.getName());

        // Build the gRPC server, binding it to the specified port and adding the SmartSecurityService
        Server server = ServerBuilder
                            .forPort(port)
                            .addService(new SmartSecurityService())
                            .build();

        // Start the server
        System.out.println("Starting server... System 2:SmartSecurityServer");

        server.start();
        logger.info("Server started, listening on port " + port);

        // Register the service with JmDNS
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "smartsecurity", port, "Smart Security gRPC Service");
        jmdns.registerService(serviceInfo);

        // Keep the server running and wait for termination
        server.awaitTermination();
    }

}
