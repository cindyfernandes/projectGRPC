package com.smart_home;

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
    comments = "Source: SmartThermostat.proto")
public final class SmartThermostatGrpc {

  private SmartThermostatGrpc() {}

  public static final String SERVICE_NAME = "SmartThermostat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest,
      com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse> getGetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemperature",
      requestType = com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest.class,
      responseType = com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest,
      com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse> getGetTemperatureMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest, com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse> getGetTemperatureMethod;
    if ((getGetTemperatureMethod = SmartThermostatGrpc.getGetTemperatureMethod) == null) {
      synchronized (SmartThermostatGrpc.class) {
        if ((getGetTemperatureMethod = SmartThermostatGrpc.getGetTemperatureMethod) == null) {
          SmartThermostatGrpc.getGetTemperatureMethod = getGetTemperatureMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest, com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartThermostat", "GetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartThermostatMethodDescriptorSupplier("GetTemperature"))
                  .build();
          }
        }
     }
     return getGetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest,
      com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse> getSetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemperature",
      requestType = com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest.class,
      responseType = com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest,
      com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse> getSetTemperatureMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest, com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse> getSetTemperatureMethod;
    if ((getSetTemperatureMethod = SmartThermostatGrpc.getSetTemperatureMethod) == null) {
      synchronized (SmartThermostatGrpc.class) {
        if ((getSetTemperatureMethod = SmartThermostatGrpc.getSetTemperatureMethod) == null) {
          SmartThermostatGrpc.getSetTemperatureMethod = getSetTemperatureMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest, com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartThermostat", "SetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartThermostatMethodDescriptorSupplier("SetTemperature"))
                  .build();
          }
        }
     }
     return getSetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest,
      com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse> getAdjustTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustTemperature",
      requestType = com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest.class,
      responseType = com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest,
      com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse> getAdjustTemperatureMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest, com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse> getAdjustTemperatureMethod;
    if ((getAdjustTemperatureMethod = SmartThermostatGrpc.getAdjustTemperatureMethod) == null) {
      synchronized (SmartThermostatGrpc.class) {
        if ((getAdjustTemperatureMethod = SmartThermostatGrpc.getAdjustTemperatureMethod) == null) {
          SmartThermostatGrpc.getAdjustTemperatureMethod = getAdjustTemperatureMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest, com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartThermostat", "AdjustTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartThermostatMethodDescriptorSupplier("AdjustTemperature"))
                  .build();
          }
        }
     }
     return getAdjustTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartThermostatStub newStub(io.grpc.Channel channel) {
    return new SmartThermostatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartThermostatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartThermostatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartThermostatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartThermostatFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartThermostatImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to get the current temperature
     * </pre>
     */
    public void getTemperature(com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to set a specific temperature
     * </pre>
     */
    public void setTemperature(com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC method to adjust the temperature
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest> adjustTemperature(
        io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAdjustTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest,
                com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse>(
                  this, METHODID_GET_TEMPERATURE)))
          .addMethod(
            getSetTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest,
                com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse>(
                  this, METHODID_SET_TEMPERATURE)))
          .addMethod(
            getAdjustTemperatureMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest,
                com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse>(
                  this, METHODID_ADJUST_TEMPERATURE)))
          .build();
    }
  }

  /**
   */
  public static final class SmartThermostatStub extends io.grpc.stub.AbstractStub<SmartThermostatStub> {
    private SmartThermostatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartThermostatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartThermostatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartThermostatStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get the current temperature
     * </pre>
     */
    public void getTemperature(com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to set a specific temperature
     * </pre>
     */
    public void setTemperature(com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC method to adjust the temperature
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureRequest> adjustTemperature(
        io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmartThermostatBlockingStub extends io.grpc.stub.AbstractStub<SmartThermostatBlockingStub> {
    private SmartThermostatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartThermostatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartThermostatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartThermostatBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get the current temperature
     * </pre>
     */
    public com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse getTemperature(com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to set a specific temperature
     * </pre>
     */
    public com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse setTemperature(com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartThermostatFutureStub extends io.grpc.stub.AbstractStub<SmartThermostatFutureStub> {
    private SmartThermostatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartThermostatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartThermostatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartThermostatFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get the current temperature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse> getTemperature(
        com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to set a specific temperature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse> setTemperature(
        com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEMPERATURE = 0;
  private static final int METHODID_SET_TEMPERATURE = 1;
  private static final int METHODID_ADJUST_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartThermostatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartThermostatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEMPERATURE:
          serviceImpl.getTemperature((com.smart_home.SmartThermostatOuterClass.GetTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.GetTemperatureResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPERATURE:
          serviceImpl.setTemperature((com.smart_home.SmartThermostatOuterClass.SetTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.SetTemperatureResponse>) responseObserver);
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
        case METHODID_ADJUST_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustTemperature(
              (io.grpc.stub.StreamObserver<com.smart_home.SmartThermostatOuterClass.AdjustTemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartThermostatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartThermostatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smart_home.SmartThermostatOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartThermostat");
    }
  }

  private static final class SmartThermostatFileDescriptorSupplier
      extends SmartThermostatBaseDescriptorSupplier {
    SmartThermostatFileDescriptorSupplier() {}
  }

  private static final class SmartThermostatMethodDescriptorSupplier
      extends SmartThermostatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartThermostatMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartThermostatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartThermostatFileDescriptorSupplier())
              .addMethod(getGetTemperatureMethod())
              .addMethod(getSetTemperatureMethod())
              .addMethod(getAdjustTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
