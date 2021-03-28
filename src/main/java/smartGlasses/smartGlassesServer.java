
package smartGlasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smartGlasses.smartGlassesServiceGrpc.smartGlassesServiceImplBase;
//import smartWatch.BooleanRequest;
//import smartWatch.BooleanResponse;

public class smartGlassesServer extends smartGlassesServiceImplBase{
	
	public static final Logger logger = Logger.getLogger(smartGlassesServer.class.getName());
	public static ArrayList<String> directionsToDesination = new ArrayList<String>();

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * directionsToDesination.add("GoLeft"); 
		 * directionsToDesination.add("GoRight");
		 * directionsToDesination.add("GoStraight");
		 */
		// Create a server with the port of 52026
		smartGlassesServer smartGlassesServer = new smartGlassesServer();
	   
	    int port = 52026;
	    Server server = ServerBuilder.forPort(port)
	        .addService(smartGlassesServer)
	        .build()
	        .start();
	    
	    logger.info("Server started, listening on " + port);
	    		    
	    server.awaitTermination();
	}
	//Turn On Switch
			public void turnOnGlasses(sgBooleanRequest request, StreamObserver<sgBooleanResponse> responseObserver) {
				
				// Print a message stating the function has been invoked
		        System.out.println("Receiving request for power!");
		        // Get the switch variable
		       Boolean turnOn = request.getBoolVal();
		        if (turnOn) {
		        	System.out.println("Turning power on!");
		        }
		        else {
		        	System.out.println("Turning power off!");
		        }
		        // Send a response with power value back
		        sgBooleanResponse response = sgBooleanResponse.newBuilder().setBoolRespVal(turnOn).build(); 

		        responseObserver.onNext(response);
		        responseObserver.onCompleted();
		        
			}
			
			public void setDestination(sgIntRequest request, StreamObserver<sgBooleanResponse> responseObserver) {
				directionsToDesination.clear();
					int directionRequested = request.getIntVal();
					if (directionRequested <=5) {
						directionsToDesination.add("GoLeft1");
						directionsToDesination.add("GoRight2");
						directionsToDesination.add("GoStraight3");		
					}
					if (directionRequested >5) {
						directionsToDesination.add("GoRight4");
						directionsToDesination.add("GoRight5");
						directionsToDesination.add("GoLeft6");		
					}
			        sgBooleanResponse response = sgBooleanResponse.newBuilder().setBoolRespVal(true).build(); 
			        responseObserver.onNext(response);
			        responseObserver.onCompleted();

			        //
			/*
			 * readreset for destination if destintation = 1 set directions to
			 * directionsToDesination.add("GoLeft"); directionsToDesination.add("GoRight");
			 * directionsToDesination.add("GoStraight"); 
			 * else if destination = 2 set
			 * destinations to directionsToDesination.add("GoRight");
			 * directionsToDesination.add("GoRight"); directionsToDesination.add("GoLeft");
			 * 
			 * return response "" bool true to say destionation is set
			 */				
			}
			
			
			//Starting the Journey
			public void startJourney(sgBooleanRequest request, StreamObserver<sgStringResponse> responseObserver) {
			//	responseObserver.onNext(null);
				
				// Print a message stating the function has been invoked
		        System.out.println("Journey has started processing next turn events");
		        // Check request value 
		        Boolean start = request.getBoolVal();
		        
				 

				    for (int i = 0; i < directionsToDesination.size(); i++) {
				        String direction = directionsToDesination.get(i);       
						 System.out.println("Direction to send to client is -" + direction );
						 responseObserver.onNext(sgStringResponse.newBuilder().setStringRespVal(direction).build());
						 sleep(2000);
				      }
					 responseObserver.onNext(sgStringResponse.newBuilder().setStringRespVal("ArrivedAtDestination").build());
				 
				 responseObserver.onCompleted();
			}
			
			private static void sleep(long millies) {
				try {
					Thread.sleep(millies);
				} catch (InterruptedException e) {
					System.out.println("Thread is interrupted");
					Thread.currentThread().interrupt();
				}
			}

			/*
			 * @Override public StreamObserver<sgIntRequest>
			 * distanceLeft(StreamObserver<sgIntResponse> responseObserver){ return new
			 * sgIntRequestObserver(responseObserver); }
			 */
			
			
}
	