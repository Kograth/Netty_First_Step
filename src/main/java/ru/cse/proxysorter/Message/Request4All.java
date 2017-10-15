/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

/**
 *
 * @author Oleynik
 */
public abstract class Request4All {
    public abstract ByteBuf ToByte();
    public abstract void  FromByte(ByteBuf msg);
}
