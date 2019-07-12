/*
 * Copyright (C) 2019 Lightbend Inc. <https://www.lightbend.com>
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtobufProtocol.proto

package akka.remote;

public final class ProtobufProtocol {
  private ProtobufProtocol() {}
  public static void registerAllExtensions(
      akka.protobuf.ExtensionRegistry registry) {
  }
  public interface MyMessageOrBuilder
      extends akka.protobuf.MessageOrBuilder {

    // required uint64 id = 1;
    /**
     * <code>required uint64 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required uint64 id = 1;</code>
     */
    long getId();

    // required string name = 2;
    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    akka.protobuf.ByteString
        getNameBytes();

    // required bool status = 3;
    /**
     * <code>required bool status = 3;</code>
     */
    boolean hasStatus();
    /**
     * <code>required bool status = 3;</code>
     */
    boolean getStatus();
  }
  /**
   * Protobuf type {@code MyMessage}
   */
  public static final class MyMessage extends
      akka.protobuf.GeneratedMessage
      implements MyMessageOrBuilder {
    // Use MyMessage.newBuilder() to construct.
    private MyMessage(akka.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MyMessage(boolean noInit) { this.unknownFields = akka.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MyMessage defaultInstance;
    public static MyMessage getDefaultInstance() {
      return defaultInstance;
    }

    public MyMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final akka.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final akka.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MyMessage(
        akka.protobuf.CodedInputStream input,
        akka.protobuf.ExtensionRegistryLite extensionRegistry)
        throws akka.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      akka.protobuf.UnknownFieldSet.Builder unknownFields =
          akka.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readUInt64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              status_ = input.readBool();
              break;
            }
          }
        }
      } catch (akka.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new akka.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final akka.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return akka.remote.ProtobufProtocol.internal_static_MyMessage_descriptor;
    }

    protected akka.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return akka.remote.ProtobufProtocol.internal_static_MyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              akka.remote.ProtobufProtocol.MyMessage.class, akka.remote.ProtobufProtocol.MyMessage.Builder.class);
    }

    public static akka.protobuf.Parser<MyMessage> PARSER =
        new akka.protobuf.AbstractParser<MyMessage>() {
      public MyMessage parsePartialFrom(
          akka.protobuf.CodedInputStream input,
          akka.protobuf.ExtensionRegistryLite extensionRegistry)
          throws akka.protobuf.InvalidProtocolBufferException {
        return new MyMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public akka.protobuf.Parser<MyMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>required uint64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    // required string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        akka.protobuf.ByteString bs = 
            (akka.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     */
    public akka.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        akka.protobuf.ByteString b = 
            akka.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (akka.protobuf.ByteString) ref;
      }
    }

    // required bool status = 3;
    public static final int STATUS_FIELD_NUMBER = 3;
    private boolean status_;
    /**
     * <code>required bool status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bool status = 3;</code>
     */
    public boolean getStatus() {
      return status_;
    }

    private void initFields() {
      id_ = 0L;
      name_ = "";
      status_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(akka.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, status_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += akka.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += akka.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += akka.protobuf.CodedOutputStream
          .computeBoolSize(3, status_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(
        akka.protobuf.ByteString data)
        throws akka.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(
        akka.protobuf.ByteString data,
        akka.protobuf.ExtensionRegistryLite extensionRegistry)
        throws akka.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(byte[] data)
        throws akka.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(
        byte[] data,
        akka.protobuf.ExtensionRegistryLite extensionRegistry)
        throws akka.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(
        java.io.InputStream input,
        akka.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseDelimitedFrom(
        java.io.InputStream input,
        akka.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(
        akka.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static akka.remote.ProtobufProtocol.MyMessage parseFrom(
        akka.protobuf.CodedInputStream input,
        akka.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(akka.remote.ProtobufProtocol.MyMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        akka.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MyMessage}
     */
    public static final class Builder extends
        akka.protobuf.GeneratedMessage.Builder<Builder>
       implements akka.remote.ProtobufProtocol.MyMessageOrBuilder {
      public static final akka.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return akka.remote.ProtobufProtocol.internal_static_MyMessage_descriptor;
      }

      protected akka.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return akka.remote.ProtobufProtocol.internal_static_MyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                akka.remote.ProtobufProtocol.MyMessage.class, akka.remote.ProtobufProtocol.MyMessage.Builder.class);
      }

      // Construct using akka.remote.ProtobufProtocol.MyMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          akka.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (akka.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public akka.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return akka.remote.ProtobufProtocol.internal_static_MyMessage_descriptor;
      }

      public akka.remote.ProtobufProtocol.MyMessage getDefaultInstanceForType() {
        return akka.remote.ProtobufProtocol.MyMessage.getDefaultInstance();
      }

      public akka.remote.ProtobufProtocol.MyMessage build() {
        akka.remote.ProtobufProtocol.MyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public akka.remote.ProtobufProtocol.MyMessage buildPartial() {
        akka.remote.ProtobufProtocol.MyMessage result = new akka.remote.ProtobufProtocol.MyMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(akka.protobuf.Message other) {
        if (other instanceof akka.remote.ProtobufProtocol.MyMessage) {
          return mergeFrom((akka.remote.ProtobufProtocol.MyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(akka.remote.ProtobufProtocol.MyMessage other) {
        if (other == akka.remote.ProtobufProtocol.MyMessage.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        if (!hasStatus()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          akka.protobuf.CodedInputStream input,
          akka.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        akka.remote.ProtobufProtocol.MyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (akka.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (akka.remote.ProtobufProtocol.MyMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 id = 1;
      private long id_ ;
      /**
       * <code>required uint64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>required uint64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // required string name = 2;
      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((akka.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public akka.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          akka.protobuf.ByteString b = 
              akka.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (akka.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setNameBytes(
          akka.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      // required bool status = 3;
      private boolean status_ ;
      /**
       * <code>required bool status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bool status = 3;</code>
       */
      public boolean getStatus() {
        return status_;
      }
      /**
       * <code>required bool status = 3;</code>
       */
      public Builder setStatus(boolean value) {
        bitField0_ |= 0x00000004;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool status = 3;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MyMessage)
    }

    static {
      defaultInstance = new MyMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MyMessage)
  }

  private static akka.protobuf.Descriptors.Descriptor
    internal_static_MyMessage_descriptor;
  private static
    akka.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MyMessage_fieldAccessorTable;

  public static akka.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static akka.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ProtobufProtocol.proto\"5\n\tMyMessage\022\n\n" +
      "\002id\030\001 \002(\004\022\014\n\004name\030\002 \002(\t\022\016\n\006status\030\003 \002(\010B" +
      "\r\n\013akka.remote"
    };
    akka.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new akka.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public akka.protobuf.ExtensionRegistry assignDescriptors(
            akka.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MyMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MyMessage_fieldAccessorTable = new
            akka.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MyMessage_descriptor,
              new java.lang.String[] { "Id", "Name", "Status", });
          return null;
        }
      };
    akka.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new akka.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
