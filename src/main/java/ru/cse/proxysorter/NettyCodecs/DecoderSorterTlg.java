/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.NettyCodecs;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Telegram;

/**
 *
 * @author Oleynik
 */
@ChannelHandler.Sharable
public class DecoderSorterTlg extends  MessageToMessageDecoder<ByteBuf>  {
static final int MAX_PACKET_LENGHT=1024;
static final int IN_BYTE_TYPE_MSG=1;
static final  byte[] Re = {0x02,0x11,0x31,0x32,0x39,0x39};
    @Override
    protected void decode(ChannelHandlerContext chc, ByteBuf msg, List<Object> list) throws Exception {
        byte msgType;
        String RetMsg = "1234567890";
        if (msg.readableBytes()>MAX_PACKET_LENGHT) {
           throw new Exception("Превышен размер пакета данных");
        }
        msg.markReaderIndex();        
        
        if (msg.readableBytes()<=MAX_PACKET_LENGHT && msg.readableBytes()>=IN_BYTE_TYPE_MSG+1) {
            msgType = msg.getByte(IN_BYTE_TYPE_MSG);
            switch (msgType) {
                case Telegram.TELEGA11:
                    list.add(new Request11());
                        msg.readBytes(6);
                    break;
                case Telegram.TELEGA12:
                    list.add(RetMsg);
                    break;
                case Telegram.TELEGA13:
                    list.add(RetMsg);
                    break;
                case Telegram.TELEGA14:
                    list.add(RetMsg);
                    break;
                case Telegram.TELEGA15:
                    list.add(RetMsg);
                    break;
                case Telegram.TELEGA16:
                    list.add(RetMsg);
                    break;
                 default:
                   msg.resetReaderIndex();
                   // throw new Exception("Не корректный пакет данных");
            }
        }

    }

}
