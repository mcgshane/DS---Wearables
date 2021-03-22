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

	}
	public static void turnOnSwitch() {
		// sending the request to the server
		BooleanRequest request = BooleanRequest.newBuilder().setBooleanVal(false).build();
		
		// check the response from the server
		BooleanResponse response = blockingStub.turnOnSwitch(request);
		
		// print out message depending on the response
		if (response.getBooleanRepVal()) {
			System.out.println("Watch has been turned on");
		}
		else {
			System.out.println("Watch has been turned off!");
		}
}
}