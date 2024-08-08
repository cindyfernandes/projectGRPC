package user;


import com.smart_home.SmartLightingGrpc;
import com.smart_home.User.SetScheduleRequest;
import com.smart_home.User.SetScheduleResponse;
import com.smart_home.User.ToggleLightRequest;
import com.smart_home.User.ToggleLightResponse;

import io.grpc.stub.StreamObserver;


public class UserService extends SmartLightingGrpc.SmartLightingImplBase{

	@Override
	public void toggleLight(ToggleLightRequest request, StreamObserver<ToggleLightResponse> responseObserver) {
		
		//Implementation of the toggleLight method 
		String lightId = request.getLightId();
		boolean intendedState = request.getIntendedState();
		
		//business logic to toggle the light state
		 boolean success = toggleLightState(lightId, intendedState);
		 
		// Build and send the response
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
                // Implementation of the SetSchedule method
                String lightId = request.getLightId();
                boolean intendedState = request.getIntendedState();
                String scheduleTime = request.getScheduleTime();

                // Logic to set the schedule
                boolean success = scheduleLightState(lightId, intendedState, scheduleTime);

                // Build and send the partial response
                SetScheduleResponse response = SetScheduleResponse.newBuilder()
                        .setSuccess(success)
                        .build();
                responseObserver.onNext(response);
            }
            @Override
            public void onError(Throwable t) {
                // Handle errors
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // Complete the response stream
                responseObserver.onCompleted();
            }
        };
	}
            
	
	private boolean toggleLightState(String lightId, boolean intendedState) {
        // Placeholder implementation for toggling the light state
        
        System.out.println("Light ID: " + lightId + ", State: " + intendedState);
        return true;
    }
	

    private boolean scheduleLightState(String lightId, boolean intendedState, String scheduleTime) {
        // Placeholder implementation for scheduling the light state
        // Replace this logic with actual hardware control
        System.out.println("Light ID: " + lightId + ", State: " + intendedState + ", Schedule: " + scheduleTime);
        return true;
    }
}
     
        



