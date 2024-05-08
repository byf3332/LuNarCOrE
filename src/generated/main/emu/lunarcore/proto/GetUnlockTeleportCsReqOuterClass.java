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

public final class GetUnlockTeleportCsReqOuterClass {
  /**
   * Protobuf type {@code GetUnlockTeleportCsReq}
   */
  public static final class GetUnlockTeleportCsReq extends ProtoMessage<GetUnlockTeleportCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     */
    private final RepeatedInt entryIdList = RepeatedInt.newEmptyInstance();

    private GetUnlockTeleportCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetUnlockTeleportCsReq}
     */
    public static GetUnlockTeleportCsReq newInstance() {
      return new GetUnlockTeleportCsReq();
    }

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     * @return whether the entryIdList field is set
     */
    public boolean hasEntryIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     * @return this
     */
    public GetUnlockTeleportCsReq clearEntryIdList() {
      bitField0_ &= ~0x00000001;
      entryIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntryIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getEntryIdList() {
      return entryIdList;
    }

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableEntryIdList() {
      bitField0_ |= 0x00000001;
      return entryIdList;
    }

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     * @param value the entryIdList to add
     * @return this
     */
    public GetUnlockTeleportCsReq addEntryIdList(final int value) {
      bitField0_ |= 0x00000001;
      entryIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 entry_id_list = 1;</code>
     * @param values the entryIdList to add
     * @return this
     */
    public GetUnlockTeleportCsReq addAllEntryIdList(final int... values) {
      bitField0_ |= 0x00000001;
      entryIdList.addAll(values);
      return this;
    }

    @Override
    public GetUnlockTeleportCsReq copyFrom(final GetUnlockTeleportCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entryIdList.copyFrom(other.entryIdList);
      }
      return this;
    }

    @Override
    public GetUnlockTeleportCsReq mergeFrom(final GetUnlockTeleportCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntryIdList()) {
        getMutableEntryIdList().addAll(other.entryIdList);
      }
      return this;
    }

    @Override
    public GetUnlockTeleportCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entryIdList.clear();
      return this;
    }

    @Override
    public GetUnlockTeleportCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entryIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetUnlockTeleportCsReq)) {
        return false;
      }
      GetUnlockTeleportCsReq other = (GetUnlockTeleportCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEntryIdList() || entryIdList.equals(other.entryIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < entryIdList.length(); i++) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(entryIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * entryIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(entryIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetUnlockTeleportCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 10: {
            // entryIdList [packed=true]
            input.readPackedUInt32(entryIdList, tag);
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
          case 8: {
            // entryIdList [packed=false]
            tag = input.readRepeatedUInt32(entryIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.entryIdList, entryIdList);
      }
      output.endObject();
    }

    @Override
    public GetUnlockTeleportCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1441102997:
          case -1413189003: {
            if (input.isAtField(FieldNames.entryIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(entryIdList);
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
    public GetUnlockTeleportCsReq clone() {
      return new GetUnlockTeleportCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetUnlockTeleportCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetUnlockTeleportCsReq(), data).checkInitialized();
    }

    public static GetUnlockTeleportCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetUnlockTeleportCsReq(), input).checkInitialized();
    }

    public static GetUnlockTeleportCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetUnlockTeleportCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetUnlockTeleportCsReq messages
     */
    public static MessageFactory<GetUnlockTeleportCsReq> getFactory() {
      return GetUnlockTeleportCsReqFactory.INSTANCE;
    }

    private enum GetUnlockTeleportCsReqFactory implements MessageFactory<GetUnlockTeleportCsReq> {
      INSTANCE;

      @Override
      public GetUnlockTeleportCsReq create() {
        return GetUnlockTeleportCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entryIdList = FieldName.forField("entryIdList", "entry_id_list");
    }
  }
}
