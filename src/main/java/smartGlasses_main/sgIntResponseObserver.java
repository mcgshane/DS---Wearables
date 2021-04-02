package smartGlasses_main;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.Uninterruptibles;
import io.grpc.stub.StreamObserver;
import smartGlasses.sgIntRequest;
import smartGlasses.sgIntResponse;

public class sgIntResponseObserver implements StreamObserver<sgIntResponse> {

    private StreamObserver<sgIntRequest> requestStreamObserver;

    @Override
    public void onNext(sgIntResponse disResp) {
       if(disResp.getIntResponseValue() > 0){
           System.out.println("Remaining Distance : " + disResp.getIntResponseValue());
           this.drive();
       }else{
           this.requestStreamObserver.onCompleted();
       }
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        System.out.println("Trip Completed");
    }

    public void startTrip(StreamObserver<sgIntRequest> requestStreamObserver){
        this.requestStreamObserver = requestStreamObserver;
        this.drive();
    }

    private void drive(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        sgIntRequest newRequest = sgIntRequest.newBuilder().setIntRequestValue(ThreadLocalRandom.current().nextInt(1, 10)).build();
        requestStreamObserver.onNext(newRequest);
    }


}