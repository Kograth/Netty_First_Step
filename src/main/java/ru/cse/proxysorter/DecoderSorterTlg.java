/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.List;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Telegram;

/**
 *
 * @author Oleynik
 */
public class DecoderSorterTlg extends ByteToMessageDecoder {
static final int MAX_PACKET_LENGHT=1024;
static final int IN_BYTE_TYPE_MSG=1; //массив байт с 0

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        LoopBackTimeStamp ts = (LoopBackTimeStamp) msg;
        ctx.writeAndFlush(ts); //recieved message sent back directly
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // Должен закрыть соединение когда поймали исключение.
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    protected void decode(ChannelHandlerContext chc, ByteBuf msg, List<Object> out) throws Exception {


        final int messageLength = Long.SIZE/Byte.SIZE *2;
        if (msg.readableBytes() < messageLength) {
            return;
        }

        byte [] ba = new byte[messageLength];
        msg.readBytes(ba, 0, messageLength);  // block until read 16 bytes from sockets
        LoopBackTimeStamp loopBackTimeStamp = new LoopBackTimeStamp();
        loopBackTimeStamp.fromByteArray(ba);
        out.add(loopBackTimeStamp);
//        byte msgType;
//        byte RetMsg = 65;
//        if (msg.readableBytes()>MAX_PACKET_LENGHT) {
//           throw new Exception("Превышен размер пакета данных");
//        }
//        if (msg.readableBytes()>=IN_BYTE_TYPE_MSG) {
//
//            msgType = msg.getByte(IN_BYTE_TYPE_MSG);
//            switch (msgType) {
//                case 17:
//                    if (msg.readableBytes()<179) {
//                       list.add(msg);
//                    }
//                case Telegram.TELEGA12:
//                    list.add(RetMsg);
//                case Telegram.TELEGA13:
//                    list.add(RetMsg);
//                case Telegram.TELEGA14:
//                    list.add(RetMsg);
//                case Telegram.TELEGA15:
//                    list.add(RetMsg);
//                case Telegram.TELEGA16:
//                    list.add(RetMsg);
//                 //default:
//                 //   throw new Exception("Не корректный пакет данных");
//            }
//        }

    }

}
