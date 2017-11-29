/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.NettyCodecs;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import org.apache.camel.component.netty4.NettyConfiguration;

/**
 *
 * @author Oleynik
 */
public final class SorterCodecFactory  {

    private SorterCodecFactory() {
        
        
    }

    public static ChannelHandler createDecoderSorterTlg() {

        return new DecoderSorterTlg();
    }
    public static ChannelHandler createEncoderSorterTlg() {
        return new EncoderSorterTlg();
    }

//    // GOOD
//    @Override
//    public void channelRead(ChannelHandlerContext ctx,Object msg) {
//        ChannelFuture future = ctx.channel().close();
//        future.addListener(new ChannelFutureListener() {
//            public void operationComplete(ChannelFuture future) {
//                // Perform post-closure operation
//                // ...
//            }
//        });
}

