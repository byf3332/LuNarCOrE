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
import us.hebi.quickbuf.RepeatedInt;

public final class GetUnlockTeleportScRspOuterClass {
  /**
   * Protobuf type {@code GetUnlockTeleportScRsp}
   */
  public static final class GetUnlockTeleportScRsp extends ProtoMessage<GetUnlockTeleportScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 12;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     */
    private final RepeatedInt unlockedTeleportList = RepeatedInt.newEmptyInstance();

    private GetUnlockTeleportScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetUnlockTeleportScRsp}
     */
    public static GetUnlockTeleportScRsp newInstance() {
      return new GetUnlockTeleportScRsp();
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return this
     */
    public GetUnlockTeleportScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetUnlockTeleportScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     * @return whether the unlockedTeleportList field is set
     */
    public boolean hasUnlockedTeleportList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     * @return this
     */
    public GetUnlockTeleportScRsp clearUnlockedTeleportList() {
      bitField0_ &= ~0x00000002;
      unlockedTeleportList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedTeleportList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUnlockedTeleportList() {
      return unlockedTeleportList;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUnlockedTeleportList() {
      bitField0_ |= 0x00000002;
      return unlockedTeleportList;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     * @param value the unlockedTeleportList to add
     * @return this
     */
    public GetUnlockTeleportScRsp addUnlockedTeleportList(final int value) {
      bitField0_ |= 0x00000002;
      unlockedTeleportList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 8;</code>
     * @param values the unlockedTeleportList to add
     * @return this
     */
    public GetUnlockTeleportScRsp addAllUnlockedTeleportList(final int... values) {
      bitField0_ |= 0x00000002;
      unlockedTeleportList.addAll(values);
      return this;
    }

    @Override
    public GetUnlockTeleportScRsp copyFrom(final GetUnlockTeleportScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        unlockedTeleportList.copyFrom(other.unlockedTeleportList);
      }
      return this;
    }

    @Override
    public GetUnlockTeleportScRsp mergeFrom(final GetUnlockTeleportScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasUnlockedTeleportList()) {
        getMutableUnlockedTeleportList().addAll(other.unlockedTeleportList);
      }
      return this;
    }

    @Override
    public GetUnlockTeleportScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      unlockedTeleportList.clear();
      return this;
    }

    @Override
    public GetUnlockTeleportScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockedTeleportList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetUnlockTeleportScRsp)) {
        return false;
      }
      GetUnlockTeleportScRsp other = (GetUnlockTeleportScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasUnlockedTeleportList() || unlockedTeleportList.equals(other.unlockedTeleportList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < unlockedTeleportList.length(); i++) {
          output.writeRawByte((byte) 64);
          output.writeUInt32NoTag(unlockedTeleportList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * unlockedTeleportList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(unlockedTeleportList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetUnlockTeleportScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // unlockedTeleportList [packed=true]
            input.readPackedUInt32(unlockedTeleportList, tag);
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
          case 64: {
            // unlockedTeleportList [packed=false]
            tag = input.readRepeatedUInt32(unlockedTeleportList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.unlockedTeleportList, unlockedTeleportList);
      }
      output.endObject();
    }

    @Override
    public GetUnlockTeleportScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 856936684:
          case -10753834: {
            if (input.isAtField(FieldNames.unlockedTeleportList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(unlockedTeleportList);
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
    public GetUnlockTeleportScRsp clone() {
      return new GetUnlockTeleportScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetUnlockTeleportScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetUnlockTeleportScRsp(), data).checkInitialized();
    }

    public static GetUnlockTeleportScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetUnlockTeleportScRsp(), input).checkInitialized();
    }

    public static GetUnlockTeleportScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetUnlockTeleportScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetUnlockTeleportScRsp messages
     */
    public static MessageFactory<GetUnlockTeleportScRsp> getFactory() {
      return GetUnlockTeleportScRspFactory.INSTANCE;
    }

    private enum GetUnlockTeleportScRspFactory implements MessageFactory<GetUnlockTeleportScRsp> {
      INSTANCE;

      @Override
      public GetUnlockTeleportScRsp create() {
        return GetUnlockTeleportScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName unlockedTeleportList = FieldName.forField("unlockedTeleportList", "unlocked_teleport_list");
    }
  }
}
