// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messages.proto

package com.github.industrialcraft.logicsimulatormp.common.proto.generated;

public interface UpdateLogicGateMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LogicSimulator.UpdateLogicGateMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int64 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>required int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>required int32 type = 2;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>required int32 type = 2;</code>
   * @return The type.
   */
  int getType();

  /**
   * <code>required int32 numInputs = 3;</code>
   * @return Whether the numInputs field is set.
   */
  boolean hasNumInputs();
  /**
   * <code>required int32 numInputs = 3;</code>
   * @return The numInputs.
   */
  int getNumInputs();

  /**
   * <code>required int32 numOutputs = 4;</code>
   * @return Whether the numOutputs field is set.
   */
  boolean hasNumOutputs();
  /**
   * <code>required int32 numOutputs = 4;</code>
   * @return The numOutputs.
   */
  int getNumOutputs();

  /**
   * <code>required int64 posX = 5;</code>
   * @return Whether the posX field is set.
   */
  boolean hasPosX();
  /**
   * <code>required int64 posX = 5;</code>
   * @return The posX.
   */
  long getPosX();

  /**
   * <code>required int64 posY = 6;</code>
   * @return Whether the posY field is set.
   */
  boolean hasPosY();
  /**
   * <code>required int64 posY = 6;</code>
   * @return The posY.
   */
  long getPosY();
}
