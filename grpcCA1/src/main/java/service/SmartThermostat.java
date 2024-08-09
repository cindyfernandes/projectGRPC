package service;

import com.smart_home.SmartThermostatGrpc.SmartThermostatImplBase;
import com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest;
import com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse;
import com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest;
import com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse;
import com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest;
import com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse;

import io.grpc.stub.StreamObserver;

public class SmartThermostat extends SmartThermostatImplBase {

	@Override
	public void getTemperature(GetTemperatureRequest request, StreamObserver<GetTemperatureResponse> responseObserver) {
		
		// Logic to get the current temperature
        float currentTemperature = 22.5f; // Example temperature

        GetTemperatureResponse response = GetTemperatureResponse.newBuilder()
                .setCurrentTemperature(currentTemperature)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();	
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
