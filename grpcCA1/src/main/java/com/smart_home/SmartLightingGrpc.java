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
    comments = "Source: SmartLighting.proto")
public final class SmartLightingGrpc {

  private SmartLightingGrpc() {}

  public static final String SERVICE_NAME = "SmartLighting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartLightingOuterClass.ToggleLightRequest,
      com.smart_home.SmartLightingOuterClass.ToggleLightResponse> getToggleLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleLight",
      requestType = com.smart_home.SmartLightingOuterClass.ToggleLightRequest.class,
      responseType = com.smart_home.SmartLightingOuterClass.ToggleLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartLightingOuterClass.ToggleLightRequest,
      com.smart_home.SmartLightingOuterClass.ToggleLightResponse> getToggleLightMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartLightingOuterClass.ToggleLightRequest, com.smart_home.SmartLightingOuterClass.ToggleLightResponse> getToggleLightMethod;
    if ((getToggleLightMethod = SmartLightingGrpc.getToggleLightMethod) == null) {
      synchronized (SmartLightingGrpc.class) {
        if ((getToggleLightMethod = SmartLightingGrpc.getToggleLightMethod) == null) {
          SmartLightingGrpc.getToggleLightMethod = getToggleLightMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartLightingOuterClass.ToggleLightRequest, com.smart_home.SmartLightingOuterClass.ToggleLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartLighting", "ToggleLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartLightingOuterClass.ToggleLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartLightingOuterClass.ToggleLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightingMethodDescriptorSupplier("ToggleLight"))
                  .build();
          }
        }
     }
     return getToggleLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartLightingOuterClass.SetScheduleRequest,
      com.smart_home.SmartLightingOuterClass.SetScheduleResponse> getSetScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSchedule",
      requestType = com.smart_home.SmartLightingOuterClass.SetScheduleRequest.class,
      responseType = com.smart_home.SmartLightingOuterClass.SetScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartLightingOuterClass.SetScheduleRequest,
      com.smart_home.SmartLightingOuterClass.SetScheduleResponse> getSetScheduleMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartLightingOuterClass.SetScheduleRequest, com.smart_home.SmartLightingOuterClass.SetScheduleResponse> getSetScheduleMethod;
    if ((getSetScheduleMethod = SmartLightingGrpc.getSetScheduleMethod) == null) {
      synchronized (SmartLightingGrpc.class) {
        if ((getSetScheduleMethod = SmartLightingGrpc.getSetScheduleMethod) == null) {
          SmartLightingGrpc.getSetScheduleMethod = getSetScheduleMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartLightingOuterClass.SetScheduleRequest, com.smart_home.SmartLightingOuterClass.SetScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartLighting", "SetSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartLightingOuterClass.SetScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartLightingOuterClass.SetScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightingMethodDescriptorSupplier("SetSchedule"))
                  .build();
          }
        }
     }
     return getSetScheduleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLightingStub newStub(io.grpc.Channel channel) {
    return new SmartLightingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLightingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartLightingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLightingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartLightingFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartLightingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary RPC method
     * </pre>
     */
    public void toggleLight(com.smart_home.SmartLightingOuterClass.ToggleLightRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.ToggleLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleLightMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unary RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.SetScheduleRequest> setSchedule(
        io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.SetScheduleResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetScheduleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getToggleLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smart_home.SmartLightingOuterClass.ToggleLightRequest,
                com.smart_home.SmartLightingOuterClass.ToggleLightResponse>(
                  this, METHODID_TOGGLE_LIGHT)))
          .addMethod(
            getSetScheduleMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.smart_home.SmartLightingOuterClass.SetScheduleRequest,
                com.smart_home.SmartLightingOuterClass.SetScheduleResponse>(
                  this, METHODID_SET_SCHEDULE)))
          .build();
    }
  }

  /**
   */
  public static final class SmartLightingStub extends io.grpc.stub.AbstractStub<SmartLightingStub> {
    private SmartLightingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartLightingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartLightingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC method
     * </pre>
     */
    public void toggleLight(com.smart_home.SmartLightingOuterClass.ToggleLightRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.ToggleLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unary RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.SetScheduleRequest> setSchedule(
        io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.SetScheduleResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSetScheduleMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmartLightingBlockingStub extends io.grpc.stub.AbstractStub<SmartLightingBlockingStub> {
    private SmartLightingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartLightingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartLightingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC method
     * </pre>
     */
    public com.smart_home.SmartLightingOuterClass.ToggleLightResponse toggleLight(com.smart_home.SmartLightingOuterClass.ToggleLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getToggleLightMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartLightingFutureStub extends io.grpc.stub.AbstractStub<SmartLightingFutureStub> {
    private SmartLightingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartLightingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartLightingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smart_home.SmartLightingOuterClass.ToggleLightResponse> toggleLight(
        com.smart_home.SmartLightingOuterClass.ToggleLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleLightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOGGLE_LIGHT = 0;
  private static final int METHODID_SET_SCHEDULE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartLightingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartLightingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOGGLE_LIGHT:
          serviceImpl.toggleLight((com.smart_home.SmartLightingOuterClass.ToggleLightRequest) request,
              (io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.ToggleLightResponse>) responseObserver);
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
        case METHODID_SET_SCHEDULE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setSchedule(
              (io.grpc.stub.StreamObserver<com.smart_home.SmartLightingOuterClass.SetScheduleResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartLightingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLightingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smart_home.SmartLightingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLighting");
    }
  }

  private static final class SmartLightingFileDescriptorSupplier
      extends SmartLightingBaseDescriptorSupplier {
    SmartLightingFileDescriptorSupplier() {}
  }

  private static final class SmartLightingMethodDescriptorSupplier
      extends SmartLightingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartLightingMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartLightingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLightingFileDescriptorSupplier())
              .addMethod(getToggleLightMethod())
              .addMethod(getSetScheduleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
