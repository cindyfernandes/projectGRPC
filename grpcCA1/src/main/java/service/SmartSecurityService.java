package service;

import com.smart_home.SmartSecurityGrpc.SmartSecurityImplBase;
import com.smart_home.SmartSecurityOuterClass.ArmSystemRequest;
import com.smart_home.SmartSecurityOuterClass.ArmSystemResponse;
import com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest;
import com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse;

import io.grpc.stub.StreamObserver;

public class SmartSecurityService  extends SmartSecurityImplBase {

	//Implementing API
	@Override
	public void armSystem(ArmSystemRequest request, StreamObserver<ArmSystemResponse> responseObserver) {
		
		System.out.println("Inside security");
		
		String securityCode = request.getSecurityCode();
        String userId = request.getUserId();

        // Logic to arm the security system
        boolean success = true; // Assume the operation was successful for now

        ArmSystemResponse response = ArmSystemResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
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
