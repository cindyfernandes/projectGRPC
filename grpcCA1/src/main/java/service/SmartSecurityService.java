package service;

import grpc_files.SmartSecurityGrpc.SmartSecurityImplBase;
import grpc_files.SmartSecurityOuterClass.ArmSystemRequest;
import grpc_files.SmartSecurityOuterClass.ArmSystemResponse;
import grpc_files.SmartSecurityOuterClass.GetSensorStatusRequest;
import grpc_files.SmartSecurityOuterClass.GetSensorStatusResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class SmartSecurityService  extends SmartSecurityImplBase {

	//Implementing API
	@Override
	public void armSystem(ArmSystemRequest request, StreamObserver<ArmSystemResponse> responseObserver) {
		
		// Handle any unexpected errors
		try {
	        String securityCode = request.getSecurityCode();
	        String userId = request.getUserId();

	        // Simulate checking the security code
	        boolean isValidCode = "1234".equals(securityCode); // Example valid code
	        if (!isValidCode) {
	            responseObserver.onError(Status.PERMISSION_DENIED
	                .withDescription("Invalid security code.")
	                .asRuntimeException());
	            return;
	        }

	        // Logic to arm the system
	        boolean success = true; // Assume the operation was successful

	        ArmSystemResponse response = ArmSystemResponse.newBuilder()
	                .setSuccess(success)
	                .build();

	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	    } catch (Exception e) {
	        // Handle any unexpected errors
	        responseObserver.onError(Status.INTERNAL
	            .withDescription("An unexpected error occurred while arming the system.")
	            .asRuntimeException());
	    }
	}

	@Override
	public void getSensorStatus(GetSensorStatusRequest request,
			StreamObserver<GetSensorStatusResponse> responseObserver) {
		
		String sensorId = request.getSensorId();

        // Logic to get sensor status
        boolean sensorStatus = true; // Example status

        GetSensorStatusResponse response = GetSensorStatusResponse.newBuilder()
                .setSensorId(sensorId)
                .setSensorStatus(sensorStatus)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
	
	

}
