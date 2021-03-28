package smartGlasses;

import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import smartGlasses.smartGlassesServiceGrpc.smartGlassesServiceImplBase;

public class smartGlassesClient extends smartGlassesServiceImplBase
{
	private static smartGlassesServiceGrpc.smartGlassesServiceBlockingStub blockingStub;
	private static smartGlassesServiceGrpc.smartGlassesServiceStub asyncStub;
	private static smartGlassesServiceGrpc.smartGlassesServiceStub biDirStub;

	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52026).usePlaintext().build();

		blockingStub = smartGlassesServiceGrpc.newBlockingStub(channel);
		asyncStub = smartGlassesServiceGrpc.newStub(channel);
		biDirStub = smartGlassesServiceGrpc.newStub(channel);
		
		turnOnGlasses();
		setDestination();
		startJourney();
		//distanceLeft();
		

	}
	public static void turnOnGlasses() {
		// sending the request to the server
		sgBooleanRequest request = sgBooleanRequest.newBuilder().setBoolVal(true).build();
		
		// check the response from the server
		sgBooleanResponse response = blockingStub.turnOnGlasses(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Glasses have been turned on");
		}
		else {
			System.out.println("Glasses have been turned off!");
		}
	}
	
	public static void setDestination() {
		// sending the request to the server
		sgIntRequest request = sgIntRequest.newBuilder().setIntVal(1).build();
		
		// check the response from the server
		sgBooleanResponse response = blockingStub.setDestination(request);
		
		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Destination has been set ");
		}
		
	}
	
	/**
	   * Blocking server-streaming example. Calls startJourney with directionRequest. Prints each
	   * response direction as it arrives.
	   */
	public static void startJourney() {
		
		sgBooleanRequest directionRequest = sgBooleanRequest.newBuilder().setBoolVal(true).build();

		Iterator<sgStringResponse> nextTurns;
		//Call to Server with directionRequest
		nextTurns = blockingStub.startJourney(directionRequest);
	     for (int i = 1; nextTurns.hasNext(); i++) {
	    	 sgStringResponse nextTurn = nextTurns.next();
	         System.out.println("Next Direction - " + nextTurn.toString() );
	       }
			
	
	}
	
	/*
	 * public static void distanceLeft() { sgIntResponseObserver intResponseObserver
	 * = new sgIntResponseObserver(); StreamObserver<sgIntRequest> requestObserver =
	 * biDirStub.distanceLeft(intResponseObserver);
	 * intResponseObserver.begin(requestObserver); }
	 */
	
}