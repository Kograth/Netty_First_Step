package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Request18 extends Request4All {

    //
    public static final byte MESSAGE_CODE=18;
    public static final int MESSAGE_LENGHT=5;

    private short msgSTX            = 0x02;
    private short Command           = 0x13;
    private byte ExitNumber         = 0x31;
    private byte Reserv            = 0x1C;
    private short msgETX            = 0x03;



    public byte getExitNumber() {
        return ExitNumber;
    }


    public void setExitNumber(byte ExitNumber) {
        this.ExitNumber=ExitNumber;
    }

    @Override
    public ByteBuf ToByte() {

        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(msgSTX);
        buf.writeByte(Command);
        buf.writeByte(ExitNumber);
        buf.writeByte(Reserv);
        buf.writeByte(msgETX);
        return  buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        msgSTX          = msg.readUnsignedByte();
        Command         = msg.readUnsignedByte();
        ExitNumber      = msg.readByte();
        Reserv          = msg.readByte();
        msgETX          = msg.readUnsignedByte();
    }
}
