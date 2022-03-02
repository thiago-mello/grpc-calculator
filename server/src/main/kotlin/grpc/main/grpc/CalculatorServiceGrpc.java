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
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: calculator.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getAddValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddValues",
      requestType = Calculator.OperationRequest.class,
      responseType = Calculator.OperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getAddValuesMethod() {
    io.grpc.MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse> getAddValuesMethod;
    if ((getAddValuesMethod = CalculatorServiceGrpc.getAddValuesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAddValuesMethod = CalculatorServiceGrpc.getAddValuesMethod) == null) {
          CalculatorServiceGrpc.getAddValuesMethod = getAddValuesMethod =
              io.grpc.MethodDescriptor.<Calculator.OperationRequest, Calculator.OperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("AddValues"))
              .build();
        }
      }
    }
    return getAddValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getSubValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubValues",
      requestType = Calculator.OperationRequest.class,
      responseType = Calculator.OperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getSubValuesMethod() {
    io.grpc.MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse> getSubValuesMethod;
    if ((getSubValuesMethod = CalculatorServiceGrpc.getSubValuesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSubValuesMethod = CalculatorServiceGrpc.getSubValuesMethod) == null) {
          CalculatorServiceGrpc.getSubValuesMethod = getSubValuesMethod =
              io.grpc.MethodDescriptor.<Calculator.OperationRequest, Calculator.OperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("SubValues"))
              .build();
        }
      }
    }
    return getSubValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getMultValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultValues",
      requestType = Calculator.OperationRequest.class,
      responseType = Calculator.OperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getMultValuesMethod() {
    io.grpc.MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse> getMultValuesMethod;
    if ((getMultValuesMethod = CalculatorServiceGrpc.getMultValuesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getMultValuesMethod = CalculatorServiceGrpc.getMultValuesMethod) == null) {
          CalculatorServiceGrpc.getMultValuesMethod = getMultValuesMethod =
              io.grpc.MethodDescriptor.<Calculator.OperationRequest, Calculator.OperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("MultValues"))
              .build();
        }
      }
    }
    return getMultValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getDivValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DivValues",
      requestType = Calculator.OperationRequest.class,
      responseType = Calculator.OperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Calculator.OperationRequest,
      Calculator.OperationResponse> getDivValuesMethod() {
    io.grpc.MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse> getDivValuesMethod;
    if ((getDivValuesMethod = CalculatorServiceGrpc.getDivValuesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDivValuesMethod = CalculatorServiceGrpc.getDivValuesMethod) == null) {
          CalculatorServiceGrpc.getDivValuesMethod = getDivValuesMethod =
              io.grpc.MethodDescriptor.<Calculator.OperationRequest, Calculator.OperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DivValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Calculator.OperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("DivValues"))
              .build();
        }
      }
    }
    return getDivValuesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddValuesMethod(), responseObserver);
    }

    /**
     */
    public void subValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubValuesMethod(), responseObserver);
    }

    /**
     */
    public void multValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultValuesMethod(), responseObserver);
    }

    /**
     */
    public void divValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDivValuesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Calculator.OperationRequest,
                Calculator.OperationResponse>(
                  this, METHODID_ADD_VALUES)))
          .addMethod(
            getSubValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Calculator.OperationRequest,
                Calculator.OperationResponse>(
                  this, METHODID_SUB_VALUES)))
          .addMethod(
            getMultValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Calculator.OperationRequest,
                Calculator.OperationResponse>(
                  this, METHODID_MULT_VALUES)))
          .addMethod(
            getDivValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Calculator.OperationRequest,
                Calculator.OperationResponse>(
                  this, METHODID_DIV_VALUES)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void addValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divValues(Calculator.OperationRequest request,
        io.grpc.stub.StreamObserver<Calculator.OperationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivValuesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Calculator.OperationResponse addValues(Calculator.OperationRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddValuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Calculator.OperationResponse subValues(Calculator.OperationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubValuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Calculator.OperationResponse multValues(Calculator.OperationRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultValuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Calculator.OperationResponse divValues(Calculator.OperationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDivValuesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Calculator.OperationResponse> addValues(
        Calculator.OperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddValuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Calculator.OperationResponse> subValues(
        Calculator.OperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubValuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Calculator.OperationResponse> multValues(
        Calculator.OperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultValuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Calculator.OperationResponse> divValues(
        Calculator.OperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDivValuesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_VALUES = 0;
  private static final int METHODID_SUB_VALUES = 1;
  private static final int METHODID_MULT_VALUES = 2;
  private static final int METHODID_DIV_VALUES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_VALUES:
          serviceImpl.addValues((Calculator.OperationRequest) request,
              (io.grpc.stub.StreamObserver<Calculator.OperationResponse>) responseObserver);
          break;
        case METHODID_SUB_VALUES:
          serviceImpl.subValues((Calculator.OperationRequest) request,
              (io.grpc.stub.StreamObserver<Calculator.OperationResponse>) responseObserver);
          break;
        case METHODID_MULT_VALUES:
          serviceImpl.multValues((Calculator.OperationRequest) request,
              (io.grpc.stub.StreamObserver<Calculator.OperationResponse>) responseObserver);
          break;
        case METHODID_DIV_VALUES:
          serviceImpl.divValues((Calculator.OperationRequest) request,
              (io.grpc.stub.StreamObserver<Calculator.OperationResponse>) responseObserver);
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

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getAddValuesMethod())
              .addMethod(getSubValuesMethod())
              .addMethod(getMultValuesMethod())
              .addMethod(getDivValuesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
