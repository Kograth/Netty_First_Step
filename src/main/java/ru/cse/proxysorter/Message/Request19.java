package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request19 extends Request4All {

    public static final byte MESSAGE_CODE=19;
    public static final int MESSAGE_LENGHT=9;

    private byte msgSTX            = 0x02;
    private byte Command           = 0x13;
    private byte ExitNumber        = 0x31;
    private String Reserv          = null;
    private byte msgETX            = 0x03;

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        msgSTX          = msg.readByte();
        Command         = msg.readByte();
        ExitNumber      = msg.readByte();
        byte[] Array     = new byte[5];
        msg.readBytes(Array);
        Reserv          = new String(Array).trim();
        msgETX          = msg.readByte();

    }
}
