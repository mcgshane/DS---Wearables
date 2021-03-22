package smartWatch;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smartWatch.smartWatchServiceGrpc.smartWatchServiceImplBase;

public class smartWatchServer extends smartWatchServiceImplBase{
	
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
        Boolean turnOn = request.getBooleanVal();
        if (turnOn) {
        	System.out.println("Turning power on!");
        }
        else {
        	System.out.println("Turning power off!");
        }
        // Send a response with power value back
        BooleanResponse response = BooleanResponse.newBuilder().setBooleanRepVal(turnOn).build(); 

        responseObserver.onNext(response);
        responseObserver.onCompleted();
        
	}
	

}