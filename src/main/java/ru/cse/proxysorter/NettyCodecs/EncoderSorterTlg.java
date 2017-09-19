/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.NettyCodecs;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageEncoder;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request4All;

import java.util.List;

/**
 *
 * @author Oleynik
 */
@ChannelHandler.Sharable
public class EncoderSorterTlg extends MessageToMessageEncoder<Request4All> {

     @Override
    protected void encode(ChannelHandlerContext chc, Request4All i, List<Object> list) throws Exception {

        list.add(i.ToByte());

        
    }


}
