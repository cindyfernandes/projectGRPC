package service;

import grpc_files.SmartLightingGrpc;
import grpc_files.SmartLightingOuterClass.SetScheduleRequest;
import grpc_files.SmartLightingOuterClass.SetScheduleResponse;
import grpc_files.SmartLightingOuterClass.ToggleLightRequest;
import grpc_files.SmartLightingOuterClass.ToggleLightResponse;
import io.grpc.stub.StreamObserver;

public class UserService extends SmartLightingGrpc.SmartLightingImplBase {

    @Override
    public void toggleLight(ToggleLightRequest request, StreamObserver<ToggleLightResponse> responseObserver) {
        
    	
    	String lightId = request.getLightId();
        boolean intendedState = request.getIntendedState();

        // Logic to toggle light
        boolean success = true; // Assume the operation was successful for now

        ToggleLightResponse response = ToggleLightResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SetScheduleRequest> setSchedule(StreamObserver<SetScheduleResponse> responseObserver) {
        return new StreamObserver<SetScheduleRequest>() {

            @Override
            public void onNext(SetScheduleRequest request) {
                // Logic to handle each SetScheduleRequest
            }

            @Override
            public void onError(Throwable t) {
                // Handle errors
            }

            @Override
            public void onCompleted() {
                // Finalize the response
                SetScheduleResponse response = SetScheduleResponse.newBuilder()
                        .setSuccess(true)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}




