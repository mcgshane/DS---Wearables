package smartGlasses_main;




import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smartGlasses.sgBooleanRequest;
import smartGlasses.sgBooleanResponse;
import smartGlasses.sgIntRequest;
import smartGlasses.sgIntResponse;
import smartGlasses.sgStringResponse;
import smartGlasses.smartGlassesServiceGrpc.smartGlassesServiceImplBase;
//import smartWatch.BooleanRequest;
//import smartWatch.BooleanResponse;

public class smartGlassesServer extends smartGlassesServiceImplBase{
	
	public static final Logger logger = Logger.getLogger(smartGlassesServer.class.getName());
	public static ArrayList<String> directionsToDesination = new ArrayList<String>();

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Create a server with the port of 50565
		smartGlassesServer smartGlassesServer = new smartGlassesServer();
	   
	    int port = 50565;
	    Server server = ServerBuilder.forPort(port)
	        .addService(smartGlassesServer)
	        .build()
	        .start();
	    
	    logger.info("Server started, listening on " + port);
	 // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Server is shutting down!");
            server.shutdown();
        }));
	    server.awaitTermination();
	}
	//Turn On Switch
			public void turnOnGlasses(sgBooleanRequest request, StreamObserver<sgBooleanResponse> responseObserver) {
				
		        System.out.println("Receiving request for power!");
		        // setting the request value
		       Boolean turnOn = request.getBoolVal();
		        if (turnOn) {
		        	System.out.println("Turning power on!");
		        }
		        else {
		        	System.out.println("Turning power off!");
		        }
		        // Sending response
		        sgBooleanResponse response = sgBooleanResponse.newBuilder().setBoolRespVal(turnOn).build(); 

		        responseObserver.onNext(response);
		        responseObserver.onCompleted();
		        
			}
			/***********************
			 * SERVER SIDE STREAMING
			 * 
			 * ******************/
			public void setDestination(sgIntRequest request, StreamObserver<sgBooleanResponse> responseObserver) {
				directionsToDesination.clear();
					int directionRequested = request.getIntRequestValue();
					if (directionRequested <=5) {
						directionsToDesination.add("GoLeft");
						directionsToDesination.add("GoRight");
						directionsToDesination.add("GoStraight");		
					}
					if (directionRequested >5) {
						directionsToDesination.add("GoRight");
						directionsToDesination.add("GoRight");
						directionsToDesination.add("GoLeft");		
					}
			        sgBooleanResponse response = sgBooleanResponse.newBuilder().setBoolRespVal(true).build(); 
			        responseObserver.onNext(response);
			        responseObserver.onCompleted();
			
			}
			
			
			//Starting the Journey
			public void startJourney(sgBooleanRequest request, StreamObserver<sgStringResponse> responseObserver) {
				
		        System.out.println("Journey has started processing next turn events");
		        // Check request value 
		        Boolean start = request.getBoolVal();

				    for (int i = 0; i < directionsToDesination.size(); i++) {
				        String direction = directionsToDesination.get(i);       
						 System.out.println("Direction to send to client is -" + direction );
						 responseObserver.onNext(sgStringResponse.newBuilder().setStringRespVal(direction).build());
				      }
					 responseObserver.onNext(sgStringResponse.newBuilder().setStringRespVal("ArrivedAtDestination").build());
				 
				 responseObserver.onCompleted();
			}
			
			 /**************
			  * BIO DIRECTION STREAMING
			  ****************/
			  public StreamObserver<sgIntRequest> distanceFrom(StreamObserver<sgIntResponse> responseObserver){ 
				  //Calling the Server
				  return new sgIntRequestObserver(responseObserver); 
				  }
			 
			
			
}
	