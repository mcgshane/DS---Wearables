package smartWatch;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smartWatch.smartWatchServiceGrpc.smartWatchServiceImplBase;

public class smartWatchServer extends smartWatchServiceImplBase{
	private int swTimer = 0;
	private StringResponse swResponse;
	
	public static final Logger logger = Logger.getLogger(smartWatchServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Create a server with the port of 52025
		smartWatchServer smartWatchServer = new smartWatchServer();
	   
	    int port = 52025;
	    Server server = ServerBuilder.forPort(port)
	        .addService(smartWatchServer)
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
	
	//Set The Timer
	public void setTimer(IntRequest request, StreamObserver<StringResponse> responseObserver ) {
        //get value from client and respond
		String swTimer = String.valueOf( request.getIntValue());
		System.out.println("Server is setting timer");
	
		StringResponse swResponse = StringResponse.newBuilder().setStringRespVal("The timer has been set to  " + swTimer).build();
		System.out.println("Server has set timer");
       responseObserver.onNext(swResponse);
        responseObserver.onCompleted();
	}
	
	//Starting the Timer
		public void startTimer(BooleanRequest request, StreamObserver<BooleanResponse> responseObserver) {
			
			// Print a message stating the function has been invoked
	        System.out.println("Timer is ready to begin");
	        // Get the switch variable
	        Boolean start = request.getBoolValue();
	        if (start) {
	        	System.out.println("The timer has started");
	        }
	        else {
	        	System.out.println("The timer has been stopped");
	        }
	        // Send a response with power value back
	        BooleanResponse response = BooleanResponse.newBuilder().setBoolRespVal(start).build(); 

	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	        
		}
		//Reset the Timer
				public void resetTimer(BooleanRequest request, StreamObserver<BooleanResponse> responseObserver) {
					
					// Print a message stating the function has been invoked
			        System.out.println("Timer is currently running");
			        // Get the switch variable
			        Boolean reset = request.getBoolValue();
			        if (reset) {
			        	System.out.println("The timer has been reset");
			        }
			        // Send a response with power value back
			        BooleanResponse response = BooleanResponse.newBuilder().setBoolRespVal(reset).build(); 

			        responseObserver.onNext(response);
			        responseObserver.onCompleted();
			        
				}
				
				
				
		
	
}

