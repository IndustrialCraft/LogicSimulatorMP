// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messages.proto

package com.github.industrialcraft.logicsimulatormp.common.proto.generated;

/**
 * Protobuf type {@code LogicSimulator.UpdateLogicGateMessage}
 */
public final class UpdateLogicGateMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LogicSimulator.UpdateLogicGateMessage)
    UpdateLogicGateMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateLogicGateMessage.newBuilder() to construct.
  private UpdateLogicGateMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateLogicGateMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateLogicGateMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateLogicGateMessage(
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
          case 8: {
            bitField0_ |= 0x00000001;
            id_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            type_ = input.readInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            numInputs_ = input.readInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            numOutputs_ = input.readInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            posX_ = input.readInt64();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            posY_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.industrialcraft.logicsimulatormp.common.proto.generated.Messages.internal_static_LogicSimulator_UpdateLogicGateMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.industrialcraft.logicsimulatormp.common.proto.generated.Messages.internal_static_LogicSimulator_UpdateLogicGateMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.class, com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>required int64 id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>required int32 type = 2;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required int32 type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int NUMINPUTS_FIELD_NUMBER = 3;
  private int numInputs_;
  /**
   * <code>required int32 numInputs = 3;</code>
   * @return Whether the numInputs field is set.
   */
  @java.lang.Override
  public boolean hasNumInputs() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required int32 numInputs = 3;</code>
   * @return The numInputs.
   */
  @java.lang.Override
  public int getNumInputs() {
    return numInputs_;
  }

  public static final int NUMOUTPUTS_FIELD_NUMBER = 4;
  private int numOutputs_;
  /**
   * <code>required int32 numOutputs = 4;</code>
   * @return Whether the numOutputs field is set.
   */
  @java.lang.Override
  public boolean hasNumOutputs() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>required int32 numOutputs = 4;</code>
   * @return The numOutputs.
   */
  @java.lang.Override
  public int getNumOutputs() {
    return numOutputs_;
  }

  public static final int POSX_FIELD_NUMBER = 5;
  private long posX_;
  /**
   * <code>required int64 posX = 5;</code>
   * @return Whether the posX field is set.
   */
  @java.lang.Override
  public boolean hasPosX() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>required int64 posX = 5;</code>
   * @return The posX.
   */
  @java.lang.Override
  public long getPosX() {
    return posX_;
  }

  public static final int POSY_FIELD_NUMBER = 6;
  private long posY_;
  /**
   * <code>required int64 posY = 6;</code>
   * @return Whether the posY field is set.
   */
  @java.lang.Override
  public boolean hasPosY() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>required int64 posY = 6;</code>
   * @return The posY.
   */
  @java.lang.Override
  public long getPosY() {
    return posY_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasType()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasNumInputs()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasNumOutputs()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasPosX()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasPosY()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, type_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, numInputs_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, numOutputs_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(5, posX_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeInt64(6, posY_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, type_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, numInputs_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numOutputs_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, posX_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, posY_);
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
    if (!(obj instanceof com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage)) {
      return super.equals(obj);
    }
    com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage other = (com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (getType()
          != other.getType()) return false;
    }
    if (hasNumInputs() != other.hasNumInputs()) return false;
    if (hasNumInputs()) {
      if (getNumInputs()
          != other.getNumInputs()) return false;
    }
    if (hasNumOutputs() != other.hasNumOutputs()) return false;
    if (hasNumOutputs()) {
      if (getNumOutputs()
          != other.getNumOutputs()) return false;
    }
    if (hasPosX() != other.hasPosX()) return false;
    if (hasPosX()) {
      if (getPosX()
          != other.getPosX()) return false;
    }
    if (hasPosY() != other.hasPosY()) return false;
    if (hasPosY()) {
      if (getPosY()
          != other.getPosY()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
    }
    if (hasNumInputs()) {
      hash = (37 * hash) + NUMINPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getNumInputs();
    }
    if (hasNumOutputs()) {
      hash = (37 * hash) + NUMOUTPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getNumOutputs();
    }
    if (hasPosX()) {
      hash = (37 * hash) + POSX_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPosX());
    }
    if (hasPosY()) {
      hash = (37 * hash) + POSY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPosY());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parseFrom(
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
  public static Builder newBuilder(com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage prototype) {
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
   * Protobuf type {@code LogicSimulator.UpdateLogicGateMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LogicSimulator.UpdateLogicGateMessage)
      com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.industrialcraft.logicsimulatormp.common.proto.generated.Messages.internal_static_LogicSimulator_UpdateLogicGateMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.industrialcraft.logicsimulatormp.common.proto.generated.Messages.internal_static_LogicSimulator_UpdateLogicGateMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.class, com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.Builder.class);
    }

    // Construct using com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      numInputs_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      numOutputs_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      posX_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      posY_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.industrialcraft.logicsimulatormp.common.proto.generated.Messages.internal_static_LogicSimulator_UpdateLogicGateMessage_descriptor;
    }

    @java.lang.Override
    public com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage getDefaultInstanceForType() {
      return com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage build() {
      com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage buildPartial() {
      com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage result = new com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numInputs_ = numInputs_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numOutputs_ = numOutputs_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.posX_ = posX_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.posY_ = posY_;
        to_bitField0_ |= 0x00000020;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage) {
        return mergeFrom((com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage other) {
      if (other == com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasNumInputs()) {
        setNumInputs(other.getNumInputs());
      }
      if (other.hasNumOutputs()) {
        setNumOutputs(other.getNumOutputs());
      }
      if (other.hasPosX()) {
        setPosX(other.getPosX());
      }
      if (other.hasPosY()) {
        setPosY(other.getPosY());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasId()) {
        return false;
      }
      if (!hasType()) {
        return false;
      }
      if (!hasNumInputs()) {
        return false;
      }
      if (!hasNumOutputs()) {
        return false;
      }
      if (!hasPosX()) {
        return false;
      }
      if (!hasPosY()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>required int64 id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>required int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>required int32 type = 2;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int32 type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <code>required int32 type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      bitField0_ |= 0x00000002;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private int numInputs_ ;
    /**
     * <code>required int32 numInputs = 3;</code>
     * @return Whether the numInputs field is set.
     */
    @java.lang.Override
    public boolean hasNumInputs() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int32 numInputs = 3;</code>
     * @return The numInputs.
     */
    @java.lang.Override
    public int getNumInputs() {
      return numInputs_;
    }
    /**
     * <code>required int32 numInputs = 3;</code>
     * @param value The numInputs to set.
     * @return This builder for chaining.
     */
    public Builder setNumInputs(int value) {
      bitField0_ |= 0x00000004;
      numInputs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 numInputs = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumInputs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numInputs_ = 0;
      onChanged();
      return this;
    }

    private int numOutputs_ ;
    /**
     * <code>required int32 numOutputs = 4;</code>
     * @return Whether the numOutputs field is set.
     */
    @java.lang.Override
    public boolean hasNumOutputs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required int32 numOutputs = 4;</code>
     * @return The numOutputs.
     */
    @java.lang.Override
    public int getNumOutputs() {
      return numOutputs_;
    }
    /**
     * <code>required int32 numOutputs = 4;</code>
     * @param value The numOutputs to set.
     * @return This builder for chaining.
     */
    public Builder setNumOutputs(int value) {
      bitField0_ |= 0x00000008;
      numOutputs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 numOutputs = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumOutputs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numOutputs_ = 0;
      onChanged();
      return this;
    }

    private long posX_ ;
    /**
     * <code>required int64 posX = 5;</code>
     * @return Whether the posX field is set.
     */
    @java.lang.Override
    public boolean hasPosX() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required int64 posX = 5;</code>
     * @return The posX.
     */
    @java.lang.Override
    public long getPosX() {
      return posX_;
    }
    /**
     * <code>required int64 posX = 5;</code>
     * @param value The posX to set.
     * @return This builder for chaining.
     */
    public Builder setPosX(long value) {
      bitField0_ |= 0x00000010;
      posX_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 posX = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosX() {
      bitField0_ = (bitField0_ & ~0x00000010);
      posX_ = 0L;
      onChanged();
      return this;
    }

    private long posY_ ;
    /**
     * <code>required int64 posY = 6;</code>
     * @return Whether the posY field is set.
     */
    @java.lang.Override
    public boolean hasPosY() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>required int64 posY = 6;</code>
     * @return The posY.
     */
    @java.lang.Override
    public long getPosY() {
      return posY_;
    }
    /**
     * <code>required int64 posY = 6;</code>
     * @param value The posY to set.
     * @return This builder for chaining.
     */
    public Builder setPosY(long value) {
      bitField0_ |= 0x00000020;
      posY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 posY = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosY() {
      bitField0_ = (bitField0_ & ~0x00000020);
      posY_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LogicSimulator.UpdateLogicGateMessage)
  }

  // @@protoc_insertion_point(class_scope:LogicSimulator.UpdateLogicGateMessage)
  private static final com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage();
  }

  public static com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UpdateLogicGateMessage>
      PARSER = new com.google.protobuf.AbstractParser<UpdateLogicGateMessage>() {
    @java.lang.Override
    public UpdateLogicGateMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateLogicGateMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateLogicGateMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateLogicGateMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

