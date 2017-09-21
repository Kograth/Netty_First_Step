package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request15 extends Request4All {
    public static final byte MESSAGE_CODE=15;
    public static final int MESSAGE_LENGHT=9;

    private short smlSTX            = 0x02;
    private short Command           = 0x13;
    private byte ExitNumber         = 0x31;
    private short NumberManualPack     = 0x00;
    private short smlETX            = 0x03;

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {
        smlSTX          = msg.readUnsignedByte();
        Command         = msg.readUnsignedByte();
        ExitNumber      = msg.readByte();
        NumberManualPack= msg.readUnsignedByte();
        smlETX          = msg.readUnsignedByte();

    }
}
