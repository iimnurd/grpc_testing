package com.alterra.deoxys.stub;

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
 * <pre>
 * Service to manage list of todo tasks
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: todo-service.proto")
public final class ToDoServiceGrpc {

  private ToDoServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ToDoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.alterra.deoxys.stub.CreateRequest,
      com.alterra.deoxys.stub.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.alterra.deoxys.stub.CreateRequest.class,
      responseType = com.alterra.deoxys.stub.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alterra.deoxys.stub.CreateRequest,
      com.alterra.deoxys.stub.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.alterra.deoxys.stub.CreateRequest, com.alterra.deoxys.stub.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ToDoServiceGrpc.getCreateMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getCreateMethod = ToDoServiceGrpc.getCreateMethod) == null) {
          ToDoServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<com.alterra.deoxys.stub.CreateRequest, com.alterra.deoxys.stub.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.CreateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alterra.deoxys.stub.ReadRequest,
      com.alterra.deoxys.stub.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = com.alterra.deoxys.stub.ReadRequest.class,
      responseType = com.alterra.deoxys.stub.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alterra.deoxys.stub.ReadRequest,
      com.alterra.deoxys.stub.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<com.alterra.deoxys.stub.ReadRequest, com.alterra.deoxys.stub.ReadResponse> getReadMethod;
    if ((getReadMethod = ToDoServiceGrpc.getReadMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getReadMethod = ToDoServiceGrpc.getReadMethod) == null) {
          ToDoServiceGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<com.alterra.deoxys.stub.ReadRequest, com.alterra.deoxys.stub.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.ReadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alterra.deoxys.stub.UpdateRequest,
      com.alterra.deoxys.stub.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.alterra.deoxys.stub.UpdateRequest.class,
      responseType = com.alterra.deoxys.stub.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alterra.deoxys.stub.UpdateRequest,
      com.alterra.deoxys.stub.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.alterra.deoxys.stub.UpdateRequest, com.alterra.deoxys.stub.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ToDoServiceGrpc.getUpdateMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getUpdateMethod = ToDoServiceGrpc.getUpdateMethod) == null) {
          ToDoServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.alterra.deoxys.stub.UpdateRequest, com.alterra.deoxys.stub.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.UpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alterra.deoxys.stub.DeleteRequest,
      com.alterra.deoxys.stub.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.alterra.deoxys.stub.DeleteRequest.class,
      responseType = com.alterra.deoxys.stub.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alterra.deoxys.stub.DeleteRequest,
      com.alterra.deoxys.stub.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.alterra.deoxys.stub.DeleteRequest, com.alterra.deoxys.stub.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ToDoServiceGrpc.getDeleteMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getDeleteMethod = ToDoServiceGrpc.getDeleteMethod) == null) {
          ToDoServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.alterra.deoxys.stub.DeleteRequest, com.alterra.deoxys.stub.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alterra.deoxys.stub.ReadAllRequest,
      com.alterra.deoxys.stub.ReadAllResponse> getReadAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAll",
      requestType = com.alterra.deoxys.stub.ReadAllRequest.class,
      responseType = com.alterra.deoxys.stub.ReadAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alterra.deoxys.stub.ReadAllRequest,
      com.alterra.deoxys.stub.ReadAllResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<com.alterra.deoxys.stub.ReadAllRequest, com.alterra.deoxys.stub.ReadAllResponse> getReadAllMethod;
    if ((getReadAllMethod = ToDoServiceGrpc.getReadAllMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getReadAllMethod = ToDoServiceGrpc.getReadAllMethod) == null) {
          ToDoServiceGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<com.alterra.deoxys.stub.ReadAllRequest, com.alterra.deoxys.stub.ReadAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.ReadAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alterra.deoxys.stub.ReadAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToDoServiceStub newStub(io.grpc.Channel channel) {
    return new ToDoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToDoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ToDoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToDoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ToDoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage list of todo tasks
   * </pre>
   */
  public static abstract class ToDoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create new todo task
     * </pre>
     */
    public void create(com.alterra.deoxys.stub.CreateRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read todo task
     * </pre>
     */
    public void read(com.alterra.deoxys.stub.ReadRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update todo task
     * </pre>
     */
    public void update(com.alterra.deoxys.stub.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete todo task
     * </pre>
     */
    public void delete(com.alterra.deoxys.stub.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read all todo tasks
     * </pre>
     */
    public void readAll(com.alterra.deoxys.stub.ReadAllRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.ReadAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alterra.deoxys.stub.CreateRequest,
                com.alterra.deoxys.stub.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alterra.deoxys.stub.ReadRequest,
                com.alterra.deoxys.stub.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alterra.deoxys.stub.UpdateRequest,
                com.alterra.deoxys.stub.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alterra.deoxys.stub.DeleteRequest,
                com.alterra.deoxys.stub.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alterra.deoxys.stub.ReadAllRequest,
                com.alterra.deoxys.stub.ReadAllResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage list of todo tasks
   * </pre>
   */
  public static final class ToDoServiceStub extends io.grpc.stub.AbstractStub<ToDoServiceStub> {
    private ToDoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new todo task
     * </pre>
     */
    public void create(com.alterra.deoxys.stub.CreateRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read todo task
     * </pre>
     */
    public void read(com.alterra.deoxys.stub.ReadRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update todo task
     * </pre>
     */
    public void update(com.alterra.deoxys.stub.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete todo task
     * </pre>
     */
    public void delete(com.alterra.deoxys.stub.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read all todo tasks
     * </pre>
     */
    public void readAll(com.alterra.deoxys.stub.ReadAllRequest request,
        io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.ReadAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage list of todo tasks
   * </pre>
   */
  public static final class ToDoServiceBlockingStub extends io.grpc.stub.AbstractStub<ToDoServiceBlockingStub> {
    private ToDoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new todo task
     * </pre>
     */
    public com.alterra.deoxys.stub.CreateResponse create(com.alterra.deoxys.stub.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read todo task
     * </pre>
     */
    public com.alterra.deoxys.stub.ReadResponse read(com.alterra.deoxys.stub.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update todo task
     * </pre>
     */
    public com.alterra.deoxys.stub.UpdateResponse update(com.alterra.deoxys.stub.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete todo task
     * </pre>
     */
    public com.alterra.deoxys.stub.DeleteResponse delete(com.alterra.deoxys.stub.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read all todo tasks
     * </pre>
     */
    public com.alterra.deoxys.stub.ReadAllResponse readAll(com.alterra.deoxys.stub.ReadAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage list of todo tasks
   * </pre>
   */
  public static final class ToDoServiceFutureStub extends io.grpc.stub.AbstractStub<ToDoServiceFutureStub> {
    private ToDoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new todo task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alterra.deoxys.stub.CreateResponse> create(
        com.alterra.deoxys.stub.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read todo task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alterra.deoxys.stub.ReadResponse> read(
        com.alterra.deoxys.stub.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update todo task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alterra.deoxys.stub.UpdateResponse> update(
        com.alterra.deoxys.stub.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete todo task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alterra.deoxys.stub.DeleteResponse> delete(
        com.alterra.deoxys.stub.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read all todo tasks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alterra.deoxys.stub.ReadAllResponse> readAll(
        com.alterra.deoxys.stub.ReadAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_READ_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ToDoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ToDoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.alterra.deoxys.stub.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.CreateResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((com.alterra.deoxys.stub.ReadRequest) request,
              (io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.ReadResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.alterra.deoxys.stub.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.alterra.deoxys.stub.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.DeleteResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((com.alterra.deoxys.stub.ReadAllRequest) request,
              (io.grpc.stub.StreamObserver<com.alterra.deoxys.stub.ReadAllResponse>) responseObserver);
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

  private static abstract class ToDoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToDoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alterra.deoxys.stub.TodoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToDoService");
    }
  }

  private static final class ToDoServiceFileDescriptorSupplier
      extends ToDoServiceBaseDescriptorSupplier {
    ToDoServiceFileDescriptorSupplier() {}
  }

  private static final class ToDoServiceMethodDescriptorSupplier
      extends ToDoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ToDoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ToDoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToDoServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
