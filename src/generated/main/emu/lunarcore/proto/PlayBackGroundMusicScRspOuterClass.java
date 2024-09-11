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

public final class PlayBackGroundMusicScRspOuterClass {
  /**
   * Protobuf type {@code PlayBackGroundMusicScRsp}
   */
  public static final class PlayBackGroundMusicScRsp extends ProtoMessage<PlayBackGroundMusicScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 play_music_id = 7;</code>
     */
    private int playMusicId;

    /**
     * <code>optional uint32 playing_id = 10;</code>
     */
    private int playingId;

    private PlayBackGroundMusicScRsp() {
    }

    /**
     * @return a new empty instance of {@code PlayBackGroundMusicScRsp}
     */
    public static PlayBackGroundMusicScRsp newInstance() {
      return new PlayBackGroundMusicScRsp();
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
    public PlayBackGroundMusicScRsp clearRetcode() {
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
    public PlayBackGroundMusicScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 play_music_id = 7;</code>
     * @return whether the playMusicId field is set
     */
    public boolean hasPlayMusicId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 play_music_id = 7;</code>
     * @return this
     */
    public PlayBackGroundMusicScRsp clearPlayMusicId() {
      bitField0_ &= ~0x00000002;
      playMusicId = 0;
      return this;
    }

    /**
     * <code>optional uint32 play_music_id = 7;</code>
     * @return the playMusicId
     */
    public int getPlayMusicId() {
      return playMusicId;
    }

    /**
     * <code>optional uint32 play_music_id = 7;</code>
     * @param value the playMusicId to set
     * @return this
     */
    public PlayBackGroundMusicScRsp setPlayMusicId(final int value) {
      bitField0_ |= 0x00000002;
      playMusicId = value;
      return this;
    }

    /**
     * <code>optional uint32 playing_id = 10;</code>
     * @return whether the playingId field is set
     */
    public boolean hasPlayingId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 playing_id = 10;</code>
     * @return this
     */
    public PlayBackGroundMusicScRsp clearPlayingId() {
      bitField0_ &= ~0x00000004;
      playingId = 0;
      return this;
    }

    /**
     * <code>optional uint32 playing_id = 10;</code>
     * @return the playingId
     */
    public int getPlayingId() {
      return playingId;
    }

    /**
     * <code>optional uint32 playing_id = 10;</code>
     * @param value the playingId to set
     * @return this
     */
    public PlayBackGroundMusicScRsp setPlayingId(final int value) {
      bitField0_ |= 0x00000004;
      playingId = value;
      return this;
    }

    @Override
    public PlayBackGroundMusicScRsp copyFrom(final PlayBackGroundMusicScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        playMusicId = other.playMusicId;
        playingId = other.playingId;
      }
      return this;
    }

    @Override
    public PlayBackGroundMusicScRsp mergeFrom(final PlayBackGroundMusicScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasPlayMusicId()) {
        setPlayMusicId(other.playMusicId);
      }
      if (other.hasPlayingId()) {
        setPlayingId(other.playingId);
      }
      return this;
    }

    @Override
    public PlayBackGroundMusicScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      playMusicId = 0;
      playingId = 0;
      return this;
    }

    @Override
    public PlayBackGroundMusicScRsp clearQuick() {
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
      if (!(o instanceof PlayBackGroundMusicScRsp)) {
        return false;
      }
      PlayBackGroundMusicScRsp other = (PlayBackGroundMusicScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasPlayMusicId() || playMusicId == other.playMusicId)
        && (!hasPlayingId() || playingId == other.playingId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(playMusicId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(playingId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(playMusicId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(playingId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayBackGroundMusicScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // playMusicId
            playMusicId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // playingId
            playingId = input.readUInt32();
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.playMusicId, playMusicId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.playingId, playingId);
      }
      output.endObject();
    }

    @Override
    public PlayBackGroundMusicScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 835898444:
          case -1319856608: {
            if (input.isAtField(FieldNames.playMusicId)) {
              if (!input.trySkipNullValue()) {
                playMusicId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1868462615:
          case -2087744820: {
            if (input.isAtField(FieldNames.playingId)) {
              if (!input.trySkipNullValue()) {
                playingId = input.readUInt32();
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
    public PlayBackGroundMusicScRsp clone() {
      return new PlayBackGroundMusicScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayBackGroundMusicScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayBackGroundMusicScRsp(), data).checkInitialized();
    }

    public static PlayBackGroundMusicScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayBackGroundMusicScRsp(), input).checkInitialized();
    }

    public static PlayBackGroundMusicScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayBackGroundMusicScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayBackGroundMusicScRsp messages
     */
    public static MessageFactory<PlayBackGroundMusicScRsp> getFactory() {
      return PlayBackGroundMusicScRspFactory.INSTANCE;
    }

    private enum PlayBackGroundMusicScRspFactory implements MessageFactory<PlayBackGroundMusicScRsp> {
      INSTANCE;

      @Override
      public PlayBackGroundMusicScRsp create() {
        return PlayBackGroundMusicScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName playMusicId = FieldName.forField("playMusicId", "play_music_id");

      static final FieldName playingId = FieldName.forField("playingId", "playing_id");
    }
  }
}
