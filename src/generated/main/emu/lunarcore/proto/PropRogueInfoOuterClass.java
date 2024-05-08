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

public final class PropRogueInfoOuterClass {
  /**
   * Protobuf type {@code PropRogueInfo}
   */
  public static final class PropRogueInfo extends ProtoMessage<PropRogueInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 site_id = 6;</code>
     */
    private int siteId;

    /**
     * <code>optional uint32 room_id = 11;</code>
     */
    private int roomId;

    private PropRogueInfo() {
    }

    /**
     * @return a new empty instance of {@code PropRogueInfo}
     */
    public static PropRogueInfo newInstance() {
      return new PropRogueInfo();
    }

    /**
     * <code>optional uint32 site_id = 6;</code>
     * @return whether the siteId field is set
     */
    public boolean hasSiteId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 site_id = 6;</code>
     * @return this
     */
    public PropRogueInfo clearSiteId() {
      bitField0_ &= ~0x00000001;
      siteId = 0;
      return this;
    }

    /**
     * <code>optional uint32 site_id = 6;</code>
     * @return the siteId
     */
    public int getSiteId() {
      return siteId;
    }

    /**
     * <code>optional uint32 site_id = 6;</code>
     * @param value the siteId to set
     * @return this
     */
    public PropRogueInfo setSiteId(final int value) {
      bitField0_ |= 0x00000001;
      siteId = value;
      return this;
    }

    /**
     * <code>optional uint32 room_id = 11;</code>
     * @return whether the roomId field is set
     */
    public boolean hasRoomId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 room_id = 11;</code>
     * @return this
     */
    public PropRogueInfo clearRoomId() {
      bitField0_ &= ~0x00000002;
      roomId = 0;
      return this;
    }

    /**
     * <code>optional uint32 room_id = 11;</code>
     * @return the roomId
     */
    public int getRoomId() {
      return roomId;
    }

    /**
     * <code>optional uint32 room_id = 11;</code>
     * @param value the roomId to set
     * @return this
     */
    public PropRogueInfo setRoomId(final int value) {
      bitField0_ |= 0x00000002;
      roomId = value;
      return this;
    }

    @Override
    public PropRogueInfo copyFrom(final PropRogueInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        siteId = other.siteId;
        roomId = other.roomId;
      }
      return this;
    }

    @Override
    public PropRogueInfo mergeFrom(final PropRogueInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSiteId()) {
        setSiteId(other.siteId);
      }
      if (other.hasRoomId()) {
        setRoomId(other.roomId);
      }
      return this;
    }

    @Override
    public PropRogueInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      siteId = 0;
      roomId = 0;
      return this;
    }

    @Override
    public PropRogueInfo clearQuick() {
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
      if (!(o instanceof PropRogueInfo)) {
        return false;
      }
      PropRogueInfo other = (PropRogueInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasSiteId() || siteId == other.siteId)
        && (!hasRoomId() || roomId == other.roomId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(siteId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(roomId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(siteId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(roomId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PropRogueInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // siteId
            siteId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // roomId
            roomId = input.readUInt32();
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
        output.writeUInt32(FieldNames.siteId, siteId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.roomId, roomId);
      }
      output.endObject();
    }

    @Override
    public PropRogueInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -902090046:
          case 2100001043: {
            if (input.isAtField(FieldNames.siteId)) {
              if (!input.trySkipNullValue()) {
                siteId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -925319338:
          case 1379892991: {
            if (input.isAtField(FieldNames.roomId)) {
              if (!input.trySkipNullValue()) {
                roomId = input.readUInt32();
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
    public PropRogueInfo clone() {
      return new PropRogueInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PropRogueInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PropRogueInfo(), data).checkInitialized();
    }

    public static PropRogueInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropRogueInfo(), input).checkInitialized();
    }

    public static PropRogueInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropRogueInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PropRogueInfo messages
     */
    public static MessageFactory<PropRogueInfo> getFactory() {
      return PropRogueInfoFactory.INSTANCE;
    }

    private enum PropRogueInfoFactory implements MessageFactory<PropRogueInfo> {
      INSTANCE;

      @Override
      public PropRogueInfo create() {
        return PropRogueInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName siteId = FieldName.forField("siteId", "site_id");

      static final FieldName roomId = FieldName.forField("roomId", "room_id");
    }
  }
}
