package shared;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: exchange.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SilverServiceGrpc {

  private SilverServiceGrpc() {}

  public static final String SERVICE_NAME = "shared.SilverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<shared.Exchange.EmptyRequest,
      shared.Exchange.BankRatesResponse> getGetSilverRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSilverRates",
      requestType = shared.Exchange.EmptyRequest.class,
      responseType = shared.Exchange.BankRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<shared.Exchange.EmptyRequest,
      shared.Exchange.BankRatesResponse> getGetSilverRatesMethod() {
    io.grpc.MethodDescriptor<shared.Exchange.EmptyRequest, shared.Exchange.BankRatesResponse> getGetSilverRatesMethod;
    if ((getGetSilverRatesMethod = SilverServiceGrpc.getGetSilverRatesMethod) == null) {
      synchronized (SilverServiceGrpc.class) {
        if ((getGetSilverRatesMethod = SilverServiceGrpc.getGetSilverRatesMethod) == null) {
          SilverServiceGrpc.getGetSilverRatesMethod = getGetSilverRatesMethod =
              io.grpc.MethodDescriptor.<shared.Exchange.EmptyRequest, shared.Exchange.BankRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSilverRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  shared.Exchange.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  shared.Exchange.BankRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SilverServiceMethodDescriptorSupplier("GetSilverRates"))
              .build();
        }
      }
    }
    return getGetSilverRatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SilverServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SilverServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SilverServiceStub>() {
        @java.lang.Override
        public SilverServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SilverServiceStub(channel, callOptions);
        }
      };
    return SilverServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SilverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SilverServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SilverServiceBlockingStub>() {
        @java.lang.Override
        public SilverServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SilverServiceBlockingStub(channel, callOptions);
        }
      };
    return SilverServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SilverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SilverServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SilverServiceFutureStub>() {
        @java.lang.Override
        public SilverServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SilverServiceFutureStub(channel, callOptions);
        }
      };
    return SilverServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSilverRates(shared.Exchange.EmptyRequest request,
        io.grpc.stub.StreamObserver<shared.Exchange.BankRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSilverRatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SilverService.
   */
  public static abstract class SilverServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SilverServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SilverService.
   */
  public static final class SilverServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SilverServiceStub> {
    private SilverServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SilverServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SilverServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSilverRates(shared.Exchange.EmptyRequest request,
        io.grpc.stub.StreamObserver<shared.Exchange.BankRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSilverRatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SilverService.
   */
  public static final class SilverServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SilverServiceBlockingStub> {
    private SilverServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SilverServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SilverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public shared.Exchange.BankRatesResponse getSilverRates(shared.Exchange.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSilverRatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SilverService.
   */
  public static final class SilverServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SilverServiceFutureStub> {
    private SilverServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SilverServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SilverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<shared.Exchange.BankRatesResponse> getSilverRates(
        shared.Exchange.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSilverRatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SILVER_RATES = 0;

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
        case METHODID_GET_SILVER_RATES:
          serviceImpl.getSilverRates((shared.Exchange.EmptyRequest) request,
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
          getGetSilverRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              shared.Exchange.EmptyRequest,
              shared.Exchange.BankRatesResponse>(
                service, METHODID_GET_SILVER_RATES)))
        .build();
  }

  private static abstract class SilverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SilverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return shared.Exchange.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SilverService");
    }
  }

  private static final class SilverServiceFileDescriptorSupplier
      extends SilverServiceBaseDescriptorSupplier {
    SilverServiceFileDescriptorSupplier() {}
  }

  private static final class SilverServiceMethodDescriptorSupplier
      extends SilverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SilverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SilverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SilverServiceFileDescriptorSupplier())
              .addMethod(getGetSilverRatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
