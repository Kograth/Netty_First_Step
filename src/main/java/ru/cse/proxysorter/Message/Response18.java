package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Response18 extends Request4All {

    public static final byte MESSAGE_CODE  = 18;
    public static final int MESSAGE_LENGHT = 5;


    public byte msgSTX      = 0x02;
    public byte msgETX      = 0x03;
    public short Reserve    = 0x00;
    public byte ExitNumber  = 0x31;

    public void setExitNumber(byte ExitNumber) {
        this.ExitNumber=ExitNumber;
    }

    @Override
    public ByteBuf ToByte() {
        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(msgSTX);
        buf.writeByte(MESSAGE_CODE);
        buf.writeInt(ExitNumber);
        buf.writeByte(Reserve);
        buf.writeByte(msgETX);

        return buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

    }
}
