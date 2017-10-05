package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request17 extends Request4All {

    //Метод использует ТСД для смены мешка
    public static final byte MESSAGE_CODE=17;
    public static final int MESSAGE_LENGHT=17;

    private short smlSTX            = 0x02;
    private short Command           = 0x13;
    private byte ExitNumber         = 0x31;
    private short smlETX            = 0x03;
    private String BagBarCode       = "";

    public byte getExitNumber() {
        return ExitNumber;
    }

    public String getBagBarCode() {
        return BagBarCode;
    }

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        smlSTX          = msg.readUnsignedByte();
        Command         = msg.readUnsignedByte();
        ExitNumber      = msg.readByte();
        byte[] Array    = new byte[13];
        msg.readBytes(Array);
        BagBarCode      = new String(Array);
        smlETX          = msg.readUnsignedByte();
    }
}
