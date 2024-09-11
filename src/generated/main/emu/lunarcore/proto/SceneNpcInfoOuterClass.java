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

public final class SceneNpcInfoOuterClass {
  /**
   * Protobuf type {@code SceneNpcInfo}
   */
  public static final class SceneNpcInfo extends ProtoMessage<SceneNpcInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 npc_id = 3;</code>
     */
    private int npcId;

    /**
     * <code>optional .NpcExtraInfo extra_info = 6;</code>
     */
    private final NpcExtraInfoOuterClass.NpcExtraInfo extraInfo = NpcExtraInfoOuterClass.NpcExtraInfo.newInstance();

    private SceneNpcInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneNpcInfo}
     */
    public static SceneNpcInfo newInstance() {
      return new SceneNpcInfo();
    }

    /**
     * <code>optional uint32 npc_id = 3;</code>
     * @return whether the npcId field is set
     */
    public boolean hasNpcId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 npc_id = 3;</code>
     * @return this
     */
    public SceneNpcInfo clearNpcId() {
      bitField0_ &= ~0x00000001;
      npcId = 0;
      return this;
    }

    /**
     * <code>optional uint32 npc_id = 3;</code>
     * @return the npcId
     */
    public int getNpcId() {
      return npcId;
    }

    /**
     * <code>optional uint32 npc_id = 3;</code>
     * @param value the npcId to set
     * @return this
     */
    public SceneNpcInfo setNpcId(final int value) {
      bitField0_ |= 0x00000001;
      npcId = value;
      return this;
    }

    /**
     * <code>optional .NpcExtraInfo extra_info = 6;</code>
     * @return whether the extraInfo field is set
     */
    public boolean hasExtraInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .NpcExtraInfo extra_info = 6;</code>
     * @return this
     */
    public SceneNpcInfo clearExtraInfo() {
      bitField0_ &= ~0x00000002;
      extraInfo.clear();
      return this;
    }

    /**
     * <code>optional .NpcExtraInfo extra_info = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableExtraInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public NpcExtraInfoOuterClass.NpcExtraInfo getExtraInfo() {
      return extraInfo;
    }

    /**
     * <code>optional .NpcExtraInfo extra_info = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public NpcExtraInfoOuterClass.NpcExtraInfo getMutableExtraInfo() {
      bitField0_ |= 0x00000002;
      return extraInfo;
    }

    /**
     * <code>optional .NpcExtraInfo extra_info = 6;</code>
     * @param value the extraInfo to set
     * @return this
     */
    public SceneNpcInfo setExtraInfo(final NpcExtraInfoOuterClass.NpcExtraInfo value) {
      bitField0_ |= 0x00000002;
      extraInfo.copyFrom(value);
      return this;
    }

    @Override
    public SceneNpcInfo copyFrom(final SceneNpcInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        npcId = other.npcId;
        extraInfo.copyFrom(other.extraInfo);
      }
      return this;
    }

    @Override
    public SceneNpcInfo mergeFrom(final SceneNpcInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNpcId()) {
        setNpcId(other.npcId);
      }
      if (other.hasExtraInfo()) {
        getMutableExtraInfo().mergeFrom(other.extraInfo);
      }
      return this;
    }

    @Override
    public SceneNpcInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      npcId = 0;
      extraInfo.clear();
      return this;
    }

    @Override
    public SceneNpcInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      extraInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneNpcInfo)) {
        return false;
      }
      SceneNpcInfo other = (SceneNpcInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasNpcId() || npcId == other.npcId)
        && (!hasExtraInfo() || extraInfo.equals(other.extraInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(npcId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(extraInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(npcId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(extraInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneNpcInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // npcId
            npcId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // extraInfo
            input.readMessage(extraInfo);
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
        output.writeUInt32(FieldNames.npcId, npcId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.extraInfo, extraInfo);
      }
      output.endObject();
    }

    @Override
    public SceneNpcInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 105021404:
          case -1039282375: {
            if (input.isAtField(FieldNames.npcId)) {
              if (!input.trySkipNullValue()) {
                npcId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -253631266:
          case 747541373: {
            if (input.isAtField(FieldNames.extraInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(extraInfo);
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
    public SceneNpcInfo clone() {
      return new SceneNpcInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneNpcInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneNpcInfo(), data).checkInitialized();
    }

    public static SceneNpcInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneNpcInfo(), input).checkInitialized();
    }

    public static SceneNpcInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneNpcInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneNpcInfo messages
     */
    public static MessageFactory<SceneNpcInfo> getFactory() {
      return SceneNpcInfoFactory.INSTANCE;
    }

    private enum SceneNpcInfoFactory implements MessageFactory<SceneNpcInfo> {
      INSTANCE;

      @Override
      public SceneNpcInfo create() {
        return SceneNpcInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName npcId = FieldName.forField("npcId", "npc_id");

      static final FieldName extraInfo = FieldName.forField("extraInfo", "extra_info");
    }
  }
}
