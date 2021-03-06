// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushTwoStepVerification.proto

package com.iGap.proto;

public final class ProtoPushTwoStepVerification {
  private ProtoPushTwoStepVerification() {
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface PushTwoStepVerificationResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:proto.PushTwoStepVerificationResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    boolean hasResponse();

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    com.iGap.proto.ProtoResponse.Response getResponse();

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    com.iGap.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder();

    /**
     * <code>optional string username = 2;</code>
     */
    java.lang.String getUsername();

    /**
     * <code>optional string username = 2;</code>
     */
    com.google.protobuf.ByteString getUsernameBytes();

    /**
     * <code>optional uint64 user_id = 3;</code>
     */
    long getUserId();

    /**
     * <code>optional string author_hash = 4;</code>
     */
    java.lang.String getAuthorHash();

    /**
     * <code>optional string author_hash = 4;</code>
     */
    com.google.protobuf.ByteString getAuthorHashBytes();
  }

  /**
   * Protobuf type {@code proto.PushTwoStepVerificationResponse}
   */
  public static final class PushTwoStepVerificationResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:proto.PushTwoStepVerificationResponse)
          PushTwoStepVerificationResponseOrBuilder {
    // Use PushTwoStepVerificationResponse.newBuilder() to construct.
    private PushTwoStepVerificationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PushTwoStepVerificationResponse() {
      username_ = "";
      userId_ = 0L;
      authorHash_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private PushTwoStepVerificationResponse(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.iGap.proto.ProtoResponse.Response.Builder subBuilder = null;
              if (response_ != null) {
                subBuilder = response_.toBuilder();
              }
              response_ = input.readMessage(com.iGap.proto.ProtoResponse.Response.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(response_);
                response_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 24: {

              userId_ = input.readUInt64();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              authorHash_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.iGap.proto.ProtoPushTwoStepVerification.internal_static_proto_PushTwoStepVerificationResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.iGap.proto.ProtoPushTwoStepVerification.internal_static_proto_PushTwoStepVerificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.class, com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.Builder.class);
    }

    public static final int RESPONSE_FIELD_NUMBER = 1;
    private com.iGap.proto.ProtoResponse.Response response_;

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public boolean hasResponse() {
      return response_ != null;
    }

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public com.iGap.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? com.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public com.iGap.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder() {
      return getResponse();
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object username_;

    /**
     * <code>optional string username = 2;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }

    /**
     * <code>optional string username = 2;</code>
     */
    public com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_ID_FIELD_NUMBER = 3;
    private long userId_;

    /**
     * <code>optional uint64 user_id = 3;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int AUTHOR_HASH_FIELD_NUMBER = 4;
    private volatile java.lang.Object authorHash_;

    /**
     * <code>optional string author_hash = 4;</code>
     */
    public java.lang.String getAuthorHash() {
      java.lang.Object ref = authorHash_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authorHash_ = s;
        return s;
      }
    }

    /**
     * <code>optional string author_hash = 4;</code>
     */
    public com.google.protobuf.ByteString getAuthorHashBytes() {
      java.lang.Object ref = authorHash_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        authorHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (userId_ != 0L) {
        output.writeUInt64(3, userId_);
      }
      if (!getAuthorHashBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, authorHash_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (response_ != null) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getResponse());
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, userId_);
      }
      if (!getAuthorHashBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, authorHash_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse)) {
        return super.equals(obj);
      }
      com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse other = (com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse) obj;

      boolean result = true;
      result = result && (hasResponse() == other.hasResponse());
      if (hasResponse()) {
        result = result && getResponse().equals(other.getResponse());
      }
      result = result && getUsername().equals(other.getUsername());
      result = result && (getUserId() == other.getUserId());
      result = result && getAuthorHash().equals(other.getAuthorHash());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getUserId());
      hash = (37 * hash) + AUTHOR_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorHash().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code proto.PushTwoStepVerificationResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:proto.PushTwoStepVerificationResponse)
            com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.iGap.proto.ProtoPushTwoStepVerification.internal_static_proto_PushTwoStepVerificationResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.iGap.proto.ProtoPushTwoStepVerification.internal_static_proto_PushTwoStepVerificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.class, com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.Builder.class);
      }

      // Construct using com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        if (responseBuilder_ == null) {
          response_ = null;
        } else {
          response_ = null;
          responseBuilder_ = null;
        }
        username_ = "";

        userId_ = 0L;

        authorHash_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.iGap.proto.ProtoPushTwoStepVerification.internal_static_proto_PushTwoStepVerificationResponse_descriptor;
      }

      public com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse getDefaultInstanceForType() {
        return com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.getDefaultInstance();
      }

      public com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse build() {
        com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse buildPartial() {
        com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse result = new com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse(this);
        if (responseBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseBuilder_.build();
        }
        result.username_ = username_;
        result.userId_ = userId_;
        result.authorHash_ = authorHash_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse) {
          return mergeFrom((com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse other) {
        if (other == com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse.getDefaultInstance()) return this;
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (!other.getAuthorHash().isEmpty()) {
          authorHash_ = other.authorHash_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.iGap.proto.ProtoResponse.Response response_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.iGap.proto.ProtoResponse.Response, com.iGap.proto.ProtoResponse.Response.Builder, com.iGap.proto.ProtoResponse.ResponseOrBuilder> responseBuilder_;

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public boolean hasResponse() {
        return responseBuilder_ != null || response_ != null;
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public com.iGap.proto.ProtoResponse.Response getResponse() {
        if (responseBuilder_ == null) {
          return response_ == null ? com.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(com.iGap.proto.ProtoResponse.Response value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }

        return this;
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(com.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder mergeResponse(com.iGap.proto.ProtoResponse.Response value) {
        if (responseBuilder_ == null) {
          if (response_ != null) {
            response_ = com.iGap.proto.ProtoResponse.Response.newBuilder(response_).mergeFrom(value).buildPartial();
          } else {
            response_ = value;
          }
          onChanged();
        } else {
          responseBuilder_.mergeFrom(value);
        }

        return this;
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          response_ = null;
          onChanged();
        } else {
          response_ = null;
          responseBuilder_ = null;
        }

        return this;
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public com.iGap.proto.ProtoResponse.Response.Builder getResponseBuilder() {

        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public com.iGap.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_ == null ? com.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
        }
      }

      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.iGap.proto.ProtoResponse.Response, com.iGap.proto.ProtoResponse.Response.Builder, com.iGap.proto.ProtoResponse.ResponseOrBuilder> getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.iGap.proto.ProtoResponse.Response, com.iGap.proto.ProtoResponse.Response.Builder, com.iGap.proto.ProtoResponse.ResponseOrBuilder>(getResponse(), getParentForChildren(), isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      private java.lang.Object username_ = "";

      /**
       * <code>optional string username = 2;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string username = 2;</code>
       */
      public com.google.protobuf.ByteString getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string username = 2;</code>
       */
      public Builder setUsername(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        username_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string username = 2;</code>
       */
      public Builder clearUsername() {

        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }

      /**
       * <code>optional string username = 2;</code>
       */
      public Builder setUsernameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        username_ = value;
        onChanged();
        return this;
      }

      private long userId_;

      /**
       * <code>optional uint64 user_id = 3;</code>
       */
      public long getUserId() {
        return userId_;
      }

      /**
       * <code>optional uint64 user_id = 3;</code>
       */
      public Builder setUserId(long value) {

        userId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 user_id = 3;</code>
       */
      public Builder clearUserId() {

        userId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object authorHash_ = "";

      /**
       * <code>optional string author_hash = 4;</code>
       */
      public java.lang.String getAuthorHash() {
        java.lang.Object ref = authorHash_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authorHash_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string author_hash = 4;</code>
       */
      public com.google.protobuf.ByteString getAuthorHashBytes() {
        java.lang.Object ref = authorHash_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          authorHash_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string author_hash = 4;</code>
       */
      public Builder setAuthorHash(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        authorHash_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string author_hash = 4;</code>
       */
      public Builder clearAuthorHash() {

        authorHash_ = getDefaultInstance().getAuthorHash();
        onChanged();
        return this;
      }

      /**
       * <code>optional string author_hash = 4;</code>
       */
      public Builder setAuthorHashBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        authorHash_ = value;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.PushTwoStepVerificationResponse)
    }

    // @@protoc_insertion_point(class_scope:proto.PushTwoStepVerificationResponse)
    private static final com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse();
    }

    public static com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushTwoStepVerificationResponse> PARSER = new com.google.protobuf.AbstractParser<PushTwoStepVerificationResponse>() {
      public PushTwoStepVerificationResponse parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return new PushTwoStepVerificationResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PushTwoStepVerificationResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PushTwoStepVerificationResponse> getParserForType() {
      return PARSER;
    }

    public com.iGap.proto.ProtoPushTwoStepVerification.PushTwoStepVerificationResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor internal_static_proto_PushTwoStepVerificationResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_proto_PushTwoStepVerificationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
            "\n\035PushTwoStepVerification.proto\022\005proto\032\016" +
                    "Response.proto\"|\n\037PushTwoStepVerificatio" +
                    "nResponse\022!\n\010response\030\001 \001(\0132\017.proto.Resp" +
                    "onse\022\020\n\010username\030\002 \001(\t\022\017\n\007user_id\030\003 \001(\004\022" +
                    "\023\n\013author_hash\030\004 \001(\tB.\n\016com.iGap.protoB\034" +
                    "ProtoPushTwoStepVerificationb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[]{
            com.iGap.proto.ProtoResponse.getDescriptor(),
    }, assigner);
    internal_static_proto_PushTwoStepVerificationResponse_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PushTwoStepVerificationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PushTwoStepVerificationResponse_descriptor,
        new java.lang.String[] { "Response", "Username", "UserId", "AuthorHash", });
    com.iGap.proto.ProtoResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
