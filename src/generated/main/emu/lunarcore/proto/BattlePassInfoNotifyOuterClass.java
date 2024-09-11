// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.ProtoUtil;

public final class BattlePassInfoNotifyOuterClass {
  /**
   * Protobuf type {@code BattlePassInfoNotify}
   */
  public static final class BattlePassInfoNotify extends ProtoMessage<BattlePassInfoNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 taken_premium_reward1 = 3;</code>
     */
    private long takenPremiumReward1;

    /**
     * <code>optional uint64 taken_premium_extended_reward = 6;</code>
     */
    private long takenPremiumExtendedReward;

    /**
     * <code>optional uint64 taken_free_extended_reward = 7;</code>
     */
    private long takenFreeExtendedReward;

    /**
     * <pre>
     *  the difficult ones
     * </pre>
     *
     * <code>optional uint64 taken_free_reward = 8;</code>
     */
    private long takenFreeReward;

    /**
     * <code>optional uint64 taken_premium_reward2 = 12;</code>
     */
    private long takenPremiumReward2;

    /**
     * <code>optional uint64 taken_premium_optional_reward = 15;</code>
     */
    private long takenPremiumOptionalReward;

    /**
     * <code>optional uint32 level = 1;</code>
     */
    private int level;

    /**
     * <code>optional uint32 exp = 4;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 cur_bp_id = 9;</code>
     */
    private int curBpId;

    /**
     * <code>optional uint32 cur_week_add_exp_sum = 14;</code>
     */
    private int curWeekAddExpSum;

    /**
     * <code>optional .BattlePassInfoNotify.BpTierType bp_tier_type = 13;</code>
     */
    private int bpTierType;

    private BattlePassInfoNotify() {
    }

    /**
     * @return a new empty instance of {@code BattlePassInfoNotify}
     */
    public static BattlePassInfoNotify newInstance() {
      return new BattlePassInfoNotify();
    }

