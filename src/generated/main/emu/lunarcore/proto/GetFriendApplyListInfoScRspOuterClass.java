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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetFriendApplyListInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetFriendApplyListInfoScRsp}
   */
  public static final class GetFriendApplyListInfoScRsp extends ProtoMessage<GetFriendApplyListInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     */
    private final RepeatedMessage<FriendApplyInfoOuterClass.FriendApplyInfo> friendApplyList = RepeatedMessage.newEmptyInstance(FriendApplyInfoOuterClass.FriendApplyInfo.getFactory());

    private GetFriendApplyListInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFriendApplyListInfoScRsp}
     */
    public static GetFriendApplyListInfoScRsp newInstance() {
      return new GetFriendApplyListInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public GetFriendApplyListInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetFriendApplyListInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     * @return whether the friendApplyList field is set
     */
    public boolean hasFriendApplyList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     * @return this
     */
    public GetFriendApplyListInfoScRsp clearFriendApplyList() {
      bitField0_ &= ~0x00000002;
      friendApplyList.clear();
      return this;
    }

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFriendApplyList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<FriendApplyInfoOuterClass.FriendApplyInfo> getFriendApplyList() {
      return friendApplyList;
    }

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<FriendApplyInfoOuterClass.FriendApplyInfo> getMutableFriendApplyList() {
      bitField0_ |= 0x00000002;
      return friendApplyList;
    }

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     * @param value the friendApplyList to add
     * @return this
     */
    public GetFriendApplyListInfoScRsp addFriendApplyList(
        final FriendApplyInfoOuterClass.FriendApplyInfo value) {
      bitField0_ |= 0x00000002;
      friendApplyList.add(value);
      return this;
    }

    /**
     * <code>repeated .FriendApplyInfo friend_apply_list = 10;</code>
     * @param values the friendApplyList to add
     * @return this
     */
    public GetFriendApplyListInfoScRsp addAllFriendApplyList(
        final FriendApplyInfoOuterClass.FriendApplyInfo... values) {
      bitField0_ |= 0x00000002;
      friendApplyList.addAll(values);
      return this;
    }

    @Override
    public GetFriendApplyListInfoScRsp copyFrom(final GetFriendApplyListInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        friendApplyList.copyFrom(other.friendApplyList);
      }
      return this;
    }

    @Override
    public GetFriendApplyListInfoScRsp mergeFrom(final GetFriendApplyListInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasFriendApplyList()) {
        getMutableFriendApplyList().addAll(other.friendApplyList);
      }
      return this;
    }

    @Override
    public GetFriendApplyListInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      friendApplyList.clear();
      return this;
    }

    @Override
    public GetFriendApplyListInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      friendApplyList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFriendApplyListInfoScRsp)) {
        return false;
      }
      GetFriendApplyListInfoScRsp other = (GetFriendApplyListInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasFriendApplyList() || friendApplyList.equals(other.friendApplyList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < friendApplyList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(friendApplyList.get(i));
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
        size += (1 * friendApplyList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(friendApplyList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFriendApplyListInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // friendApplyList
            tag = input.readRepeatedMessage(friendApplyList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.friendApplyList, friendApplyList);
      }
      output.endObject();
    }

    @Override
    public GetFriendApplyListInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1582340050:
          case 1375926032: {
            if (input.isAtField(FieldNames.friendApplyList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(friendApplyList);
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
    public GetFriendApplyListInfoScRsp clone() {
      return new GetFriendApplyListInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFriendApplyListInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFriendApplyListInfoScRsp(), data).checkInitialized();
    }

    public static GetFriendApplyListInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetFriendApplyListInfoScRsp(), input).checkInitialized();
    }

    public static GetFriendApplyListInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendApplyListInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFriendApplyListInfoScRsp messages
     */
    public static MessageFactory<GetFriendApplyListInfoScRsp> getFactory() {
      return GetFriendApplyListInfoScRspFactory.INSTANCE;
    }

    private enum GetFriendApplyListInfoScRspFactory implements MessageFactory<GetFriendApplyListInfoScRsp> {
      INSTANCE;

      @Override
      public GetFriendApplyListInfoScRsp create() {
        return GetFriendApplyListInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName friendApplyList = FieldName.forField("friendApplyList", "friend_apply_list");
    }
  }
}
