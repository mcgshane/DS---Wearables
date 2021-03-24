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
  private static volatile io.grpc.MethodDescriptor<smartGlasses.BooleanRequest,
      smartGlasses.BooleanResponse> getTurnOnSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnSwitch",
      requestType = smartGlasses.BooleanRequest.class,
      responseType = smartGlasses.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.BooleanRequest,
      smartGlasses.BooleanResponse> getTurnOnSwitchMethod() {
    io.grpc.MethodDescriptor<smartGlasses.BooleanRequest, smartGlasses.BooleanResponse> getTurnOnSwitchMethod;
    if ((getTurnOnSwitchMethod = smartGlassesServiceGrpc.getTurnOnSwitchMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getTurnOnSwitchMethod = smartGlassesServiceGrpc.getTurnOnSwitchMethod) == null) {
          smartGlassesServiceGrpc.getTurnOnSwitchMethod = getTurnOnSwitchMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.BooleanRequest, smartGlasses.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "turnOnSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("turnOnSwitch"))
                  .build();
          }
        }
     }
     return getTurnOnSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.StringRequest,
      smartGlasses.StringResponse> getSetDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setDestination",
      requestType = smartGlasses.StringRequest.class,
      responseType = smartGlasses.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.StringRequest,
      smartGlasses.StringResponse> getSetDestinationMethod() {
    io.grpc.MethodDescriptor<smartGlasses.StringRequest, smartGlasses.StringResponse> getSetDestinationMethod;
    if ((getSetDestinationMethod = smartGlassesServiceGrpc.getSetDestinationMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getSetDestinationMethod = smartGlassesServiceGrpc.getSetDestinationMethod) == null) {
          smartGlassesServiceGrpc.getSetDestinationMethod = getSetDestinationMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.StringRequest, smartGlasses.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "setDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("setDestination"))
                  .build();
          }
        }
     }
     return getSetDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.BooleanRequest,
      smartGlasses.StringResponse> getStartJourneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startJourney",
      requestType = smartGlasses.BooleanRequest.class,
      responseType = smartGlasses.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.BooleanRequest,
      smartGlasses.StringResponse> getStartJourneyMethod() {
    io.grpc.MethodDescriptor<smartGlasses.BooleanRequest, smartGlasses.StringResponse> getStartJourneyMethod;
    if ((getStartJourneyMethod = smartGlassesServiceGrpc.getStartJourneyMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getStartJourneyMethod = smartGlassesServiceGrpc.getStartJourneyMethod) == null) {
          smartGlassesServiceGrpc.getStartJourneyMethod = getStartJourneyMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.BooleanRequest, smartGlasses.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "startJourney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("startJourney"))
                  .build();
          }
        }
     }
     return getStartJourneyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.StringRequest,
      smartGlasses.StringResponse> getFinalDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "finalDestination",
      requestType = smartGlasses.StringRequest.class,
      responseType = smartGlasses.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.StringRequest,
      smartGlasses.StringResponse> getFinalDestinationMethod() {
    io.grpc.MethodDescriptor<smartGlasses.StringRequest, smartGlasses.StringResponse> getFinalDestinationMethod;
    if ((getFinalDestinationMethod = smartGlassesServiceGrpc.getFinalDestinationMethod) == null) {
      synchronized (smartGlassesServiceGrpc.class) {
        if ((getFinalDestinationMethod = smartGlassesServiceGrpc.getFinalDestinationMethod) == null) {
          smartGlassesServiceGrpc.getFinalDestinationMethod = getFinalDestinationMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.StringRequest, smartGlasses.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartGlasses.smartGlassesService", "finalDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartGlassesServiceMethodDescriptorSupplier("finalDestination"))
                  .build();
          }
        }
     }
     return getFinalDestinationMethod;
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
    public void turnOnSwitch(smartGlasses.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnSwitchMethod(), responseObserver);
    }

    /**
     */
    public void setDestination(smartGlasses.StringRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDestinationMethod(), responseObserver);
    }

    /**
     */
    public void startJourney(smartGlasses.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartJourneyMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc nextTurn (StringRequest) returns (StringResponse){}
     * </pre>
     */
    public void finalDestination(smartGlasses.StringRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFinalDestinationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.BooleanRequest,
                smartGlasses.BooleanResponse>(
                  this, METHODID_TURN_ON_SWITCH)))
          .addMethod(
            getSetDestinationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.StringRequest,
                smartGlasses.StringResponse>(
                  this, METHODID_SET_DESTINATION)))
          .addMethod(
            getStartJourneyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.BooleanRequest,
                smartGlasses.StringResponse>(
                  this, METHODID_START_JOURNEY)))
          .addMethod(
            getFinalDestinationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.StringRequest,
                smartGlasses.StringResponse>(
                  this, METHODID_FINAL_DESTINATION)))
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
    public void turnOnSwitch(smartGlasses.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDestination(smartGlasses.StringRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startJourney(smartGlasses.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartJourneyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc nextTurn (StringRequest) returns (StringResponse){}
     * </pre>
     */
    public void finalDestination(smartGlasses.StringRequest request,
        io.grpc.stub.StreamObserver<smartGlasses.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinalDestinationMethod(), getCallOptions()), request, responseObserver);
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
    public smartGlasses.BooleanResponse turnOnSwitch(smartGlasses.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartGlasses.StringResponse setDestination(smartGlasses.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetDestinationMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartGlasses.StringResponse startJourney(smartGlasses.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartJourneyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc nextTurn (StringRequest) returns (StringResponse){}
     * </pre>
     */
    public smartGlasses.StringResponse finalDestination(smartGlasses.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getFinalDestinationMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.BooleanResponse> turnOnSwitch(
        smartGlasses.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.StringResponse> setDestination(
        smartGlasses.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDestinationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.StringResponse> startJourney(
        smartGlasses.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartJourneyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *rpc nextTurn (StringRequest) returns (StringResponse){}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.StringResponse> finalDestination(
        smartGlasses.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFinalDestinationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_SWITCH = 0;
  private static final int METHODID_SET_DESTINATION = 1;
  private static final int METHODID_START_JOURNEY = 2;
  private static final int METHODID_FINAL_DESTINATION = 3;

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
        case METHODID_TURN_ON_SWITCH:
          serviceImpl.turnOnSwitch((smartGlasses.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_DESTINATION:
          serviceImpl.setDestination((smartGlasses.StringRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.StringResponse>) responseObserver);
          break;
        case METHODID_START_JOURNEY:
          serviceImpl.startJourney((smartGlasses.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.StringResponse>) responseObserver);
          break;
        case METHODID_FINAL_DESTINATION:
          serviceImpl.finalDestination((smartGlasses.StringRequest) request,
              (io.grpc.stub.StreamObserver<smartGlasses.StringResponse>) responseObserver);
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
              .addMethod(getTurnOnSwitchMethod())
              .addMethod(getSetDestinationMethod())
              .addMethod(getStartJourneyMethod())
              .addMethod(getFinalDestinationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
