// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo-service.proto

package com.alterra.deoxys.stub;

public interface DeleteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.DeleteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * API versioning: it is my best practice to specify version explicitly
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  java.lang.String getApi();
  /**
   * <pre>
   * API versioning: it is my best practice to specify version explicitly
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  com.google.protobuf.ByteString
      getApiBytes();

  /**
   * <pre>
   * Unique integer identifier of the todo task to delete
   * </pre>
   *
   * <code>int64 id = 2;</code>
   */
  long getId();
}