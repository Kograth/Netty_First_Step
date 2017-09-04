/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Telegram;

/**
 *
 * @author Oleynik
 */
public class DecoderSorterTlg extends ByteToMessageDecoder {
static final int MAX_PACKET_LENGHT=1024;
static final int IN_BYTE_TYPE_MSG=2;
    @Override
    protected void decode(ChannelHandlerContext chc, ByteBuf msg, List<Object> list) throws Exception {
        byte msgType;
        String RetMsg = "1234567890";
        if (msg.readableBytes()>MAX_PACKET_LENGHT) {
           throw new Exception("Превышен размер пакета данных");
        }
        if (msg.readableBytes()<=MAX_PACKET_LENGHT && msg.readableBytes()>=IN_BYTE_TYPE_MSG) {
            msgType = msg.getByte(IN_BYTE_TYPE_MSG);
            switch (msgType) {
                case Telegram.TELEGA11:
                    list.add(new Request11());
                case Telegram.TELEGA12:
                    list.add(RetMsg);
                case Telegram.TELEGA13:
                    list.add(RetMsg);
                case Telegram.TELEGA14:
                    list.add(RetMsg);
                case Telegram.TELEGA15:
                    list.add(RetMsg);
                case Telegram.TELEGA16:
                    list.add(RetMsg);
                 default:
                    throw new Exception("Не корректный пакет данных");
            }
        }

    }

}
