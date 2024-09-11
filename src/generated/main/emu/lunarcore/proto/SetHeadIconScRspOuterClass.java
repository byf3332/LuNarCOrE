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

public final class SetHeadIconScRspOuterClass {
  /**
   * Protobuf type {@code SetHeadIconScRsp}
   */
  public static final class SetHeadIconScRsp extends ProtoMessage<SetHeadIconScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 current_head_icon_id = 9;</code>
     */
    private int currentHeadIconId;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    private SetHeadIconScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetHeadIconScRsp}
     */
    public static SetHeadIconScRsp newInstance() {
      return new SetHeadIconScRsp();
    }

    /**
     * <code>optional uint32 current_head_icon_id = 9;</code>
     * @return whether the currentHeadIconId field is set
     */
    public boolean hasCurrentHeadIconId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 current_head_icon_id = 9;</code>
     * @return this
     */
    public SetHeadIconScRsp clearCurrentHeadIconId() {
      bitField0_ &= ~0x00000001;
      currentHeadIconId = 0;
      return this;
    }

    /**
     * <code>optional uint32 current_head_icon_id = 9;</code>
     * @return the currentHeadIconId
     */
    public int getCurrentHeadIconId() {
      return currentHeadIconId;
    }

    /**
     * <code>optional uint32 current_head_icon_id = 9;</code>
     * @param value the currentHeadIconId to set
     * @return this
     */
    public SetHeadIconScRsp setCurrentHeadIconId(final int value) {
      bitField0_ |= 0x00000001;
      currentHeadIconId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public SetHeadIconScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public SetHeadIconScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    @Override
    public SetHeadIconScRsp copyFrom(final SetHeadIconScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        currentHeadIconId = other.currentHeadIconId;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public SetHeadIconScRsp mergeFrom(final SetHeadIconScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurrentHeadIconId()) {
        setCurrentHeadIconId(other.currentHeadIconId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public SetHeadIconScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      currentHeadIconId = 0;
      retcode = 0;
      return this;
    }

    @Override
    public SetHeadIconScRsp clearQuick() {
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
      if (!(o instanceof SetHeadIconScRsp)) {
        return false;
      }
      SetHeadIconScRsp other = (SetHeadIconScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasCurrentHeadIconId() || currentHeadIconId == other.currentHeadIconId)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(currentHeadIconId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(currentHeadIconId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetHeadIconScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // currentHeadIconId
            currentHeadIconId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.currentHeadIconId, currentHeadIconId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public SetHeadIconScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2107487181:
          case -1003133880: {
            if (input.isAtField(FieldNames.currentHeadIconId)) {
              if (!input.trySkipNullValue()) {
                currentHeadIconId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public SetHeadIconScRsp clone() {
      return new SetHeadIconScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetHeadIconScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetHeadIconScRsp(), data).checkInitialized();
    }

    public static SetHeadIconScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetHeadIconScRsp(), input).checkInitialized();
    }

    public static SetHeadIconScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetHeadIconScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetHeadIconScRsp messages
     */
    public static MessageFactory<SetHeadIconScRsp> getFactory() {
      return SetHeadIconScRspFactory.INSTANCE;
    }

    private enum SetHeadIconScRspFactory implements MessageFactory<SetHeadIconScRsp> {
      INSTANCE;

      @Override
      public SetHeadIconScRsp create() {
        return SetHeadIconScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName currentHeadIconId = FieldName.forField("currentHeadIconId", "current_head_icon_id");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
