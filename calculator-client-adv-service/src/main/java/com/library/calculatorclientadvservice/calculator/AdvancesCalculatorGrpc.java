package com.library.calculatorclientadvservice.calculator;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.*;
import io.grpc.protobuf.ProtoFileDescriptorSupplier;
import io.grpc.protobuf.ProtoMethodDescriptorSupplier;
import io.grpc.protobuf.ProtoServiceDescriptorSupplier;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.*;
import io.grpc.stub.annotations.GrpcGenerated;
import io.grpc.stub.annotations.RpcMethod;

import javax.annotation.Generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: src/main/proto/service.proto")
@GrpcGenerated
public final class AdvancesCalculatorGrpc {

  private AdvancesCalculatorGrpc() {}

  public static final String SERVICE_NAME = "calculator.AdvancesCalculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile MethodDescriptor<Service.ExpRequest,
        Service.ExpResponse> getExpMethod;

  @RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exp",
      requestType = Service.ExpRequest.class,
      responseType = Service.ExpResponse.class,
      methodType = MethodDescriptor.MethodType.UNARY)
  public static MethodDescriptor<Service.ExpRequest,
      Service.ExpResponse> getExpMethod() {
    MethodDescriptor<Service.ExpRequest, Service.ExpResponse> getExpMethod;
    if ((getExpMethod = AdvancesCalculatorGrpc.getExpMethod) == null) {
      synchronized (AdvancesCalculatorGrpc.class) {
        if ((getExpMethod = AdvancesCalculatorGrpc.getExpMethod) == null) {
          AdvancesCalculatorGrpc.getExpMethod = getExpMethod =
              MethodDescriptor.<Service.ExpRequest, Service.ExpResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(ProtoUtils.marshaller(
                  Service.ExpRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(
                  Service.ExpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancesCalculatorMethodDescriptorSupplier("Exp"))
              .build();
        }
      }
    }
    return getExpMethod;
  }

  private static volatile MethodDescriptor<Service.PowerRequest,
      Service.PowerResponse> getPowerMethod;

  @RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Power",
      requestType = Service.PowerRequest.class,
      responseType = Service.PowerResponse.class,
      methodType = MethodDescriptor.MethodType.UNARY)
  public static MethodDescriptor<Service.PowerRequest,
      Service.PowerResponse> getPowerMethod() {
    MethodDescriptor<Service.PowerRequest, Service.PowerResponse> getPowerMethod;
    if ((getPowerMethod = AdvancesCalculatorGrpc.getPowerMethod) == null) {
      synchronized (AdvancesCalculatorGrpc.class) {
        if ((getPowerMethod = AdvancesCalculatorGrpc.getPowerMethod) == null) {
          AdvancesCalculatorGrpc.getPowerMethod = getPowerMethod =
              MethodDescriptor.<Service.PowerRequest, Service.PowerResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Power"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(ProtoUtils.marshaller(
                  Service.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(
                  Service.PowerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancesCalculatorMethodDescriptorSupplier("Power"))
              .build();
        }
      }
    }
    return getPowerMethod;
  }

  private static volatile MethodDescriptor<Service.SinRequest,
      Service.SinResponse> getSinMethod;

  @RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sin",
      requestType = Service.SinRequest.class,
      responseType = Service.SinResponse.class,
      methodType = MethodDescriptor.MethodType.UNARY)
  public static MethodDescriptor<Service.SinRequest,
      Service.SinResponse> getSinMethod() {
    MethodDescriptor<Service.SinRequest, Service.SinResponse> getSinMethod;
    if ((getSinMethod = AdvancesCalculatorGrpc.getSinMethod) == null) {
      synchronized (AdvancesCalculatorGrpc.class) {
        if ((getSinMethod = AdvancesCalculatorGrpc.getSinMethod) == null) {
          AdvancesCalculatorGrpc.getSinMethod = getSinMethod =
              MethodDescriptor.<Service.SinRequest, Service.SinResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(ProtoUtils.marshaller(
                  Service.SinRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(
                  Service.SinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancesCalculatorMethodDescriptorSupplier("Sin"))
              .build();
        }
      }
    }
    return getSinMethod;
  }

  private static volatile MethodDescriptor<Service.CosRequest,
      Service.CosResponse> getCosMethod;

  @RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cos",
      requestType = Service.CosRequest.class,
      responseType = Service.CosResponse.class,
      methodType = MethodDescriptor.MethodType.UNARY)
  public static MethodDescriptor<Service.CosRequest,
      Service.CosResponse> getCosMethod() {
    MethodDescriptor<Service.CosRequest, Service.CosResponse> getCosMethod;
    if ((getCosMethod = AdvancesCalculatorGrpc.getCosMethod) == null) {
      synchronized (AdvancesCalculatorGrpc.class) {
        if ((getCosMethod = AdvancesCalculatorGrpc.getCosMethod) == null) {
          AdvancesCalculatorGrpc.getCosMethod = getCosMethod =
              MethodDescriptor.<Service.CosRequest, Service.CosResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(ProtoUtils.marshaller(
                  Service.CosRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(
                  Service.CosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancesCalculatorMethodDescriptorSupplier("Cos"))
              .build();
        }
      }
    }
    return getCosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdvancesCalculatorStub newStub(Channel channel) {
    AbstractStub.StubFactory<AdvancesCalculatorStub> factory =
      new AbstractStub.StubFactory<AdvancesCalculatorStub>() {
        @Override
        public AdvancesCalculatorStub newStub(Channel channel, CallOptions callOptions) {
          return new AdvancesCalculatorStub(channel, callOptions);
        }
      };
    return AdvancesCalculatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdvancesCalculatorBlockingStub newBlockingStub(
      Channel channel) {
    AbstractStub.StubFactory<AdvancesCalculatorBlockingStub> factory =
      new AbstractStub.StubFactory<AdvancesCalculatorBlockingStub>() {
        @Override
        public AdvancesCalculatorBlockingStub newStub(Channel channel, CallOptions callOptions) {
          return new AdvancesCalculatorBlockingStub(channel, callOptions);
        }
      };
    return AdvancesCalculatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdvancesCalculatorFutureStub newFutureStub(
      Channel channel) {
    AbstractStub.StubFactory<AdvancesCalculatorFutureStub> factory =
      new AbstractStub.StubFactory<AdvancesCalculatorFutureStub>() {
        @Override
        public AdvancesCalculatorFutureStub newStub(Channel channel, CallOptions callOptions) {
          return new AdvancesCalculatorFutureStub(channel, callOptions);
        }
      };
    return AdvancesCalculatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AdvancesCalculatorImplBase implements BindableService {

    /**
     */
    public void exp(Service.ExpRequest request,
                   StreamObserver<Service.ExpResponse> responseObserver) {
      ServerCalls.asyncUnimplementedUnaryCall(getExpMethod(), responseObserver);
    }

    /**
     */
    public void power(Service.PowerRequest request,
                      StreamObserver<Service.PowerResponse> responseObserver) {
      ServerCalls.asyncUnimplementedUnaryCall(getPowerMethod(), responseObserver);
    }

    /**
     */
    public void sin(Service.SinRequest request,
                    StreamObserver<Service.SinResponse> responseObserver) {
      ServerCalls.asyncUnimplementedUnaryCall(getSinMethod(), responseObserver);
    }

    /**
     */
    public void cos(Service.CosRequest request,
                    StreamObserver<Service.CosResponse> responseObserver) {
      ServerCalls.asyncUnimplementedUnaryCall(getCosMethod(), responseObserver);
    }

    @Override public final ServerServiceDefinition bindService() {
      return ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExpMethod(),
           ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Service.ExpRequest,
                Service.ExpResponse>(
                  this, METHODID_EXP)))
          .addMethod(
            getPowerMethod(),
            ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Service.PowerRequest,
                Service.PowerResponse>(
                  this, METHODID_POWER)))
          .addMethod(
            getSinMethod(),
            ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Service.SinRequest,
                Service.SinResponse>(
                  this, METHODID_SIN)))
          .addMethod(
            getCosMethod(),
            ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Service.CosRequest,
                Service.CosResponse>(
                  this, METHODID_COS)))
          .build();
    }
  }

  /**
   */
  public static final class AdvancesCalculatorStub extends AbstractAsyncStub<AdvancesCalculatorStub> {
    private AdvancesCalculatorStub(
        Channel channel, CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AdvancesCalculatorStub build(
        Channel channel, CallOptions callOptions) {
      return new AdvancesCalculatorStub(channel, callOptions);
    }

    /**
     */
    public void exp(Service.ExpRequest request,
                    StreamObserver<Service.ExpResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void power(Service.PowerRequest request,
                      StreamObserver<Service.PowerResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sin(Service.SinRequest request,
                    StreamObserver<Service.SinResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cos(Service.CosRequest request,
                    StreamObserver<Service.CosResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdvancesCalculatorBlockingStub extends AbstractBlockingStub<AdvancesCalculatorBlockingStub> {
    private AdvancesCalculatorBlockingStub(
            Channel channel, CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AdvancesCalculatorBlockingStub build(
        Channel channel, CallOptions callOptions) {
      return new AdvancesCalculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public Service.ExpResponse exp(Service.ExpRequest request) {
      return ClientCalls.blockingUnaryCall(
          getChannel(), getExpMethod(), getCallOptions(), request);
    }

    /**
     */
    public Service.PowerResponse power(Service.PowerRequest request) {
      return ClientCalls.blockingUnaryCall(
          getChannel(), getPowerMethod(), getCallOptions(), request);
    }

    /**
     */
    public Service.SinResponse sin(Service.SinRequest request) {
      return ClientCalls.blockingUnaryCall(
          getChannel(), getSinMethod(), getCallOptions(), request);
    }

    /**
     */
    public Service.CosResponse cos(Service.CosRequest request) {
      return ClientCalls.blockingUnaryCall(
          getChannel(), getCosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdvancesCalculatorFutureStub extends AbstractFutureStub<AdvancesCalculatorFutureStub> {
    private AdvancesCalculatorFutureStub(
        Channel channel, CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AdvancesCalculatorFutureStub build(
        Channel channel, CallOptions callOptions) {
      return new AdvancesCalculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public ListenableFuture<Service.ExpResponse> exp(
        Service.ExpRequest request) {
      return ClientCalls.futureUnaryCall(
          getChannel().newCall(getExpMethod(), getCallOptions()), request);
    }

    /**
     */
    public ListenableFuture<Service.PowerResponse> power(
        Service.PowerRequest request) {
      return ClientCalls.futureUnaryCall(
          getChannel().newCall(getPowerMethod(), getCallOptions()), request);
    }

    /**
     */
    public ListenableFuture<Service.SinResponse> sin(
        Service.SinRequest request) {
      return ClientCalls.futureUnaryCall(
          getChannel().newCall(getSinMethod(), getCallOptions()), request);
    }

    /**
     */
    public ListenableFuture<Service.CosResponse> cos(
        Service.CosRequest request) {
      return ClientCalls.futureUnaryCall(
          getChannel().newCall(getCosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXP = 0;
  private static final int METHODID_POWER = 1;
  private static final int METHODID_SIN = 2;
  private static final int METHODID_COS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      ServerCalls.UnaryMethod<Req, Resp>,
      ServerCalls.ServerStreamingMethod<Req, Resp>,
      ServerCalls.ClientStreamingMethod<Req, Resp>,
      ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdvancesCalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdvancesCalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXP:
          serviceImpl.exp((Service.ExpRequest) request,
              (StreamObserver<Service.ExpResponse>) responseObserver);
          break;
        case METHODID_POWER:
          serviceImpl.power((Service.PowerRequest) request,
              (StreamObserver<Service.PowerResponse>) responseObserver);
          break;
        case METHODID_SIN:
          serviceImpl.sin((Service.SinRequest) request,
              (StreamObserver<Service.SinResponse>) responseObserver);
          break;
        case METHODID_COS:
          serviceImpl.cos((Service.CosRequest) request,
              (StreamObserver<Service.CosResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public StreamObserver<Req> invoke(
        StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AdvancesCalculatorBaseDescriptorSupplier
      implements ProtoFileDescriptorSupplier,ProtoServiceDescriptorSupplier {
    AdvancesCalculatorBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Service.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdvancesCalculator");
    }
  }

  private static final class AdvancesCalculatorFileDescriptorSupplier
      extends AdvancesCalculatorBaseDescriptorSupplier {
    AdvancesCalculatorFileDescriptorSupplier() {}
  }

  private static final class AdvancesCalculatorMethodDescriptorSupplier
      extends AdvancesCalculatorBaseDescriptorSupplier
      implements ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdvancesCalculatorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile ServiceDescriptor serviceDescriptor;

  public static ServiceDescriptor getServiceDescriptor() {
    ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdvancesCalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdvancesCalculatorFileDescriptorSupplier())
              .addMethod(getExpMethod())
              .addMethod(getPowerMethod())
              .addMethod(getSinMethod())
              .addMethod(getCosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
