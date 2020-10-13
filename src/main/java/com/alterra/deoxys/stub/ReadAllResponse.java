// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo-service.proto

package com.alterra.deoxys.stub;

/**
 * <pre>
 * Contains list of all todo tasks
 * </pre>
 *
 * Protobuf type {@code v1.ReadAllResponse}
 */
public  final class ReadAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.ReadAllResponse)
    ReadAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadAllResponse.newBuilder() to construct.
  private ReadAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadAllResponse() {
    api_ = "";
    toDos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadAllResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            api_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              toDos_ = new java.util.ArrayList<com.alterra.deoxys.stub.ToDo>();
              mutable_bitField0_ |= 0x00000002;
            }
            toDos_.add(
                input.readMessage(com.alterra.deoxys.stub.ToDo.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        toDos_ = java.util.Collections.unmodifiableList(toDos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alterra.deoxys.stub.TodoServiceProto.internal_static_v1_ReadAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alterra.deoxys.stub.TodoServiceProto.internal_static_v1_ReadAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alterra.deoxys.stub.ReadAllResponse.class, com.alterra.deoxys.stub.ReadAllResponse.Builder.class);
  }

  private int bitField0_;
  public static final int API_FIELD_NUMBER = 1;
  private volatile java.lang.Object api_;
  /**
   * <pre>
   * API versioning: it is my best practice to specify version explicitly
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  public java.lang.String getApi() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      api_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * API versioning: it is my best practice to specify version explicitly
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  public com.google.protobuf.ByteString
      getApiBytes() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      api_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TODOS_FIELD_NUMBER = 2;
  private java.util.List<com.alterra.deoxys.stub.ToDo> toDos_;
  /**
   * <pre>
   * List of all todo tasks
   * </pre>
   *
   * <code>repeated .v1.ToDo toDos = 2;</code>
   */
  public java.util.List<com.alterra.deoxys.stub.ToDo> getToDosList() {
    return toDos_;
  }
  /**
   * <pre>
   * List of all todo tasks
   * </pre>
   *
   * <code>repeated .v1.ToDo toDos = 2;</code>
   */
  public java.util.List<? extends com.alterra.deoxys.stub.ToDoOrBuilder> 
      getToDosOrBuilderList() {
    return toDos_;
  }
  /**
   * <pre>
   * List of all todo tasks
   * </pre>
   *
   * <code>repeated .v1.ToDo toDos = 2;</code>
   */
  public int getToDosCount() {
    return toDos_.size();
  }
  /**
   * <pre>
   * List of all todo tasks
   * </pre>
   *
   * <code>repeated .v1.ToDo toDos = 2;</code>
   */
  public com.alterra.deoxys.stub.ToDo getToDos(int index) {
    return toDos_.get(index);
  }
  /**
   * <pre>
   * List of all todo tasks
   * </pre>
   *
   * <code>repeated .v1.ToDo toDos = 2;</code>
   */
  public com.alterra.deoxys.stub.ToDoOrBuilder getToDosOrBuilder(
      int index) {
    return toDos_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getApiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, api_);
    }
    for (int i = 0; i < toDos_.size(); i++) {
      output.writeMessage(2, toDos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getApiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, api_);
    }
    for (int i = 0; i < toDos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, toDos_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alterra.deoxys.stub.ReadAllResponse)) {
      return super.equals(obj);
    }
    com.alterra.deoxys.stub.ReadAllResponse other = (com.alterra.deoxys.stub.ReadAllResponse) obj;

    boolean result = true;
    result = result && getApi()
        .equals(other.getApi());
    result = result && getToDosList()
        .equals(other.getToDosList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + API_FIELD_NUMBER;
    hash = (53 * hash) + getApi().hashCode();
    if (getToDosCount() > 0) {
      hash = (37 * hash) + TODOS_FIELD_NUMBER;
      hash = (53 * hash) + getToDosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alterra.deoxys.stub.ReadAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alterra.deoxys.stub.ReadAllResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Contains list of all todo tasks
   * </pre>
   *
   * Protobuf type {@code v1.ReadAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.ReadAllResponse)
      com.alterra.deoxys.stub.ReadAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alterra.deoxys.stub.TodoServiceProto.internal_static_v1_ReadAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alterra.deoxys.stub.TodoServiceProto.internal_static_v1_ReadAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alterra.deoxys.stub.ReadAllResponse.class, com.alterra.deoxys.stub.ReadAllResponse.Builder.class);
    }

    // Construct using com.alterra.deoxys.stub.ReadAllResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getToDosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      api_ = "";

      if (toDosBuilder_ == null) {
        toDos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        toDosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alterra.deoxys.stub.TodoServiceProto.internal_static_v1_ReadAllResponse_descriptor;
    }

    @java.lang.Override
    public com.alterra.deoxys.stub.ReadAllResponse getDefaultInstanceForType() {
      return com.alterra.deoxys.stub.ReadAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.alterra.deoxys.stub.ReadAllResponse build() {
      com.alterra.deoxys.stub.ReadAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.alterra.deoxys.stub.ReadAllResponse buildPartial() {
      com.alterra.deoxys.stub.ReadAllResponse result = new com.alterra.deoxys.stub.ReadAllResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.api_ = api_;
      if (toDosBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          toDos_ = java.util.Collections.unmodifiableList(toDos_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.toDos_ = toDos_;
      } else {
        result.toDos_ = toDosBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alterra.deoxys.stub.ReadAllResponse) {
        return mergeFrom((com.alterra.deoxys.stub.ReadAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alterra.deoxys.stub.ReadAllResponse other) {
      if (other == com.alterra.deoxys.stub.ReadAllResponse.getDefaultInstance()) return this;
      if (!other.getApi().isEmpty()) {
        api_ = other.api_;
        onChanged();
      }
      if (toDosBuilder_ == null) {
        if (!other.toDos_.isEmpty()) {
          if (toDos_.isEmpty()) {
            toDos_ = other.toDos_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureToDosIsMutable();
            toDos_.addAll(other.toDos_);
          }
          onChanged();
        }
      } else {
        if (!other.toDos_.isEmpty()) {
          if (toDosBuilder_.isEmpty()) {
            toDosBuilder_.dispose();
            toDosBuilder_ = null;
            toDos_ = other.toDos_;
            bitField0_ = (bitField0_ & ~0x00000002);
            toDosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getToDosFieldBuilder() : null;
          } else {
            toDosBuilder_.addAllMessages(other.toDos_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alterra.deoxys.stub.ReadAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alterra.deoxys.stub.ReadAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object api_ = "";
    /**
     * <pre>
     * API versioning: it is my best practice to specify version explicitly
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public java.lang.String getApi() {
      java.lang.Object ref = api_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        api_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * API versioning: it is my best practice to specify version explicitly
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public com.google.protobuf.ByteString
        getApiBytes() {
      java.lang.Object ref = api_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        api_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * API versioning: it is my best practice to specify version explicitly
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public Builder setApi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      api_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * API versioning: it is my best practice to specify version explicitly
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public Builder clearApi() {
      
      api_ = getDefaultInstance().getApi();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * API versioning: it is my best practice to specify version explicitly
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public Builder setApiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      api_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.alterra.deoxys.stub.ToDo> toDos_ =
      java.util.Collections.emptyList();
    private void ensureToDosIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        toDos_ = new java.util.ArrayList<com.alterra.deoxys.stub.ToDo>(toDos_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alterra.deoxys.stub.ToDo, com.alterra.deoxys.stub.ToDo.Builder, com.alterra.deoxys.stub.ToDoOrBuilder> toDosBuilder_;

    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public java.util.List<com.alterra.deoxys.stub.ToDo> getToDosList() {
      if (toDosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(toDos_);
      } else {
        return toDosBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public int getToDosCount() {
      if (toDosBuilder_ == null) {
        return toDos_.size();
      } else {
        return toDosBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public com.alterra.deoxys.stub.ToDo getToDos(int index) {
      if (toDosBuilder_ == null) {
        return toDos_.get(index);
      } else {
        return toDosBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder setToDos(
        int index, com.alterra.deoxys.stub.ToDo value) {
      if (toDosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToDosIsMutable();
        toDos_.set(index, value);
        onChanged();
      } else {
        toDosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder setToDos(
        int index, com.alterra.deoxys.stub.ToDo.Builder builderForValue) {
      if (toDosBuilder_ == null) {
        ensureToDosIsMutable();
        toDos_.set(index, builderForValue.build());
        onChanged();
      } else {
        toDosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder addToDos(com.alterra.deoxys.stub.ToDo value) {
      if (toDosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToDosIsMutable();
        toDos_.add(value);
        onChanged();
      } else {
        toDosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder addToDos(
        int index, com.alterra.deoxys.stub.ToDo value) {
      if (toDosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToDosIsMutable();
        toDos_.add(index, value);
        onChanged();
      } else {
        toDosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder addToDos(
        com.alterra.deoxys.stub.ToDo.Builder builderForValue) {
      if (toDosBuilder_ == null) {
        ensureToDosIsMutable();
        toDos_.add(builderForValue.build());
        onChanged();
      } else {
        toDosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder addToDos(
        int index, com.alterra.deoxys.stub.ToDo.Builder builderForValue) {
      if (toDosBuilder_ == null) {
        ensureToDosIsMutable();
        toDos_.add(index, builderForValue.build());
        onChanged();
      } else {
        toDosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder addAllToDos(
        java.lang.Iterable<? extends com.alterra.deoxys.stub.ToDo> values) {
      if (toDosBuilder_ == null) {
        ensureToDosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, toDos_);
        onChanged();
      } else {
        toDosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder clearToDos() {
      if (toDosBuilder_ == null) {
        toDos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        toDosBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public Builder removeToDos(int index) {
      if (toDosBuilder_ == null) {
        ensureToDosIsMutable();
        toDos_.remove(index);
        onChanged();
      } else {
        toDosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public com.alterra.deoxys.stub.ToDo.Builder getToDosBuilder(
        int index) {
      return getToDosFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public com.alterra.deoxys.stub.ToDoOrBuilder getToDosOrBuilder(
        int index) {
      if (toDosBuilder_ == null) {
        return toDos_.get(index);  } else {
        return toDosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public java.util.List<? extends com.alterra.deoxys.stub.ToDoOrBuilder> 
         getToDosOrBuilderList() {
      if (toDosBuilder_ != null) {
        return toDosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(toDos_);
      }
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public com.alterra.deoxys.stub.ToDo.Builder addToDosBuilder() {
      return getToDosFieldBuilder().addBuilder(
          com.alterra.deoxys.stub.ToDo.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public com.alterra.deoxys.stub.ToDo.Builder addToDosBuilder(
        int index) {
      return getToDosFieldBuilder().addBuilder(
          index, com.alterra.deoxys.stub.ToDo.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all todo tasks
     * </pre>
     *
     * <code>repeated .v1.ToDo toDos = 2;</code>
     */
    public java.util.List<com.alterra.deoxys.stub.ToDo.Builder> 
         getToDosBuilderList() {
      return getToDosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alterra.deoxys.stub.ToDo, com.alterra.deoxys.stub.ToDo.Builder, com.alterra.deoxys.stub.ToDoOrBuilder> 
        getToDosFieldBuilder() {
      if (toDosBuilder_ == null) {
        toDosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.alterra.deoxys.stub.ToDo, com.alterra.deoxys.stub.ToDo.Builder, com.alterra.deoxys.stub.ToDoOrBuilder>(
                toDos_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        toDos_ = null;
      }
      return toDosBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.ReadAllResponse)
  }

  // @@protoc_insertion_point(class_scope:v1.ReadAllResponse)
  private static final com.alterra.deoxys.stub.ReadAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alterra.deoxys.stub.ReadAllResponse();
  }

  public static com.alterra.deoxys.stub.ReadAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadAllResponse>() {
    @java.lang.Override
    public ReadAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.alterra.deoxys.stub.ReadAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