    /**
     * <code>optional uint64 taken_premium_reward1 = 3;</code>
     * @return whether the takenPremiumReward1 field is set
     */
    public boolean hasTakenPremiumReward1() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 taken_premium_reward1 = 3;</code>
     * @return this
     */
    public BattlePassInfoNotify clearTakenPremiumReward1() {
      bitField0_ &= ~0x00000001;
      takenPremiumReward1 = 0L;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_reward1 = 3;</code>
     * @return the takenPremiumReward1
     */
    public long getTakenPremiumReward1() {
      return takenPremiumReward1;
    }

    /**
     * <code>optional uint64 taken_premium_reward1 = 3;</code>
     * @param value the takenPremiumReward1 to set
     * @return this
     */
    public BattlePassInfoNotify setTakenPremiumReward1(final long value) {
      bitField0_ |= 0x00000001;
      takenPremiumReward1 = value;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_extended_reward = 6;</code>
     * @return whether the takenPremiumExtendedReward field is set
     */
    public boolean hasTakenPremiumExtendedReward() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint64 taken_premium_extended_reward = 6;</code>
     * @return this
     */
    public BattlePassInfoNotify clearTakenPremiumExtendedReward() {
      bitField0_ &= ~0x00000002;
      takenPremiumExtendedReward = 0L;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_extended_reward = 6;</code>
     * @return the takenPremiumExtendedReward
     */
    public long getTakenPremiumExtendedReward() {
      return takenPremiumExtendedReward;
    }

    /**
     * <code>optional uint64 taken_premium_extended_reward = 6;</code>
     * @param value the takenPremiumExtendedReward to set
     * @return this
     */
    public BattlePassInfoNotify setTakenPremiumExtendedReward(final long value) {
      bitField0_ |= 0x00000002;
      takenPremiumExtendedReward = value;
      return this;
    }

    /**
     * <code>optional uint64 taken_free_extended_reward = 7;</code>
     * @return whether the takenFreeExtendedReward field is set
     */
    public boolean hasTakenFreeExtendedReward() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint64 taken_free_extended_reward = 7;</code>
     * @return this
     */
    public BattlePassInfoNotify clearTakenFreeExtendedReward() {
      bitField0_ &= ~0x00000004;
      takenFreeExtendedReward = 0L;
      return this;
    }

    /**
     * <code>optional uint64 taken_free_extended_reward = 7;</code>
     * @return the takenFreeExtendedReward
     */
    public long getTakenFreeExtendedReward() {
      return takenFreeExtendedReward;
    }

    /**
     * <code>optional uint64 taken_free_extended_reward = 7;</code>
     * @param value the takenFreeExtendedReward to set
     * @return this
     */
    public BattlePassInfoNotify setTakenFreeExtendedReward(final long value) {
      bitField0_ |= 0x00000004;
      takenFreeExtendedReward = value;
      return this;
    }

    /**
     * <pre>
     *  the difficult ones
     * </pre>
     *
     * <code>optional uint64 taken_free_reward = 8;</code>
     * @return whether the takenFreeReward field is set
     */
    public boolean hasTakenFreeReward() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  the difficult ones
     * </pre>
     *
     * <code>optional uint64 taken_free_reward = 8;</code>
     * @return this
     */
    public BattlePassInfoNotify clearTakenFreeReward() {
      bitField0_ &= ~0x00000008;
      takenFreeReward = 0L;
      return this;
    }

    /**
     * <pre>
     *  the difficult ones
     * </pre>
     *
     * <code>optional uint64 taken_free_reward = 8;</code>
     * @return the takenFreeReward
     */
    public long getTakenFreeReward() {
      return takenFreeReward;
    }

    /**
     * <pre>
     *  the difficult ones
     * </pre>
     *
     * <code>optional uint64 taken_free_reward = 8;</code>
     * @param value the takenFreeReward to set
     * @return this
     */
    public BattlePassInfoNotify setTakenFreeReward(final long value) {
      bitField0_ |= 0x00000008;
      takenFreeReward = value;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_reward2 = 12;</code>
     * @return whether the takenPremiumReward2 field is set
     */
    public boolean hasTakenPremiumReward2() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint64 taken_premium_reward2 = 12;</code>
     * @return this
     */
    public BattlePassInfoNotify clearTakenPremiumReward2() {
      bitField0_ &= ~0x00000010;
      takenPremiumReward2 = 0L;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_reward2 = 12;</code>
     * @return the takenPremiumReward2
     */
    public long getTakenPremiumReward2() {
      return takenPremiumReward2;
    }

    /**
     * <code>optional uint64 taken_premium_reward2 = 12;</code>
     * @param value the takenPremiumReward2 to set
     * @return this
     */
    public BattlePassInfoNotify setTakenPremiumReward2(final long value) {
      bitField0_ |= 0x00000010;
      takenPremiumReward2 = value;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_optional_reward = 15;</code>
     * @return whether the takenPremiumOptionalReward field is set
     */
    public boolean hasTakenPremiumOptionalReward() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint64 taken_premium_optional_reward = 15;</code>
     * @return this
     */
    public BattlePassInfoNotify clearTakenPremiumOptionalReward() {
      bitField0_ &= ~0x00000020;
      takenPremiumOptionalReward = 0L;
      return this;
    }

    /**
     * <code>optional uint64 taken_premium_optional_reward = 15;</code>
     * @return the takenPremiumOptionalReward
     */
    public long getTakenPremiumOptionalReward() {
      return takenPremiumOptionalReward;
    }

    /**
     * <code>optional uint64 taken_premium_optional_reward = 15;</code>
     * @param value the takenPremiumOptionalReward to set
     * @return this
     */
    public BattlePassInfoNotify setTakenPremiumOptionalReward(final long value) {
      bitField0_ |= 0x00000020;
      takenPremiumOptionalReward = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 1;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 level = 1;</code>
     * @return this
     */
    public BattlePassInfoNotify clearLevel() {
      bitField0_ &= ~0x00000040;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 1;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 1;</code>
     * @param value the level to set
     * @return this
     */
    public BattlePassInfoNotify setLevel(final int value) {
      bitField0_ |= 0x00000040;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 4;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional uint32 exp = 4;</code>
     * @return this
     */
    public BattlePassInfoNotify clearExp() {
      bitField0_ &= ~0x00000080;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 4;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 4;</code>
     * @param value the exp to set
     * @return this
     */
    public BattlePassInfoNotify setExp(final int value) {
      bitField0_ |= 0x00000080;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_bp_id = 9;</code>
     * @return whether the curBpId field is set
     */
    public boolean hasCurBpId() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>optional uint32 cur_bp_id = 9;</code>
     * @return this
     */
    public BattlePassInfoNotify clearCurBpId() {
      bitField0_ &= ~0x00000100;
      curBpId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_bp_id = 9;</code>
     * @return the curBpId
     */
    public int getCurBpId() {
      return curBpId;
    }

    /**
     * <code>optional uint32 cur_bp_id = 9;</code>
     * @param value the curBpId to set
     * @return this
     */
    public BattlePassInfoNotify setCurBpId(final int value) {
      bitField0_ |= 0x00000100;
      curBpId = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_week_add_exp_sum = 14;</code>
     * @return whether the curWeekAddExpSum field is set
     */
    public boolean hasCurWeekAddExpSum() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <code>optional uint32 cur_week_add_exp_sum = 14;</code>
     * @return this
     */
    public BattlePassInfoNotify clearCurWeekAddExpSum() {
      bitField0_ &= ~0x00000200;
      curWeekAddExpSum = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_week_add_exp_sum = 14;</code>
     * @return the curWeekAddExpSum
     */
    public int getCurWeekAddExpSum() {
      return curWeekAddExpSum;
    }

    /**
     * <code>optional uint32 cur_week_add_exp_sum = 14;</code>
     * @param value the curWeekAddExpSum to set
     * @return this
     */
    public BattlePassInfoNotify setCurWeekAddExpSum(final int value) {
      bitField0_ |= 0x00000200;
      curWeekAddExpSum = value;
      return this;
    }

    /**
     * <code>optional .BattlePassInfoNotify.BpTierType bp_tier_type = 13;</code>
     * @return whether the bpTierType field is set
     */
    public boolean hasBpTierType() {
      return (bitField0_ & 0x00000400) != 0;
    }

    /**
     * <code>optional .BattlePassInfoNotify.BpTierType bp_tier_type = 13;</code>
     * @return this
     */
    public BattlePassInfoNotify clearBpTierType() {
      bitField0_ &= ~0x00000400;
      bpTierType = 0;
      return this;
    }

    /**
     * <code>optional .BattlePassInfoNotify.BpTierType bp_tier_type = 13;</code>
     * @return the bpTierType
     */
    public BpTierType getBpTierType() {
      return BpTierType.forNumber(bpTierType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link BattlePassInfoNotify#getBpTierType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getBpTierTypeValue() {
      return bpTierType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link BpTierType}. Setting an invalid value
     * can cause {@link BattlePassInfoNotify#getBpTierType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public BattlePassInfoNotify setBpTierTypeValue(final int value) {
      bitField0_ |= 0x00000400;
      bpTierType = value;
      return this;
    }

    /**
     * <code>optional .BattlePassInfoNotify.BpTierType bp_tier_type = 13;</code>
     * @param value the bpTierType to set
     * @return this
     */
    public BattlePassInfoNotify setBpTierType(final BpTierType value) {
      bitField0_ |= 0x00000400;
      bpTierType = value.getNumber();
      return this;
    }

    @Override
    public BattlePassInfoNotify copyFrom(final BattlePassInfoNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        takenPremiumReward1 = other.takenPremiumReward1;
        takenPremiumExtendedReward = other.takenPremiumExtendedReward;
        takenFreeExtendedReward = other.takenFreeExtendedReward;
        takenFreeReward = other.takenFreeReward;
        takenPremiumReward2 = other.takenPremiumReward2;
        takenPremiumOptionalReward = other.takenPremiumOptionalReward;
        level = other.level;
        exp = other.exp;
        curBpId = other.curBpId;
        curWeekAddExpSum = other.curWeekAddExpSum;
        bpTierType = other.bpTierType;
      }
      return this;
    }

    @Override
    public BattlePassInfoNotify mergeFrom(final BattlePassInfoNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTakenPremiumReward1()) {
        setTakenPremiumReward1(other.takenPremiumReward1);
      }
      if (other.hasTakenPremiumExtendedReward()) {
        setTakenPremiumExtendedReward(other.takenPremiumExtendedReward);
      }
      if (other.hasTakenFreeExtendedReward()) {
        setTakenFreeExtendedReward(other.takenFreeExtendedReward);
      }
      if (other.hasTakenFreeReward()) {
        setTakenFreeReward(other.takenFreeReward);
      }
      if (other.hasTakenPremiumReward2()) {
        setTakenPremiumReward2(other.takenPremiumReward2);
      }
      if (other.hasTakenPremiumOptionalReward()) {
        setTakenPremiumOptionalReward(other.takenPremiumOptionalReward);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasCurBpId()) {
        setCurBpId(other.curBpId);
      }
      if (other.hasCurWeekAddExpSum()) {
        setCurWeekAddExpSum(other.curWeekAddExpSum);
      }
      if (other.hasBpTierType()) {
        setBpTierTypeValue(other.bpTierType);
      }
      return this;
    }

    @Override
    public BattlePassInfoNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      takenPremiumReward1 = 0L;
      takenPremiumExtendedReward = 0L;
      takenFreeExtendedReward = 0L;
      takenFreeReward = 0L;
      takenPremiumReward2 = 0L;
      takenPremiumOptionalReward = 0L;
      level = 0;
      exp = 0;
      curBpId = 0;
      curWeekAddExpSum = 0;
      bpTierType = 0;
      return this;
    }

    @Override
    public BattlePassInfoNotify clearQuick() {
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
      if (!(o instanceof BattlePassInfoNotify)) {
        return false;
      }
      BattlePassInfoNotify other = (BattlePassInfoNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasTakenPremiumReward1() || takenPremiumReward1 == other.takenPremiumReward1)
        && (!hasTakenPremiumExtendedReward() || takenPremiumExtendedReward == other.takenPremiumExtendedReward)
        && (!hasTakenFreeExtendedReward() || takenFreeExtendedReward == other.takenFreeExtendedReward)
        && (!hasTakenFreeReward() || takenFreeReward == other.takenFreeReward)
        && (!hasTakenPremiumReward2() || takenPremiumReward2 == other.takenPremiumReward2)
        && (!hasTakenPremiumOptionalReward() || takenPremiumOptionalReward == other.takenPremiumOptionalReward)
        && (!hasLevel() || level == other.level)
        && (!hasExp() || exp == other.exp)
        && (!hasCurBpId() || curBpId == other.curBpId)
        && (!hasCurWeekAddExpSum() || curWeekAddExpSum == other.curWeekAddExpSum)
        && (!hasBpTierType() || bpTierType == other.bpTierType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt64NoTag(takenPremiumReward1);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt64NoTag(takenPremiumExtendedReward);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt64NoTag(takenFreeExtendedReward);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt64NoTag(takenFreeReward);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt64NoTag(takenPremiumReward2);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt64NoTag(takenPremiumOptionalReward);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(curBpId);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(curWeekAddExpSum);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        output.writeRawByte((byte) 104);
        output.writeEnumNoTag(bpTierType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenPremiumReward1);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenPremiumExtendedReward);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenFreeExtendedReward);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenFreeReward);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenPremiumReward2);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenPremiumOptionalReward);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curBpId);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curWeekAddExpSum);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(bpTierType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BattlePassInfoNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // takenPremiumReward1
            takenPremiumReward1 = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // takenPremiumExtendedReward
            takenPremiumExtendedReward = input.readUInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // takenFreeExtendedReward
            takenFreeExtendedReward = input.readUInt64();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // takenFreeReward
            takenFreeReward = input.readUInt64();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // takenPremiumReward2
            takenPremiumReward2 = input.readUInt64();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // takenPremiumOptionalReward
            takenPremiumOptionalReward = input.readUInt64();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // curBpId
            curBpId = input.readUInt32();
            bitField0_ |= 0x00000100;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // curWeekAddExpSum
            curWeekAddExpSum = input.readUInt32();
            bitField0_ |= 0x00000200;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // bpTierType
            final int value = input.readInt32();
            if (BpTierType.forNumber(value) != null) {
              bpTierType = value;
              bitField0_ |= 0x00000400;
            }
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
        output.writeUInt64(FieldNames.takenPremiumReward1, takenPremiumReward1);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt64(FieldNames.takenPremiumExtendedReward, takenPremiumExtendedReward);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt64(FieldNames.takenFreeExtendedReward, takenFreeExtendedReward);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt64(FieldNames.takenFreeReward, takenFreeReward);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt64(FieldNames.takenPremiumReward2, takenPremiumReward2);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt64(FieldNames.takenPremiumOptionalReward, takenPremiumOptionalReward);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeUInt32(FieldNames.curBpId, curBpId);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeUInt32(FieldNames.curWeekAddExpSum, curWeekAddExpSum);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        output.writeEnum(FieldNames.bpTierType, bpTierType, BpTierType.converter());
      }
      output.endObject();
    }

    @Override
    public BattlePassInfoNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 226926898:
          case 1195903362: {
            if (input.isAtField(FieldNames.takenPremiumReward1)) {
              if (!input.trySkipNullValue()) {
                takenPremiumReward1 = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1290021512:
          case -2138632299: {
            if (input.isAtField(FieldNames.takenPremiumExtendedReward)) {
              if (!input.trySkipNullValue()) {
                takenPremiumExtendedReward = input.readUInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1116117893:
          case 1257087386: {
            if (input.isAtField(FieldNames.takenFreeExtendedReward)) {
              if (!input.trySkipNullValue()) {
                takenFreeExtendedReward = input.readUInt64();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1065549026:
          case 135671018: {
            if (input.isAtField(FieldNames.takenFreeReward)) {
              if (!input.trySkipNullValue()) {
                takenFreeReward = input.readUInt64();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 226926899:
          case 1195903363: {
            if (input.isAtField(FieldNames.takenPremiumReward2)) {
              if (!input.trySkipNullValue()) {
                takenPremiumReward2 = input.readUInt64();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 736311903:
          case 548161422: {
            if (input.isAtField(FieldNames.takenPremiumOptionalReward)) {
              if (!input.trySkipNullValue()) {
                takenPremiumOptionalReward = input.readUInt64();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1125519465:
          case 110923757: {
            if (input.isAtField(FieldNames.curBpId)) {
              if (!input.trySkipNullValue()) {
                curBpId = input.readUInt32();
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 835771131:
          case 26830815: {
            if (input.isAtField(FieldNames.curWeekAddExpSum)) {
              if (!input.trySkipNullValue()) {
                curWeekAddExpSum = input.readUInt32();
                bitField0_ |= 0x00000200;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -584657238:
          case 779964614: {
            if (input.isAtField(FieldNames.bpTierType)) {
              if (!input.trySkipNullValue()) {
                final BpTierType value = input.readEnum(BpTierType.converter());
                if (value != null) {
                  bpTierType = value.getNumber();
                  bitField0_ |= 0x00000400;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public BattlePassInfoNotify clone() {
      return new BattlePassInfoNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BattlePassInfoNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BattlePassInfoNotify(), data).checkInitialized();
    }

    public static BattlePassInfoNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattlePassInfoNotify(), input).checkInitialized();
    }

    public static BattlePassInfoNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattlePassInfoNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating BattlePassInfoNotify messages
     */
    public static MessageFactory<BattlePassInfoNotify> getFactory() {
      return BattlePassInfoNotifyFactory.INSTANCE;
    }

    /**
     * <pre>
     *  up to lv64 => normal
     *  after lv64 => extended
     * </pre>
     *
     * Protobuf enum {@code BpTierType}
     */
    public enum BpTierType implements ProtoEnum<BpTierType> {
      /**
       * <code>BP_TIER_TYPE_NONE = 0;</code>
       */
      BP_TIER_TYPE_NONE("BP_TIER_TYPE_NONE", 0),

      /**
       * <code>BP_TIER_TYPE_FREE = 1;</code>
       */
      BP_TIER_TYPE_FREE("BP_TIER_TYPE_FREE", 1),

      /**
       * <code>BP_TIER_TYPE_PREMIUM_1 = 2;</code>
       */
      BP_TIER_TYPE_PREMIUM_1("BP_TIER_TYPE_PREMIUM_1", 2),

      /**
       * <code>BP_TIER_TYPE_PREMIUM_2 = 3;</code>
       */
      BP_TIER_TYPE_PREMIUM_2("BP_TIER_TYPE_PREMIUM_2", 3);

      /**
       * <code>BP_TIER_TYPE_NONE = 0;</code>
       */
      public static final int BP_TIER_TYPE_NONE_VALUE = 0;

      /**
       * <code>BP_TIER_TYPE_FREE = 1;</code>
       */
      public static final int BP_TIER_TYPE_FREE_VALUE = 1;

      /**
       * <code>BP_TIER_TYPE_PREMIUM_1 = 2;</code>
       */
      public static final int BP_TIER_TYPE_PREMIUM_1_VALUE = 2;

      /**
       * <code>BP_TIER_TYPE_PREMIUM_2 = 3;</code>
       */
      public static final int BP_TIER_TYPE_PREMIUM_2_VALUE = 3;

      private final String name;

      private final int number;

      private BpTierType(String name, int number) {
        this.name = name;
        this.number = number;
      }

      /**
       * @return the string representation of enum entry
       */
      @Override
      public String getName() {
        return name;
      }

      /**
       * @return the numeric wire value of this enum entry
       */
      @Override
      public int getNumber() {
        return number;
      }

      /**
       * @return a converter that maps between this enum's numeric and text representations
       */
      public static ProtoEnum.EnumConverter<BpTierType> converter() {
        return BpTierTypeConverter.INSTANCE;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value, or null if unknown.
       */
      public static BpTierType forNumber(int value) {
        return BpTierTypeConverter.INSTANCE.forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @param other Fallback value in case the value is not known.
       * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
       */
      public static BpTierType forNumberOr(int number, BpTierType other) {
        BpTierType value = forNumber(number);
        return value == null ? other : value;
      }

      enum BpTierTypeConverter implements ProtoEnum.EnumConverter<BpTierType> {
        INSTANCE;

        private static final BpTierType[] lookup = new BpTierType[4];

        static {
          lookup[0] = BP_TIER_TYPE_NONE;
          lookup[1] = BP_TIER_TYPE_FREE;
          lookup[2] = BP_TIER_TYPE_PREMIUM_1;
          lookup[3] = BP_TIER_TYPE_PREMIUM_2;
        }

        @Override
        public final BpTierType forNumber(final int value) {
          if (value >= 0 && value < lookup.length) {
            return lookup[value];
          }
          return null;
        }

        @Override
        public final BpTierType forName(final CharSequence value) {
          if (value.length() == 17) {
            if (ProtoUtil.isEqual("BP_TIER_TYPE_NONE", value)) {
              return BP_TIER_TYPE_NONE;
            }
            if (ProtoUtil.isEqual("BP_TIER_TYPE_FREE", value)) {
              return BP_TIER_TYPE_FREE;
            }
          }
          if (value.length() == 22) {
            if (ProtoUtil.isEqual("BP_TIER_TYPE_PREMIUM_1", value)) {
              return BP_TIER_TYPE_PREMIUM_1;
            }
            if (ProtoUtil.isEqual("BP_TIER_TYPE_PREMIUM_2", value)) {
              return BP_TIER_TYPE_PREMIUM_2;
            }
          }
          return null;
        }
      }
    }

    private enum BattlePassInfoNotifyFactory implements MessageFactory<BattlePassInfoNotify> {
      INSTANCE;

      @Override
      public BattlePassInfoNotify create() {
        return BattlePassInfoNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName takenPremiumReward1 = FieldName.forField("takenPremiumReward1", "taken_premium_reward1");

      static final FieldName takenPremiumExtendedReward = FieldName.forField("takenPremiumExtendedReward", "taken_premium_extended_reward");

      static final FieldName takenFreeExtendedReward = FieldName.forField("takenFreeExtendedReward", "taken_free_extended_reward");

      static final FieldName takenFreeReward = FieldName.forField("takenFreeReward", "taken_free_reward");

      static final FieldName takenPremiumReward2 = FieldName.forField("takenPremiumReward2", "taken_premium_reward2");

      static final FieldName takenPremiumOptionalReward = FieldName.forField("takenPremiumOptionalReward", "taken_premium_optional_reward");

      static final FieldName level = FieldName.forField("level");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName curBpId = FieldName.forField("curBpId", "cur_bp_id");

      static final FieldName curWeekAddExpSum = FieldName.forField("curWeekAddExpSum", "cur_week_add_exp_sum");

      static final FieldName bpTierType = FieldName.forField("bpTierType", "bp_tier_type");
    }
  }
}
