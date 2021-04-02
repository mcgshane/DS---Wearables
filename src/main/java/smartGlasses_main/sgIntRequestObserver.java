package smartGlasses_main;

import io.grpc.stub.StreamObserver;
import smartGlasses.sgIntRequest;
import smartGlasses.sgIntResponse;

public class sgIntRequestObserver implements StreamObserver<sgIntRequest> {

    private final int totalDistance = 100;
    private int distanceTraveled;
    private final StreamObserver<sgIntResponse> sgIntResponseStreamObserver;

    public sgIntRequestObserver(StreamObserver<sgIntResponse> tripResponseStreamObserver) {
        this.sgIntResponseStreamObserver = tripResponseStreamObserver;
    }

    @Override
    public void onNext(sgIntRequest tripRequest) {
        this.distanceTraveled = Math.min(totalDistance, (this.distanceTraveled + tripRequest.getIntRequestValue()));
        int remainingDistance = Math.max(0, (totalDistance - distanceTraveled));

        // the client has reached destination
        if(remainingDistance == 0){
            this.sgIntResponseStreamObserver.onNext(sgIntResponse.getDefaultInstance());
            return;
        }

        // client has not yet reached destination
        sgIntResponse newResponseCall = sgIntResponse.newBuilder()
                .setIntResponseValue(remainingDistance)
                .build();
        this.sgIntResponseStreamObserver.onNext(newResponseCall);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        this.sgIntResponseStreamObserver.onCompleted();
        System.out.println("Client reached safely");
    }

}