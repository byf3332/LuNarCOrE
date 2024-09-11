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

public final class RogueHandbookBuffOuterClass {
  /**
   * Protobuf type {@code RogueHandbookBuff}
   */
  public static final class RogueHandbookBuff extends ProtoMessage<RogueHandbookBuff> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 buff_id = 4;</code>
     */
    private int buffId;

    private RogueHandbookBuff() {
    }

    /**
     * @return a new empty instance of {@code RogueHandbookBuff}
     */
    public static RogueHandbookBuff newInstance() {
      return new RogueHandbookBuff();
    }

    /**
     * <code>optional uint32 buff_id = 4;</code>
     * @return whether the buffId field is set
     */
    public boolean hasBuffId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 buff_id = 4;</code>
     * @return this
     */
    public RogueHandbookBuff clearBuffId() {
      bitField0_ &= ~0x00000001;
      buffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 4;</code>
     * @return the buffId
     */
    public int getBuffId() {
      return buffId;
    }

    /**
     * <code>optional uint32 buff_id = 4;</code>
     * @param value the buffId to set
     * @return this
     */
    public RogueHandbookBuff setBuffId(final int value) {
      bitField0_ |= 0x00000001;
      buffId = value;
      return this;
    }

    @Override
    public RogueHandbookBuff copyFrom(final RogueHandbookBuff other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffId = other.buffId;
      }
      return this;
    }

    @Override
    public RogueHandbookBuff mergeFrom(final RogueHandbookBuff other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffId()) {
        setBuffId(other.buffId);
      }
      return this;
    }

    @Override
    public RogueHandbookBuff clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffId = 0;
      return this;
    }

    @Override
    public RogueHandbookBuff clearQuick() {
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
      if (!(o instanceof RogueHandbookBuff)) {
        return false;
      }
      RogueHandbookBuff other = (RogueHandbookBuff) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffId() || buffId == other.buffId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(buffId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueHandbookBuff mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // buffId
            buffId = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.buffId, buffId);
      }
      output.endObject();
    }

    @Override
    public RogueHandbookBuff mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1378119474:
          case 227990663: {
            if (input.isAtField(FieldNames.buffId)) {
              if (!input.trySkipNullValue()) {
                buffId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public RogueHandbookBuff clone() {
      return new RogueHandbookBuff().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueHandbookBuff parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueHandbookBuff(), data).checkInitialized();
    }

    public static RogueHandbookBuff parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueHandbookBuff(), input).checkInitialized();
    }

    public static RogueHandbookBuff parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueHandbookBuff(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueHandbookBuff messages
     */
    public static MessageFactory<RogueHandbookBuff> getFactory() {
      return RogueHandbookBuffFactory.INSTANCE;
    }

    private enum RogueHandbookBuffFactory implements MessageFactory<RogueHandbookBuff> {
      INSTANCE;

      @Override
      public RogueHandbookBuff create() {
        return RogueHandbookBuff.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffId = FieldName.forField("buffId", "buff_id");
    }
  }
}
