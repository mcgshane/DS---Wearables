package smartGlasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smartGlasses.proto")
public final class smartGlassesServiceGrpc {

  private smartGlassesServiceGrpc() {}

  public static final String SERVICE_NAME = "smartGlasses.smartGlassesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartGlasses.sgBooleanRequest,
      smartGlasses.sgBooleanResponse> getTurnOnGlassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnGlasses",
      requestType = smartGlasses.sgBooleanRequest.class,
      responseType = smartGlasses.sgBooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.sgBooleanRequest,
      smartGlasses.sgBooleanResponse> getTurnOnGlassesMethod() {
    io.grpc.MethodDescriptor<smartGlasses.sgBooleanRequest, smartGlasses.sgBooleanResponse> getTurnOnGlassesMethod;
    if ((getTurnOnGlassesMethod = smartGlassesServiceGrpc.getTurnOnGlassesMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getTurnOnGlassesMethod = smartGlassesServiceGrpc.getTurnOnGlassesMethod) == null) {
          smartGlassesServiceGrpc.getTurnOnGlassesMethod = getTurnOnGlassesMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.sgBooleanRequest, smartGlasses.sgBooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "turnOnGlasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgBooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgBooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("turnOnGlasses"))
                  .build();
          }
        }
     }
     return getTurnOnGlassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.sgIntRequest,
      smartGlasses.sgBooleanResponse> getSetDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setDestination",
      requestType = smartGlasses.sgIntRequest.class,
      responseType = smartGlasses.sgBooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.sgIntRequest,
      smartGlasses.sgBooleanResponse> getSetDestinationMethod() {
    io.grpc.MethodDescriptor<smartGlasses.sgIntRequest, smartGlasses.sgBooleanResponse> getSetDestinationMethod;
    if ((getSetDestinationMethod = smartGlassesServiceGrpc.getSetDestinationMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getSetDestinationMethod = smartGlassesServiceGrpc.getSetDestinationMethod) == null) {
          smartGlassesServiceGrpc.getSetDestinationMethod = getSetDestinationMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.sgIntRequest, smartGlasses.sgBooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "setDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgBooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("setDestination"))
                  .build();
          }
        }
     }
     return getSetDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.sgBooleanRequest,
      smartGlasses.sgStringResponse> getStartJourneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startJourney",
      requestType = smartGlasses.sgBooleanRequest.class,
      responseType = smartGlasses.sgStringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smartGlasses.sgBooleanRequest,
      smartGlasses.sgStringResponse> getStartJourneyMethod() {
    io.grpc.MethodDescriptor<smartGlasses.sgBooleanRequest, smartGlasses.sgStringResponse> getStartJourneyMethod;
    if ((getStartJourneyMethod = smartGlassesServiceGrpc.getStartJourneyMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getStartJourneyMethod = smartGlassesServiceGrpc.getStartJourneyMethod) == null) {
          smartGlassesServiceGrpc.getStartJourneyMethod = getStartJourneyMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.sgBooleanRequest, smartGlasses.sgStringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "startJourney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgBooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgStringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("startJourney"))
                  .build();
          }
        }
     }
     return getStartJourneyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.sgIntRequest,
      smartGlasses.sgIntResponse> getDistanceLeftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "distanceLeft",
      requestType = smartGlasses.sgIntRequest.class,
      responseType = smartGlasses.sgIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<smartGlasses.sgIntRequest,
      smartGlasses.sgIntResponse> getDistanceLeftMethod() {
    io.grpc.MethodDescriptor<smartGlasses.sgIntRequest, smartGlasses.sgIntResponse> getDistanceLeftMethod;
    if ((getDistanceLeftMethod = smartGlassesServiceGrpc.getDistanceLeftMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getDistanceLeftMethod = smartGlassesServiceGrpc.getDistanceLeftMethod) == null) {
          smartGlassesServiceGrpc.getDistanceLeftMethod = getDistanceLeftMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.sgIntRequest, smartGlasses.sgIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "distanceLeft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.sgIntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("distanceLeft"))
                  .build();
          }
        }
     }
     return getDistanceLeftMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartGlassesServiceStub newStub(io.grpc.Channel channel) {
    return new smartGlassesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartGlassesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartGlassesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartGlassesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartGlassesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class smartGlassesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOnGlasses(smartGlasses.sgBooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.sgBooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnGlassesMethod(), responseObserver);
    }

    /**
     */
    public void setDestination(smartGlasses.sgIntRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.sgBooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDestinationMethod(), responseObserver);
    }

    /**
     */
    public void startJourney(smartGlasses.sgBooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.sgStringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartJourneyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<smartGlasses.sgIntRequest> distanceLeft(
        io.grpc.stub.StreamObserver<smartGlasses.sgIntResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDistanceLeftMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnGlassesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.sgBooleanRequest,
                smartGlasses.sgBooleanResponse>(
                  this, METHODID_TURN_ON_GLASSES)))
          .addMethod(
            getSetDestinationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.sgIntRequest,
                smartGlasses.sgBooleanResponse>(
                  this, METHODID_SET_DESTINATION)))
          .addMethod(
            getStartJourneyMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                smartGlasses.sgBooleanRequest,
                smartGlasses.sgStringResponse>(
                  this, METHODID_START_JOURNEY)))
          .addMethod(
            getDistanceLeftMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                smartGlasses.sgIntRequest,
                smartGlasses.sgIntResponse>(
                  this, METHODID_DISTANCE_LEFT)))
          .build();
    }
  }

  /**
   */
  public static final class smartGlassesServiceStub extends io.grpc.stub.AbstractStub<smartGlassesServiceStub> {
    private smartGlassesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartGlassesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartGlassesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartGlassesServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOnGlasses(smartGlasses.sgBooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.sgBooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnGlassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDestination(smartGlasses.sgIntRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.sgBooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startJourney(smartGlasses.sgBooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.sgStringResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStartJourneyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<smartGlasses.sgIntRequest> distanceLeft(
        io.grpc.stub.StreamObserver<smartGlasses.sgIntResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDistanceLeftMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class smartGlassesServiceBlockingStub extends io.grpc.stub.AbstractStub<smartGlassesServiceBlockingStub> {
    private smartGlassesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartGlassesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartGlassesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartGlassesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartGlasses.sgBooleanResponse turnOnGlasses(smartGlasses.sgBooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnGlassesMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartGlasses.sgBooleanResponse setDestination(smartGlasses.sgIntRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetDestinationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<smartGlasses.sgStringResponse> startJourney(
        smartGlasses.sgBooleanRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStartJourneyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartGlassesServiceFutureStub extends io.grpc.stub.AbstractStub<smartGlassesServiceFutureStub> {
    private smartGlassesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartGlassesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartGlassesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartGlassesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.sgBooleanResponse> turnOnGlasses(
        smartGlasses.sgBooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnGlassesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.sgBooleanResponse> setDestination(
        smartGlasses.sgIntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDestinationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_GLASSES = 0;
  private static final int METHODID_SET_DESTINATION = 1;
  private static final int METHODID_START_JOURNEY = 2;
  private static final int METHODID_DISTANCE_LEFT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartGlassesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartGlassesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_GLASSES:
          serviceImpl.turnOnGlasses((smartGlasses.sgBooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.sgBooleanResponse>) responseObserver);
          break;
        case METHODID_SET_DESTINATION:
          serviceImpl.setDestination((smartGlasses.sgIntRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.sgBooleanResponse>) responseObserver);
          break;
        case METHODID_START_JOURNEY:
          serviceImpl.startJourney((smartGlasses.sgBooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.sgStringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISTANCE_LEFT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.distanceLeft(
              (io.grpc.stub.StreamObserver<smartGlasses.sgIntResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class smartGlassesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartGlassesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartGlasses.smartGlassesImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartGlassesService");
    }
  }

  private static final class smartGlassesServiceFileDescriptorSupplier
      extends smartGlassesServiceBaseDescriptorSupplier {
    smartGlassesServiceFileDescriptorSupplier() {}
  }

  private static final class smartGlassesServiceMethodDescriptorSupplier
      extends smartGlassesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartGlassesServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartGlassesServiceFileDescriptorSupplier())
              .addMethod(getTurnOnGlassesMethod())
              .addMethod(getSetDestinationMethod())
              .addMethod(getStartJourneyMethod())
              .addMethod(getDistanceLeftMethod())
              .build();
        }
      }
    }
    return result;
  }
}
