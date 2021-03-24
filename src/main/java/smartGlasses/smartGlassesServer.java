package smartGlasses;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smartGlasses.smartGlassesServiceGrpc.smartGlassesServiceImplBase;
import smartWatch.BooleanRequest;
import smartWatch.BooleanResponse;

public class smartGlassesServer extends smartGlassesServiceImplBase{
	
	public static final Logger logger = Logger.getLogger(smartGlassesServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		
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
			public void turnOnSwitch(BooleanRequest request, StreamObserver<BooleanResponse> responseObserver) {
				
				// Print a message stating the function has been invoked
		        System.out.println("Receiving request for power!");
		        // Get the switch variable
		       Boolean turnOn = request.getBoolValue();
		        if (turnOn) {
		        	System.out.println("Turning power on!");
		        }
		        else {
		        	System.out.println("Turning power off!");
		        }
		        // Send a response with power value back
		        BooleanResponse response = BooleanResponse.newBuilder().setBoolRespVal(turnOn).build(); 

		        responseObserver.onNext(response);
		        responseObserver.onCompleted();
		        
			}
			
			//set destination
			
			
			
			
			
			//Starting the Journey
			public void startJourney(BooleanRequest request, StreamObserver<StringResponse> responseObserver) {
				
				// Print a message stating the function has been invoked
		        System.out.println("Journey started processing next turn events");
		        // Get the switch variable
		        Boolean start = request.getBoolValue();
		        StringResponse response = StringResponse.newBuilder().setStringRespVal("Left").build(); 
		        responseObserver.onNext(response);
		      
		        sleep(3000);
		        StringResponse response2 = StringResponse.newBuilder().setStringRespVal("Right").build(); 
		        responseObserver.onNext(response2);
		       
		        sleep(3000);
		        
		        
				/*
				 * StringResponse response3 =
				 * StringResponse.newBuilder().setStringRespVal("Straight Ahead").build();
				 * Thread.sleep(3000); StringResponse response4 =
				 * StringResponse.newBuilder().setStringRespVal("Back").build();
				 * Thread.sleep(3000); StringResponse response5 =
				 * StringResponse.newBuilder().setStringRespVal("TurnAround").build();
				 * Thread.sleep(3000);
				 */
		        StringResponse response3 = StringResponse.newBuilder().setStringRespVal("Arrived").build();
		        responseObserver.onNext(response3);
		        responseObserver.onCompleted();
				 
		        // Send a response with power value back
		        

		        //responseObserver.onNext(response);
		        //responseObserver.onCompleted();
		        
			}
			
			private static void sleep(long millies) {
				try {
					Thread.sleep(millies);
				} catch (InterruptedException e) {
					System.out.println("Thread is interrupted");
					Thread.currentThread().interrupt();
				}
			}
}
	