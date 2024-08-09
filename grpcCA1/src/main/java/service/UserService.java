package service;

import grpc_files.SmartLightingGrpc;
import grpc_files.SmartLightingOuterClass.SetScheduleRequest;
import grpc_files.SmartLightingOuterClass.SetScheduleResponse;
import grpc_files.SmartLightingOuterClass.ToggleLightRequest;
import grpc_files.SmartLightingOuterClass.ToggleLightResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class UserService extends SmartLightingGrpc.SmartLightingImplBase {

    @Override
    public void toggleLight(ToggleLightRequest request, StreamObserver<ToggleLightResponse> responseObserver) {
        
    	//Error Handling- if the lights exists
    	try {
            String lightId = request.getLightId();
            boolean intendedState = request.getIntendedState();

            // Simulate checking if the light exists
            boolean lightExists = true; // Assume the light exists
            if (!lightExists) {
                responseObserver.onError(Status.NOT_FOUND
                    .withDescription("Light ID not found.")
                    .asRuntimeException());
                return;
            }

            // Logic to toggle the light
            boolean success = true; // Assume the operation was successful

            ToggleLightResponse response = ToggleLightResponse.newBuilder()
                    .setSuccess(success)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Handle any unexpected errors
            responseObserver.onError(Status.INTERNAL
                .withDescription("An unexpected error occurred while toggling the light.")
                .asRuntimeException());
        }
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




