/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 *
 * @author Oleynik
 */
public class EncoderSorterTlg extends MessageToByteEncoder<Object> {
static final int MAX_PACKET_LENGHT=1024;
static final int IN_BYTE_TYPE_MSG=2;
    @Override
    protected void encode(ChannelHandlerContext chc, Object i, ByteBuf bb) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
