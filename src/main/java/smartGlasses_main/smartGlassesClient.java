package smartGlasses_main;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import smartGlasses.sgBooleanRequest;
import smartGlasses.sgBooleanResponse;
import smartGlasses.sgIntRequest;
import smartGlasses.sgStringResponse;
import smartGlasses.smartGlassesServiceGrpc;
import smartGlasses.smartGlassesServiceGrpc.smartGlassesServiceImplBase;

public class smartGlassesClient extends smartGlassesServiceImplBase
{
	private static smartGlassesServiceGrpc.smartGlassesServiceStub biDirStub;
	private static smartGlassesServiceGrpc.smartGlassesServiceBlockingStub blockingStub;

	
	public static void main(String[] args) throws Exception {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50565) .usePlaintext() .build();
		
		biDirStub = smartGlassesServiceGrpc.newStub(channel); 
		blockingStub = smartGlassesServiceGrpc.newBlockingStub(channel);
		turnOnGlasses();
		distanceRem();	  
	   Thread.sleep(20000); 
	}
	
	public static void turnOnGlasses() {
		// setting up the request
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
		/************************* 
		 * BIO DIRECTIONAL STREAMING
		 * 
		 * ********************/
	  public static void distanceRem() { 
		//Initializing a new stream response from the server
	   sgIntResponseObserver intResponseObserver = new sgIntResponseObserver(); 
	   //Initializing the Request
	   StreamObserver<sgIntRequest> requestObserver = biDirStub.distanceFrom(intResponseObserver);
	   // Sending Request to the server
	   intResponseObserver.startTrip(requestObserver);
	  
	  }
	}

