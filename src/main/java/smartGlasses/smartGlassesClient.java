package smartGlasses;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class smartGlassesClient {

	private static smartGlassesServiceGrpc.smartGlassesServiceBlockingStub blockingStub;
	private static smartGlassesServiceGrpc.smartGlassesServiceStub asyncStub;

	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52026).usePlaintext().build();

		blockingStub = smartGlassesServiceGrpc.newBlockingStub(channel);
		asyncStub = smartGlassesServiceGrpc.newStub(channel);

		turnOnSwitch();
		startJourney();

	}
	public static void turnOnSwitch() {
		// sending the request to the server
		BooleanRequest request = BooleanRequest.newBuilder().setBoolVal(false).build();
		
		// check the response from the server
		BooleanResponse response = blockingStub.turnOnSwitch(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Glasses have been turned on");
		}
		else {
			System.out.println("Glasses have been turned off!");
		}
	}
	
	
}
