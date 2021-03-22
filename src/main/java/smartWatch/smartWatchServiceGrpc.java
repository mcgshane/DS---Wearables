package smartWatch;

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
    comments = "Source: smartWatch.proto")
public final class smartWatchServiceGrpc {

  private smartWatchServiceGrpc() {}

  public static final String SERVICE_NAME = "smartWatch.smartWatchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getTurnOnSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnSwitch",
      requestType = smartWatch.BooleanRequest.class,
      responseType = smartWatch.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getTurnOnSwitchMethod() {
    io.grpc.MethodDescriptor<smartWatch.BooleanRequest, smartWatch.BooleanResponse> getTurnOnSwitchMethod;
    if ((getTurnOnSwitchMethod = smartWatchServiceGrpc.getTurnOnSwitchMethod) == null) {
      synchronized (smartWatchServiceGrpc.class) {
        if ((getTurnOnSwitchMethod = smartWatchServiceGrpc.getTurnOnSwitchMethod) == null) {
          smartWatchServiceGrpc.getTurnOnSwitchMethod = getTurnOnSwitchMethod = 
              io.grpc.MethodDescriptor.<smartWatch.BooleanRequest, smartWatch.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartWatch.smartWatchService", "turnOnSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartWatchServiceMethodDescriptorSupplier("turnOnSwitch"))
                  .build();
          }
        }
     }
     return getTurnOnSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartWatch.StringRequest,
      smartWatch.StringResponse> getSetTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTimer",
      requestType = smartWatch.StringRequest.class,
      responseType = smartWatch.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartWatch.StringRequest,
      smartWatch.StringResponse> getSetTimerMethod() {
    io.grpc.MethodDescriptor<smartWatch.StringRequest, smartWatch.StringResponse> getSetTimerMethod;
    if ((getSetTimerMethod = smartWatchServiceGrpc.getSetTimerMethod) == null) {
      synchronized (smartWatchServiceGrpc.class) {
        if ((getSetTimerMethod = smartWatchServiceGrpc.getSetTimerMethod) == null) {
          smartWatchServiceGrpc.getSetTimerMethod = getSetTimerMethod = 
              io.grpc.MethodDescriptor.<smartWatch.StringRequest, smartWatch.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartWatch.smartWatchService", "setTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartWatchServiceMethodDescriptorSupplier("setTimer"))
                  .build();
          }
        }
     }
     return getSetTimerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getStartTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startTimer",
      requestType = smartWatch.BooleanRequest.class,
      responseType = smartWatch.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getStartTimerMethod() {
    io.grpc.MethodDescriptor<smartWatch.BooleanRequest, smartWatch.BooleanResponse> getStartTimerMethod;
    if ((getStartTimerMethod = smartWatchServiceGrpc.getStartTimerMethod) == null) {
      synchronized (smartWatchServiceGrpc.class) {
        if ((getStartTimerMethod = smartWatchServiceGrpc.getStartTimerMethod) == null) {
          smartWatchServiceGrpc.getStartTimerMethod = getStartTimerMethod = 
              io.grpc.MethodDescriptor.<smartWatch.BooleanRequest, smartWatch.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartWatch.smartWatchService", "startTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartWatchServiceMethodDescriptorSupplier("startTimer"))
                  .build();
          }
        }
     }
     return getStartTimerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getPauseTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pauseTimer",
      requestType = smartWatch.BooleanRequest.class,
      responseType = smartWatch.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getPauseTimerMethod() {
    io.grpc.MethodDescriptor<smartWatch.BooleanRequest, smartWatch.BooleanResponse> getPauseTimerMethod;
    if ((getPauseTimerMethod = smartWatchServiceGrpc.getPauseTimerMethod) == null) {
      synchronized (smartWatchServiceGrpc.class) {
        if ((getPauseTimerMethod = smartWatchServiceGrpc.getPauseTimerMethod) == null) {
          smartWatchServiceGrpc.getPauseTimerMethod = getPauseTimerMethod = 
              io.grpc.MethodDescriptor.<smartWatch.BooleanRequest, smartWatch.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartWatch.smartWatchService", "pauseTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartWatchServiceMethodDescriptorSupplier("pauseTimer"))
                  .build();
          }
        }
     }
     return getPauseTimerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getResetTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetTimer",
      requestType = smartWatch.BooleanRequest.class,
      responseType = smartWatch.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartWatch.BooleanRequest,
      smartWatch.BooleanResponse> getResetTimerMethod() {
    io.grpc.MethodDescriptor<smartWatch.BooleanRequest, smartWatch.BooleanResponse> getResetTimerMethod;
    if ((getResetTimerMethod = smartWatchServiceGrpc.getResetTimerMethod) == null) {
      synchronized (smartWatchServiceGrpc.class) {
        if ((getResetTimerMethod = smartWatchServiceGrpc.getResetTimerMethod) == null) {
          smartWatchServiceGrpc.getResetTimerMethod = getResetTimerMethod = 
              io.grpc.MethodDescriptor.<smartWatch.BooleanRequest, smartWatch.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartWatch.smartWatchService", "resetTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartWatch.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartWatchServiceMethodDescriptorSupplier("resetTimer"))
                  .build();
          }
        }
     }
     return getResetTimerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartWatchServiceStub newStub(io.grpc.Channel channel) {
    return new smartWatchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartWatchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartWatchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartWatchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartWatchServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class smartWatchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOnSwitch(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnSwitchMethod(), responseObserver);
    }

