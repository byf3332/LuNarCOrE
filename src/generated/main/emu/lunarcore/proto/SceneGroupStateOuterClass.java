// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SceneGroupStateOuterClass {
  /**
   * Protobuf type {@code SceneGroupState}
   */
  public static final class SceneGroupState extends ProtoMessage<SceneGroupState> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 state = 2;</code>
     */
    private int state;

    /**
     * <code>optional uint32 group_id = 10;</code>
     */
    private int groupId;

    /**
     * <code>optional bool is_default = 5;</code>
     */
    private boolean isDefault;

    private SceneGroupState() {
    }

    /**
     * @return a new empty instance of {@code SceneGroupState}
     */
    public static SceneGroupState newInstance() {
      return new SceneGroupState();
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @return whether the state field is set
     */
    public boolean hasState() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @return this
     */
    public SceneGroupState clearState() {
      bitField0_ &= ~0x00000001;
      state = 0;
      return this;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @return the state
     */
    public int getState() {
      return state;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @param value the state to set
     * @return this
     */
    public SceneGroupState setState(final int value) {
      bitField0_ |= 0x00000001;
      state = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return this
     */
    public SceneGroupState clearGroupId() {
      bitField0_ &= ~0x00000002;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @param value the groupId to set
     * @return this
     */
    public SceneGroupState setGroupId(final int value) {
      bitField0_ |= 0x00000002;
      groupId = value;
      return this;
    }

    /**
     * <code>optional bool is_default = 5;</code>
     * @return whether the isDefault field is set
     */
    public boolean hasIsDefault() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_default = 5;</code>
     * @return this
     */
    public SceneGroupState clearIsDefault() {
      bitField0_ &= ~0x00000004;
      isDefault = false;
      return this;
    }

    /**
     * <code>optional bool is_default = 5;</code>
     * @return the isDefault
     */
    public boolean getIsDefault() {
      return isDefault;
    }

    /**
     * <code>optional bool is_default = 5;</code>
     * @param value the isDefault to set
     * @return this
     */
    public SceneGroupState setIsDefault(final boolean value) {
      bitField0_ |= 0x00000004;
      isDefault = value;
      return this;
    }

    @Override
    public SceneGroupState copyFrom(final SceneGroupState other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        state = other.state;
        groupId = other.groupId;
        isDefault = other.isDefault;
      }
      return this;
    }

    @Override
    public SceneGroupState mergeFrom(final SceneGroupState other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasState()) {
        setState(other.state);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasIsDefault()) {
        setIsDefault(other.isDefault);
      }
      return this;
    }

    @Override
    public SceneGroupState clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      state = 0;
      groupId = 0;
      isDefault = false;
      return this;
    }

    @Override
    public SceneGroupState clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneGroupState)) {
        return false;
      }
      SceneGroupState other = (SceneGroupState) o;
      return bitField0_ == other.bitField0_
        && (!hasState() || state == other.state)
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasIsDefault() || isDefault == other.isDefault);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isDefault);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneGroupState mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // state
            state = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isDefault
            isDefault = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.state, state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isDefault, isDefault);
      }
      output.endObject();
    }

    @Override
    public SceneGroupState mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109757585: {
            if (input.isAtField(FieldNames.state)) {
              if (!input.trySkipNullValue()) {
                state = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 965025207:
          case -1249853396: {
            if (input.isAtField(FieldNames.isDefault)) {
              if (!input.trySkipNullValue()) {
                isDefault = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SceneGroupState clone() {
      return new SceneGroupState().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneGroupState parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneGroupState(), data).checkInitialized();
    }

    public static SceneGroupState parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneGroupState(), input).checkInitialized();
    }

    public static SceneGroupState parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneGroupState(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneGroupState messages
     */
    public static MessageFactory<SceneGroupState> getFactory() {
      return SceneGroupStateFactory.INSTANCE;
    }

    private enum SceneGroupStateFactory implements MessageFactory<SceneGroupState> {
      INSTANCE;

      @Override
      public SceneGroupState create() {
        return SceneGroupState.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName state = FieldName.forField("state");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName isDefault = FieldName.forField("isDefault", "is_default");
    }
  }
}
