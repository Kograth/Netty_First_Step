package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Request17 extends Request4All {



    public static final byte MESSAGE_CODE=0x17;
    public static final int MESSAGE_LENGHT=5;

    private final short smlSTX            = 0x02;
    private final short Command           = MESSAGE_CODE;
    private short ExitNumber              = 0x31;
    private  short Reserv                 = 0;
    private final short smlETX            = 0x03;

    public short getExitNumber() {
        return ExitNumber;
    }

    public  short getCommand() {
        return Command;
    }
    /**
     * @return the smlSTX
     */
    public short getSmlSTX() {
        return smlSTX;
    }

    /**
     * @param ExitNumber the ExitNumber to set
     */
    public void setExitNumber(short ExitNumber) {
        this.ExitNumber = ExitNumber;
    }

    /**
     * @return the Reserv
     */
    public short getReserv() {
        return Reserv;
    }

    /**
     * @param Reserv the Reserv to set
     */
    public void setReserv(short Reserv) {
        this.Reserv = Reserv;
    }

    /**
     * @return the smlETX
     */
    public short getSmlETX() {
        return smlETX;
    }    

    @Override
    public ByteBuf ToByte() {
        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(getSmlSTX());
        buf.writeByte(getCommand());
        buf.writeByte(getExitNumber());
        buf.writeByte(getReserv());
        buf.writeByte(getSmlETX());
        return buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

//        smlSTX          = msg.readUnsignedByte();
//        Command         = msg.readUnsignedByte();
//        ExitNumber      = msg.readUnsignedByte();
//        Reserv          = msg.readUnsignedByte();
//        smlETX          = msg.readUnsignedByte();
    }
}