    /**
     */
    public void setTimer(smartWatch.StringRequest request,
        io.grpc.stub.StreamObserver<smartWatch.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTimerMethod(), responseObserver);
    }

    /**
     */
    public void startTimer(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartTimerMethod(), responseObserver);
    }

    /**
     */
    public void pauseTimer(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseTimerMethod(), responseObserver);
    }

    /**
     */
    public void resetTimer(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetTimerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartWatch.BooleanRequest,
                smartWatch.BooleanResponse>(
                  this, METHODID_TURN_ON_SWITCH)))
          .addMethod(
            getSetTimerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartWatch.StringRequest,
                smartWatch.StringResponse>(
                  this, METHODID_SET_TIMER)))
          .addMethod(
            getStartTimerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartWatch.BooleanRequest,
                smartWatch.BooleanResponse>(
                  this, METHODID_START_TIMER)))
          .addMethod(
            getPauseTimerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartWatch.BooleanRequest,
                smartWatch.BooleanResponse>(
                  this, METHODID_PAUSE_TIMER)))
          .addMethod(
            getResetTimerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartWatch.BooleanRequest,
                smartWatch.BooleanResponse>(
                  this, METHODID_RESET_TIMER)))
          .build();
    }
  }

  /**
   */
  public static final class smartWatchServiceStub extends io.grpc.stub.AbstractStub<smartWatchServiceStub> {
    private smartWatchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartWatchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartWatchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartWatchServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOnSwitch(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTimer(smartWatch.StringRequest request,
        io.grpc.stub.StreamObserver<smartWatch.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTimerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startTimer(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartTimerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pauseTimer(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseTimerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetTimer(smartWatch.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartWatch.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetTimerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartWatchServiceBlockingStub extends io.grpc.stub.AbstractStub<smartWatchServiceBlockingStub> {
    private smartWatchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartWatchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartWatchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartWatchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartWatch.BooleanResponse turnOnSwitch(smartWatch.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartWatch.StringResponse setTimer(smartWatch.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTimerMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartWatch.BooleanResponse startTimer(smartWatch.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartTimerMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartWatch.BooleanResponse pauseTimer(smartWatch.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauseTimerMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartWatch.BooleanResponse resetTimer(smartWatch.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetTimerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartWatchServiceFutureStub extends io.grpc.stub.AbstractStub<smartWatchServiceFutureStub> {
    private smartWatchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartWatchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartWatchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartWatchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartWatch.BooleanResponse> turnOnSwitch(
        smartWatch.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartWatch.StringResponse> setTimer(
        smartWatch.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTimerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartWatch.BooleanResponse> startTimer(
        smartWatch.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartTimerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartWatch.BooleanResponse> pauseTimer(
        smartWatch.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseTimerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartWatch.BooleanResponse> resetTimer(
        smartWatch.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetTimerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_SWITCH = 0;
  private static final int METHODID_SET_TIMER = 1;
  private static final int METHODID_START_TIMER = 2;
  private static final int METHODID_PAUSE_TIMER = 3;
  private static final int METHODID_RESET_TIMER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartWatchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartWatchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_SWITCH:
          serviceImpl.turnOnSwitch((smartWatch.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartWatch.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_TIMER:
          serviceImpl.setTimer((smartWatch.StringRequest) request,
              (io.grpc.stub.StreamObserver<smartWatch.StringResponse>) responseObserver);
          break;
        case METHODID_START_TIMER:
          serviceImpl.startTimer((smartWatch.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartWatch.BooleanResponse>) responseObserver);
          break;
        case METHODID_PAUSE_TIMER:
          serviceImpl.pauseTimer((smartWatch.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartWatch.BooleanResponse>) responseObserver);
          break;
        case METHODID_RESET_TIMER:
          serviceImpl.resetTimer((smartWatch.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartWatch.BooleanResponse>) responseObserver);
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

  private static abstract class smartWatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartWatchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartWatch.smartWatchImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartWatchService");
    }
  }

  private static final class smartWatchServiceFileDescriptorSupplier
      extends smartWatchServiceBaseDescriptorSupplier {
    smartWatchServiceFileDescriptorSupplier() {}
  }

  private static final class smartWatchServiceMethodDescriptorSupplier
      extends smartWatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartWatchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartWatchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartWatchServiceFileDescriptorSupplier())
              .addMethod(getTurnOnSwitchMethod())
              .addMethod(getSetTimerMethod())
              .addMethod(getStartTimerMethod())
              .addMethod(getPauseTimerMethod())
              .addMethod(getResetTimerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
