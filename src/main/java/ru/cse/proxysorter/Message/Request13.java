package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request13  extends Request4All{
    public static final byte MESSAGE_CODE=13;
    public static final int MESSAGE_LENGHT=9;

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

    }
}
