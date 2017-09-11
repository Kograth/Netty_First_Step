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
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

/**
 *
 * @author Oleynik
 */
@ChannelHandler.Sharable
public class EncoderSorterTlg extends MessageToMessageEncoder<Object> {

    static final int MAX_PACKET_LENGHT = 1024;
    static final int IN_BYTE_TYPE_MSG = 2;
    static final byte[] RE = {0x02, 0x11, 0x31, 0x32, 0x39, 0x39};

    @Override
    protected void encode(ChannelHandlerContext chc, Object i, List<Object> list) throws Exception {
        
            ByteBuf buf = ByteBufAllocator.DEFAULT.buffer(RE.length);
            buf.writeBytes(RE);        
            list.add(buf);
        //bb.writeBytes(RE,IN_BYTE_TYPE_MSG, IN_BYTE_TYPE_MSG);
        
    }
}
