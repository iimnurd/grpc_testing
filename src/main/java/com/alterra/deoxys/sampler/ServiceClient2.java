package com.alterra.deoxys.sampler;

import java.time.Instant;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import io.grpc.Metadata;

import com.alterra.deoxys.stub. * ;

import com.alterra.deoxys.stub.ToDoServiceGrpc.ToDoServiceBlockingStub;

import io.grpc.netty.NettyChannelBuilder;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.protobuf.Timestamp;

public class ServiceClient2 {

	public ManagedChannel channel;
	public ToDoServiceBlockingStub stub;
	//all request
	public CreateRequest createRequest;
	public CreateResponse createResponse;

	public UpdateRequest updateRequest;
	public UpdateResponse updateResponse;

	public DeleteRequest deleteRequest;
	public DeleteResponse deleteResponse;

	public ReadRequest readRequest;
	public ReadResponse readResponse;

	public ReadAllRequest readAllRequest;
	public ReadAllResponse readAllResponse;

	public ToDo todo;

	public Metadata header;

	private static final Logger logger = Logger.getLogger("alterra");

	/** Construct client connecting to GRPC server at {@code host:port}. */
	public ServiceClient2(String host, int port) {
		this(ManagedChannelBuilder.forAddress(host, port)
		// Channels are secure by default (via SSL/TLS). For the example
		// we disable TLS to avoid
		// needing certificates.
		.usePlaintext(true));
		logger.setLevel(Level.WARNING);
	}

	public ServiceClient2(ManagedChannelBuilder < ?>channelBuilder) {
		channel = channelBuilder.build();
		stub = ToDoServiceGrpc.newBlockingStub(channel);

	}
	
	
	
	
	

	//create property builder for Todo ( message src/main/resources/todo-service.proto
	public ServiceClient2 createTODO(String title, String desc) {
		Instant time = Instant.now();
		Timestamp timestamp = Timestamp.newBuilder().setSeconds(time.getEpochSecond()).setNanos(time.getNano()).build();

		todo = ToDo.newBuilder().setTitle(title).setDescription(desc).setReminder(timestamp).build();

		return this;
	}
	
	
	
	
	

	//create property builder for Todo ( message src/main/resources/todo-service.proto
	public ServiceClient2 updateTODO(int id, String title, String desc) {
		Instant time = Instant.now();
		Timestamp timestamp = Timestamp.newBuilder().setSeconds(time.getEpochSecond()).setNanos(time.getNano()).build();

		todo = ToDo.newBuilder().setId(id).setTitle(title).setDescription(desc).setReminder(timestamp).build();

		return this;
	}
	
	
	
	
	

	//build create request
	public ServiceClient2 createRequest(ServiceClient2 client, String api, String title, String description) {
		client = client.createTODO(title, description);
		createRequest = CreateRequest.newBuilder().setApi(api).setToDo(todo).build();
		return this;
	}

	public CreateResponse sendCreateRequestToService(ServiceClient2 client, String api, String title, String description) {
		client = client.createRequest(client, api, title, description);
		CreateResponse createResponse = stub.withInterceptors(new HeaderClientInterceptor()).create(createRequest);
		return createResponse;
	}
	
	
	
	
	

	//build update request
	public ServiceClient2 updateRequest(ServiceClient2 client, int id, String api, String title, String description) {
		client = client.updateTODO(id, title, description);
		updateRequest = UpdateRequest.newBuilder().setApi(api).setToDo(todo).build();
		return this;
	}

	public UpdateResponse sendUpdateRequestToService(ServiceClient2 client, int id, String api, String title, String description) {
		client = client.updateRequest(client, id, api, title, description);
		UpdateResponse updateResponse = stub.withInterceptors(new HeaderClientInterceptor()).update(updateRequest);
		return updateResponse;
	}
	
	
	
	
	

	//build read request by id
	public ServiceClient2 readRequest(String api, int id) {
		readRequest = ReadRequest.newBuilder().setApi(api).setId(id).build();
		return this;
	}

	public ReadResponse sendReadRequestToService(ServiceClient2 client, String api, int id) {
		client = client.readRequest(api, id);
		readResponse = stub.withInterceptors(new HeaderClientInterceptor()).read(readRequest);
		return readResponse;
	}
	
	
	
	
	

	//build read all request
	public ServiceClient2 readAllRequest(String api) {
		readAllRequest = ReadAllRequest.newBuilder().setApi(api).build();
		return this;
	}

	public ReadAllResponse sendReadAllRequestToService(ServiceClient2 client, String api) {
		client = client.readAllRequest(api);
		ReadAllResponse serverResponse = stub.withInterceptors(new HeaderClientInterceptor()).readAll(readAllRequest);
		return serverResponse;
	}
	
	
	
	
	

	//build delete request by id
	public ServiceClient2 deleteRequest(String api, int id) {
		deleteRequest = DeleteRequest.newBuilder().setApi(api).setId(id).build();
		return this;
	}

	public DeleteResponse sendDeleteRequestToService(ServiceClient2 client, String api, int id) {
		client = client.deleteRequest(api, id);
		deleteResponse = stub.withInterceptors(new HeaderClientInterceptor()).delete(deleteRequest);
		return deleteResponse;
	}
	
	
	
	
	

	//close connection
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

}