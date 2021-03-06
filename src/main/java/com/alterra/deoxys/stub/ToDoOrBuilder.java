// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo-service.proto

package com.alterra.deoxys.stub;

public interface ToDoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.ToDo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique integer identifier of the todo task
   * </pre>
   *
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <pre>
   * Title of the task
   * </pre>
   *
   * <code>string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Title of the task
   * </pre>
   *
   * <code>string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Detail description of the todo task
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Detail description of the todo task
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Date and time to remind the todo task
   * </pre>
   *
   * <code>.google.protobuf.Timestamp reminder = 4;</code>
   */
  boolean hasReminder();
  /**
   * <pre>
   * Date and time to remind the todo task
   * </pre>
   *
   * <code>.google.protobuf.Timestamp reminder = 4;</code>
   */
  com.google.protobuf.Timestamp getReminder();
  /**
   * <pre>
   * Date and time to remind the todo task
   * </pre>
   *
   * <code>.google.protobuf.Timestamp reminder = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReminderOrBuilder();
}
