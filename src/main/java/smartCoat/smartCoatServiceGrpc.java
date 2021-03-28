package smartCoat;

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
    comments = "Source: smartCoat.proto")
public final class smartCoatServiceGrpc {

  private smartCoatServiceGrpc() {}

  public static final String SERVICE_NAME = "smartCoat.smartCoatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartCoat.BooleanRequest,
      smartCoat.BooleanResponse> getTurnOnSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnSwitch",
      requestType = smartCoat.BooleanRequest.class,
      responseType = smartCoat.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartCoat.BooleanRequest,
      smartCoat.BooleanResponse> getTurnOnSwitchMethod() {
    io.grpc.MethodDescriptor<smartCoat.BooleanRequest, smartCoat.BooleanResponse> getTurnOnSwitchMethod;
    if ((getTurnOnSwitchMethod = smartCoatServiceGrpc.getTurnOnSwitchMethod) == null) {
      synchronized (smartCoatServiceGrpc.class) {
        if ((getTurnOnSwitchMethod = smartCoatServiceGrpc.getTurnOnSwitchMethod) == null) {
          smartCoatServiceGrpc.getTurnOnSwitchMethod = getTurnOnSwitchMethod = 
              io.grpc.MethodDescriptor.<smartCoat.BooleanRequest, smartCoat.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartCoat.smartCoatService", "turnOnSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartCoat.BooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartCoat.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartCoatServiceMethodDescriptorSupplier("turnOnSwitch"))
                  .build();
          }
        }
     }
     return getTurnOnSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartCoat.IntRequest,
      smartCoat.StringResponse> getSetTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTemp",
      requestType = smartCoat.IntRequest.class,
      responseType = smartCoat.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartCoat.IntRequest,
      smartCoat.StringResponse> getSetTempMethod() {
    io.grpc.MethodDescriptor<smartCoat.IntRequest, smartCoat.StringResponse> getSetTempMethod;
    if ((getSetTempMethod = smartCoatServiceGrpc.getSetTempMethod) == null) {
      synchronized (smartCoatServiceGrpc.class) {
        if ((getSetTempMethod = smartCoatServiceGrpc.getSetTempMethod) == null) {
          smartCoatServiceGrpc.getSetTempMethod = getSetTempMethod = 
              io.grpc.MethodDescriptor.<smartCoat.IntRequest, smartCoat.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartCoat.smartCoatService", "setTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartCoat.IntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartCoat.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartCoatServiceMethodDescriptorSupplier("setTemp"))
                  .build();
          }
        }
     }
     return getSetTempMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartCoatServiceStub newStub(io.grpc.Channel channel) {
    return new smartCoatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartCoatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartCoatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartCoatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartCoatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class smartCoatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOnSwitch(smartCoat.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartCoat.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnSwitchMethod(), responseObserver);
    }

    /**
     */
    public void setTemp(smartCoat.IntRequest request,
        io.grpc.stub.StreamObserver<smartCoat.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartCoat.BooleanRequest,
                smartCoat.BooleanResponse>(
                  this, METHODID_TURN_ON_SWITCH)))
          .addMethod(
            getSetTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartCoat.IntRequest,
                smartCoat.StringResponse>(
                  this, METHODID_SET_TEMP)))
          .build();
    }
  }

  /**
   */
  public static final class smartCoatServiceStub extends io.grpc.stub.AbstractStub<smartCoatServiceStub> {
    private smartCoatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartCoatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartCoatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartCoatServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOnSwitch(smartCoat.BooleanRequest request,
        io.grpc.stub.StreamObserver<smartCoat.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTemp(smartCoat.IntRequest request,
        io.grpc.stub.StreamObserver<smartCoat.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartCoatServiceBlockingStub extends io.grpc.stub.AbstractStub<smartCoatServiceBlockingStub> {
    private smartCoatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartCoatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartCoatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartCoatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartCoat.BooleanResponse turnOnSwitch(smartCoat.BooleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartCoat.StringResponse setTemp(smartCoat.IntRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartCoatServiceFutureStub extends io.grpc.stub.AbstractStub<smartCoatServiceFutureStub> {
    private smartCoatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartCoatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartCoatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartCoatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartCoat.BooleanResponse> turnOnSwitch(
        smartCoat.BooleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartCoat.StringResponse> setTemp(
        smartCoat.IntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_SWITCH = 0;
  private static final int METHODID_SET_TEMP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartCoatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartCoatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_SWITCH:
          serviceImpl.turnOnSwitch((smartCoat.BooleanRequest) request,
              (io.grpc.stub.StreamObserver<smartCoat.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP:
          serviceImpl.setTemp((smartCoat.IntRequest) request,
              (io.grpc.stub.StreamObserver<smartCoat.StringResponse>) responseObserver);
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

  private static abstract class smartCoatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartCoatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartCoat.smartCoatImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartCoatService");
    }
  }

  private static final class smartCoatServiceFileDescriptorSupplier
      extends smartCoatServiceBaseDescriptorSupplier {
    smartCoatServiceFileDescriptorSupplier() {}
  }

  private static final class smartCoatServiceMethodDescriptorSupplier
      extends smartCoatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartCoatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartCoatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartCoatServiceFileDescriptorSupplier())
              .addMethod(getTurnOnSwitchMethod())
              .addMethod(getSetTempMethod())
              .build();
        }
      }
    }
    return result;
  }
}
