package smartWatch;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class smartWatchClient {

	private static smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub;
	private static smartWatchServiceGrpc.smartWatchServiceStub asyncStub;

	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();

		blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
		asyncStub = smartWatchServiceGrpc.newStub(channel);

		turnOnSwitch();
		startTimer();
		resetTimer();
		

	}
	public static void turnOnSwitch() {
		// sending the request to the server
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();
		
		// check the response from the server
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
		// sending the request to the server
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();
		
		// check the response from the server
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
		// sending the request to the server
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();
		
		// check the response from the server
		BooleanResponse response = blockingStub.resetTimer(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Timer has reset");
		}
	}
}
