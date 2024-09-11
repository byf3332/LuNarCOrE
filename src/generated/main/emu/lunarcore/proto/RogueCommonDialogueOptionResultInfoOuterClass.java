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

public final class RogueCommonDialogueOptionResultInfoOuterClass {
  /**
   * Protobuf type {@code RogueCommonDialogueOptionResultInfo}
   */
  public static final class RogueCommonDialogueOptionResultInfo extends ProtoMessage<RogueCommonDialogueOptionResultInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * ILNKLKJEIKF NJFNJKJPNAP = 2; // 0x18 -> 24 -> RogueOptionEffectNousValueInfo, nous_result_info
     * </pre>
     *
     * <code>optional .RogueCommonDialogueOptionBattleResultInfo battle_result_info = 14;</code>
     */
    private final RogueCommonDialogueOptionBattleResultInfoOuterClass.RogueCommonDialogueOptionBattleResultInfo battleResultInfo = RogueCommonDialogueOptionBattleResultInfoOuterClass.RogueCommonDialogueOptionBattleResultInfo.newInstance();

    private RogueCommonDialogueOptionResultInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonDialogueOptionResultInfo}
     */
    public static RogueCommonDialogueOptionResultInfo newInstance() {
      return new RogueCommonDialogueOptionResultInfo();
    }

    public boolean hasOptionResult() {
      return (((bitField0_ & 0x00000001)) != 0);
    }

    public RogueCommonDialogueOptionResultInfo clearOptionResult() {
      if (hasOptionResult()) {
        clearBattleResultInfo();
      }
      return this;
    }

    /**
     * <pre>
     * ILNKLKJEIKF NJFNJKJPNAP = 2; // 0x18 -> 24 -> RogueOptionEffectNousValueInfo, nous_result_info
     * </pre>
     *
     * <code>optional .RogueCommonDialogueOptionBattleResultInfo battle_result_info = 14;</code>
     * @return whether the battleResultInfo field is set
     */
    public boolean hasBattleResultInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * ILNKLKJEIKF NJFNJKJPNAP = 2; // 0x18 -> 24 -> RogueOptionEffectNousValueInfo, nous_result_info
     * </pre>
     *
     * <code>optional .RogueCommonDialogueOptionBattleResultInfo battle_result_info = 14;</code>
     * @return this
     */
    public RogueCommonDialogueOptionResultInfo clearBattleResultInfo() {
      bitField0_ &= ~0x00000001;
      battleResultInfo.clear();
      return this;
    }

    /**
     * <pre>
     * ILNKLKJEIKF NJFNJKJPNAP = 2; // 0x18 -> 24 -> RogueOptionEffectNousValueInfo, nous_result_info
     * </pre>
     *
     * <code>optional .RogueCommonDialogueOptionBattleResultInfo battle_result_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleResultInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonDialogueOptionBattleResultInfoOuterClass.RogueCommonDialogueOptionBattleResultInfo getBattleResultInfo(
        ) {
      return battleResultInfo;
    }

    /**
     * <pre>
     * ILNKLKJEIKF NJFNJKJPNAP = 2; // 0x18 -> 24 -> RogueOptionEffectNousValueInfo, nous_result_info
     * </pre>
     *
     * <code>optional .RogueCommonDialogueOptionBattleResultInfo battle_result_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonDialogueOptionBattleResultInfoOuterClass.RogueCommonDialogueOptionBattleResultInfo getMutableBattleResultInfo(
        ) {
      bitField0_ |= 0x00000001;
      return battleResultInfo;
    }

    /**
     * <pre>
     * ILNKLKJEIKF NJFNJKJPNAP = 2; // 0x18 -> 24 -> RogueOptionEffectNousValueInfo, nous_result_info
     * </pre>
     *
     * <code>optional .RogueCommonDialogueOptionBattleResultInfo battle_result_info = 14;</code>
     * @param value the battleResultInfo to set
     * @return this
     */
    public RogueCommonDialogueOptionResultInfo setBattleResultInfo(
        final RogueCommonDialogueOptionBattleResultInfoOuterClass.RogueCommonDialogueOptionBattleResultInfo value) {
      bitField0_ |= 0x00000001;
      battleResultInfo.copyFrom(value);
      return this;
    }

    @Override
    public RogueCommonDialogueOptionResultInfo copyFrom(
        final RogueCommonDialogueOptionResultInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        battleResultInfo.copyFrom(other.battleResultInfo);
      }
      return this;
    }

    @Override
    public RogueCommonDialogueOptionResultInfo mergeFrom(
        final RogueCommonDialogueOptionResultInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBattleResultInfo()) {
        getMutableBattleResultInfo().mergeFrom(other.battleResultInfo);
      }
      return this;
    }

    @Override
    public RogueCommonDialogueOptionResultInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleResultInfo.clear();
      return this;
    }

    @Override
    public RogueCommonDialogueOptionResultInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleResultInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueCommonDialogueOptionResultInfo)) {
        return false;
      }
      RogueCommonDialogueOptionResultInfo other = (RogueCommonDialogueOptionResultInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBattleResultInfo() || battleResultInfo.equals(other.battleResultInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(battleResultInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(battleResultInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonDialogueOptionResultInfo mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 114: {
            // battleResultInfo
            input.readMessage(battleResultInfo);
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
        output.writeMessage(FieldNames.battleResultInfo, battleResultInfo);
      }
      output.endObject();
    }

    @Override
    public RogueCommonDialogueOptionResultInfo mergeFrom(final JsonSource input) throws
        IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 599519555:
          case -605996407: {
            if (input.isAtField(FieldNames.battleResultInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(battleResultInfo);
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
    public RogueCommonDialogueOptionResultInfo clone() {
      return new RogueCommonDialogueOptionResultInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonDialogueOptionResultInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionResultInfo(), data).checkInitialized();
    }

    public static RogueCommonDialogueOptionResultInfo parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionResultInfo(), input).checkInitialized();
    }

    public static RogueCommonDialogueOptionResultInfo parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionResultInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonDialogueOptionResultInfo messages
     */
    public static MessageFactory<RogueCommonDialogueOptionResultInfo> getFactory() {
      return RogueCommonDialogueOptionResultInfoFactory.INSTANCE;
    }

    private enum RogueCommonDialogueOptionResultInfoFactory implements MessageFactory<RogueCommonDialogueOptionResultInfo> {
      INSTANCE;

      @Override
      public RogueCommonDialogueOptionResultInfo create() {
        return RogueCommonDialogueOptionResultInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName battleResultInfo = FieldName.forField("battleResultInfo", "battle_result_info");
    }
  }
}
