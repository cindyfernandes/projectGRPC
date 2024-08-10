package client;

import service_discovery.ServiceDiscovery;
import com.smart_home.SmartLightingGrpc;
import com.smart_home.SmartSecurityGrpc;
import com.smart_home.SmartThermostatGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.jmdns.ServiceInfo;

public class SmartHomeGUI {

    private JFrame frame;
    private JButton discoverButton;
    private JButton controlLightingButton;
    private JButton armSecurityButton;
    private JButton adjustThermostatButton;
    private JLabel statusLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SmartHomeGUI().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Smart Home Control Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        discoverButton = new JButton("Discover Services");
        controlLightingButton = new JButton("Control Lighting");
        armSecurityButton = new JButton("Arm Security System");
        adjustThermostatButton = new JButton("Adjust Thermostat");
        statusLabel = new JLabel("Status: Waiting for discovery...");

        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(discoverButton);
        frame.getContentPane().add(controlLightingButton);
        frame.getContentPane().add(armSecurityButton);
        frame.getContentPane().add(adjustThermostatButton);
        frame.getContentPane().add(statusLabel);

        // Button actions
        discoverButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                discoverServices();
            }
        });

        controlLightingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlLightingService();
            }
        });

        armSecurityButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                armSecurityService();
            }
        });

        adjustThermostatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adjustThermostatService();
            }
        });

        frame.setVisible(true);
    }

    private void discoverServices() {
        ServiceInfo lightingServiceInfo = service_discovery.ServiceDiscovery("_grpc._tcp.local.");
        if (lightingServiceInfo != null) {
            statusLabel.setText("Service discovered: " + lightingServiceInfo.getQualifiedName());
        } else {
            statusLabel.setText("No services discovered.");
        }
    }

    private void controlLightingService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        SmartLightingGrpc.SmartLightingBlockingStub stub = SmartLightingGrpc.newBlockingStub(channel);

        // Call the gRPC service method
        // stub.toggleLight(...); // exemplo de chamada ao serviço gRPC

        statusLabel.setText("Lighting controlled successfully.");
        channel.shutdown();
    }

    private void armSecurityService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9094)
                .usePlaintext()
                .build();

        SmartSecurityGrpc.SmartSecurityBlockingStub stub = SmartSecurityGrpc.newBlockingStub(channel);

        // Call the gRPC service method
        // stub.armSystem(...); // exemplo de chamada ao serviço gRPC

        statusLabel.setText("Security system armed successfully.");
        channel.shutdown();
    }

    private void adjustThermostatService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();

        SmartThermostatGrpc.SmartThermostatBlockingStub stub = SmartThermostatGrpc.newBlockingStub(channel);

        // Call the gRPC service method
        // stub.adjustTemperature(...); 

        statusLabel.setText("Thermostat adjusted successfully.");
        channel.shutdown();
    }
}
