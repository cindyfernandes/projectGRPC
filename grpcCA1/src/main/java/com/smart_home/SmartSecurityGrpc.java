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
    comments = "Source: smartSecurity.proto")
public final class SmartSecurityGrpc {

  private SmartSecurityGrpc() {}

  public static final String SERVICE_NAME = "SmartSecurity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartSecurityOuterClass.ArmSystemRequest,
      com.smart_home.SmartSecurityOuterClass.ArmSystemResponse> getArmSystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArmSystem",
      requestType = com.smart_home.SmartSecurityOuterClass.ArmSystemRequest.class,
      responseType = com.smart_home.SmartSecurityOuterClass.ArmSystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartSecurityOuterClass.ArmSystemRequest,
      com.smart_home.SmartSecurityOuterClass.ArmSystemResponse> getArmSystemMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartSecurityOuterClass.ArmSystemRequest, com.smart_home.SmartSecurityOuterClass.ArmSystemResponse> getArmSystemMethod;
    if ((getArmSystemMethod = SmartSecurityGrpc.getArmSystemMethod) == null) {
      synchronized (SmartSecurityGrpc.class) {
        if ((getArmSystemMethod = SmartSecurityGrpc.getArmSystemMethod) == null) {
          SmartSecurityGrpc.getArmSystemMethod = getArmSystemMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartSecurityOuterClass.ArmSystemRequest, com.smart_home.SmartSecurityOuterClass.ArmSystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartSecurity", "ArmSystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartSecurityOuterClass.ArmSystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartSecurityOuterClass.ArmSystemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartSecurityMethodDescriptorSupplier("ArmSystem"))
                  .build();
          }
        }
     }
     return getArmSystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest,
      com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse> getGetSensorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSensorStatus",
      requestType = com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest.class,
      responseType = com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest,
      com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse> getGetSensorStatusMethod() {
    io.grpc.MethodDescriptor<com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest, com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse> getGetSensorStatusMethod;
    if ((getGetSensorStatusMethod = SmartSecurityGrpc.getGetSensorStatusMethod) == null) {
      synchronized (SmartSecurityGrpc.class) {
        if ((getGetSensorStatusMethod = SmartSecurityGrpc.getGetSensorStatusMethod) == null) {
          SmartSecurityGrpc.getGetSensorStatusMethod = getGetSensorStatusMethod = 
              io.grpc.MethodDescriptor.<com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest, com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartSecurity", "GetSensorStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartSecurityMethodDescriptorSupplier("GetSensorStatus"))
                  .build();
          }
        }
     }
     return getGetSensorStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartSecurityStub newStub(io.grpc.Channel channel) {
    return new SmartSecurityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartSecurityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartSecurityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartSecurityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartSecurityFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartSecurityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to arm the security system
     * </pre>
     */
    public void armSystem(com.smart_home.SmartSecurityOuterClass.ArmSystemRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartSecurityOuterClass.ArmSystemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getArmSystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to get the status of a sensor
     * </pre>
     */
    public void getSensorStatus(com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSensorStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getArmSystemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smart_home.SmartSecurityOuterClass.ArmSystemRequest,
                com.smart_home.SmartSecurityOuterClass.ArmSystemResponse>(
                  this, METHODID_ARM_SYSTEM)))
          .addMethod(
            getGetSensorStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest,
                com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse>(
                  this, METHODID_GET_SENSOR_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class SmartSecurityStub extends io.grpc.stub.AbstractStub<SmartSecurityStub> {
    private SmartSecurityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartSecurityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartSecurityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartSecurityStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to arm the security system
     * </pre>
     */
    public void armSystem(com.smart_home.SmartSecurityOuterClass.ArmSystemRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartSecurityOuterClass.ArmSystemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getArmSystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to get the status of a sensor
     * </pre>
     */
    public void getSensorStatus(com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest request,
        io.grpc.stub.StreamObserver<com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSensorStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartSecurityBlockingStub extends io.grpc.stub.AbstractStub<SmartSecurityBlockingStub> {
    private SmartSecurityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartSecurityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartSecurityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartSecurityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to arm the security system
     * </pre>
     */
    public com.smart_home.SmartSecurityOuterClass.ArmSystemResponse armSystem(com.smart_home.SmartSecurityOuterClass.ArmSystemRequest request) {
      return blockingUnaryCall(
          getChannel(), getArmSystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to get the status of a sensor
     * </pre>
     */
    public com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse getSensorStatus(com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSensorStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartSecurityFutureStub extends io.grpc.stub.AbstractStub<SmartSecurityFutureStub> {
    private SmartSecurityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartSecurityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartSecurityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartSecurityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to arm the security system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smart_home.SmartSecurityOuterClass.ArmSystemResponse> armSystem(
        com.smart_home.SmartSecurityOuterClass.ArmSystemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getArmSystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to get the status of a sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse> getSensorStatus(
        com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSensorStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ARM_SYSTEM = 0;
  private static final int METHODID_GET_SENSOR_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartSecurityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartSecurityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ARM_SYSTEM:
          serviceImpl.armSystem((com.smart_home.SmartSecurityOuterClass.ArmSystemRequest) request,
              (io.grpc.stub.StreamObserver<com.smart_home.SmartSecurityOuterClass.ArmSystemResponse>) responseObserver);
          break;
        case METHODID_GET_SENSOR_STATUS:
          serviceImpl.getSensorStatus((com.smart_home.SmartSecurityOuterClass.GetSensorStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.smart_home.SmartSecurityOuterClass.GetSensorStatusResponse>) responseObserver);
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

  private static abstract class SmartSecurityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartSecurityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smart_home.SmartSecurityOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartSecurity");
    }
  }

  private static final class SmartSecurityFileDescriptorSupplier
      extends SmartSecurityBaseDescriptorSupplier {
    SmartSecurityFileDescriptorSupplier() {}
  }

  private static final class SmartSecurityMethodDescriptorSupplier
      extends SmartSecurityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartSecurityMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartSecurityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartSecurityFileDescriptorSupplier())
              .addMethod(getArmSystemMethod())
              .addMethod(getGetSensorStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
