package smartWatch;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class smartWatchClient {

	private static smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub;
	private static smartWatchServiceGrpc.smartWatchServiceStub asyncStub;

	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
		//Initizing the Stubs
		blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
		asyncStub = smartWatchServiceGrpc.newStub(channel);
		
		//calling the methods
		turnOnSwitch();
		startTimer();
		resetTimer();
		

	}
	public static void turnOnSwitch() {
		// Build the request 
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();
		
		// sending request and getting response
		BooleanResponse response = blockingStub.turnOnSwitch(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Watch has been turned on");
		}
		else {
			System.out.println("Watch has been turned off!");
		}
	}
	
	public static void startTimer() {
		// build the request
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();
		
		// send request and get response
		BooleanResponse response = blockingStub.startTimer(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Timer has Started");
		}
		else {
			System.out.println("Timer has been stopped !");
		}
	}
	
	public static void resetTimer() {
		// build the request 
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();
		
		// send request and get response
		BooleanResponse response = blockingStub.resetTimer(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Timer has reset");
		}
	}
}
