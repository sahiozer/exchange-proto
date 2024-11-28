package shared;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: exchange.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GoldServiceGrpc {

  private GoldServiceGrpc() {}

  public static final String SERVICE_NAME = "shared.GoldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<shared.Exchange.EmptyRequest,
      shared.Exchange.BankRatesResponse> getGetGoldRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGoldRates",
      requestType = shared.Exchange.EmptyRequest.class,
      responseType = shared.Exchange.BankRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<shared.Exchange.EmptyRequest,
      shared.Exchange.BankRatesResponse> getGetGoldRatesMethod() {
    io.grpc.MethodDescriptor<shared.Exchange.EmptyRequest, shared.Exchange.BankRatesResponse> getGetGoldRatesMethod;
    if ((getGetGoldRatesMethod = GoldServiceGrpc.getGetGoldRatesMethod) == null) {
      synchronized (GoldServiceGrpc.class) {
        if ((getGetGoldRatesMethod = GoldServiceGrpc.getGetGoldRatesMethod) == null) {
          GoldServiceGrpc.getGetGoldRatesMethod = getGetGoldRatesMethod =
              io.grpc.MethodDescriptor.<shared.Exchange.EmptyRequest, shared.Exchange.BankRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGoldRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  shared.Exchange.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  shared.Exchange.BankRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GoldServiceMethodDescriptorSupplier("GetGoldRates"))
              .build();
        }
      }
    }
    return getGetGoldRatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoldServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoldServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoldServiceStub>() {
        @java.lang.Override
        public GoldServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoldServiceStub(channel, callOptions);
        }
      };
    return GoldServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoldServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoldServiceBlockingStub>() {
        @java.lang.Override
        public GoldServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoldServiceBlockingStub(channel, callOptions);
        }
      };
    return GoldServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoldServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoldServiceFutureStub>() {
        @java.lang.Override
        public GoldServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoldServiceFutureStub(channel, callOptions);
        }
      };
    return GoldServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getGoldRates(shared.Exchange.EmptyRequest request,
        io.grpc.stub.StreamObserver<shared.Exchange.BankRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGoldRatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GoldService.
   */
  public static abstract class GoldServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GoldServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GoldService.
   */
  public static final class GoldServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GoldServiceStub> {
    private GoldServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoldServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoldServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGoldRates(shared.Exchange.EmptyRequest request,
        io.grpc.stub.StreamObserver<shared.Exchange.BankRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGoldRatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GoldService.
   */
  public static final class GoldServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GoldServiceBlockingStub> {
    private GoldServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoldServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public shared.Exchange.BankRatesResponse getGoldRates(shared.Exchange.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGoldRatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GoldService.
   */
  public static final class GoldServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GoldServiceFutureStub> {
    private GoldServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoldServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<shared.Exchange.BankRatesResponse> getGoldRates(
        shared.Exchange.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGoldRatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GOLD_RATES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GOLD_RATES:
          serviceImpl.getGoldRates((shared.Exchange.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<shared.Exchange.BankRatesResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetGoldRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              shared.Exchange.EmptyRequest,
              shared.Exchange.BankRatesResponse>(
                service, METHODID_GET_GOLD_RATES)))
        .build();
  }

  private static abstract class GoldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return shared.Exchange.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoldService");
    }
  }

  private static final class GoldServiceFileDescriptorSupplier
      extends GoldServiceBaseDescriptorSupplier {
    GoldServiceFileDescriptorSupplier() {}
  }

  private static final class GoldServiceMethodDescriptorSupplier
      extends GoldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GoldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoldServiceFileDescriptorSupplier())
              .addMethod(getGetGoldRatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
