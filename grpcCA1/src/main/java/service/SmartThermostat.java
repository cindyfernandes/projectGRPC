package service;

import grpc_files.SmartThermostatGrpc.SmartThermostatImplBase;
import grpc_files.SmartThermostatOuterClass.AdjustTemperatureRequest;
import grpc_files.SmartThermostatOuterClass.AdjustTemperatureResponse;
import grpc_files.SmartThermostatOuterClass.GetTemperatureRequest;
import grpc_files.SmartThermostatOuterClass.GetTemperatureResponse;
import grpc_files.SmartThermostatOuterClass.SetTemperatureRequest;
import grpc_files.SmartThermostatOuterClass.SetTemperatureResponse;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class SmartThermostat extends SmartThermostatImplBase {

	@Override
	public void getTemperature(GetTemperatureRequest request, StreamObserver<GetTemperatureResponse> responseObserver) {
		
		//Metadata
		try {
	        // Add metadata to add client ID
	        Metadata metadata = new Metadata();
	        Metadata.Key<String> key = Metadata.Key.of("client-id", Metadata.ASCII_STRING_MARSHALLER);
	        metadata.put(key, "SmartHomeClient");

	        // Logic to get the current temperature
	        float currentTemperature = 22.5f; // Example temperature

	        GetTemperatureResponse response = GetTemperatureResponse.newBuilder()
	                .setCurrentTemperature(currentTemperature)
	                .build();

	        responseObserver.onNext(response);
	        responseObserver.onCompleted();

	    } catch (Exception e) {
	        // Handle errors and send appropriate status back to the client
	        responseObserver.onError(Status.INTERNAL.withDescription("An unexpected error occurred").asRuntimeException());
	    }
    }

	@Override
	public void setTemperature(SetTemperatureRequest request, StreamObserver<SetTemperatureResponse> responseObserver) {
		 
		float intendedTemperature = request.getIntendedTemperature();

	        // Logic to set the temperature
	        boolean success = true; 			// Assume the operation was successful for now

	        SetTemperatureResponse response = SetTemperatureResponse.newBuilder()
	                .setSuccess(success)
	                .build();

	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<AdjustTemperatureRequest> adjustTemperature(
			StreamObserver<AdjustTemperatureResponse> responseObserver) {
		return new StreamObserver<AdjustTemperatureRequest>() {
			
			 float currentTemperature = 22.5f; // Initial temperature example

	            @Override
	            public void onNext(AdjustTemperatureRequest request) {
	                float adjustment = request.getTemperatureAdjustment();
	                currentTemperature += adjustment;

	                AdjustTemperatureResponse response = AdjustTemperatureResponse.newBuilder()
	                        .setCurrentTemperature(currentTemperature)
	                        .build();

	                responseObserver.onNext(response);
	            }

	            @Override
	            public void onError(Throwable t) {
	                // Handle errors
	            }

	            @Override
	            public void onCompleted() {
	                responseObserver.onCompleted();
	            }
	        };
	    }

}
