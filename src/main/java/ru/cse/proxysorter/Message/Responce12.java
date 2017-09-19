/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 *
 * @author Oleynik
 */
public class Responce12 extends Request4All {
      
    private byte Command    = 0x12;
    public byte msgSTX      = 0x02;
    public byte msgETX      = 0x03;
    public short codeProduct =1000;
    public byte ExitNumber   = 0x00;


    public byte getCommand() {
        return Command;
    }

    /**
     * @param Command the Command to set
     */
    public void setCommand(byte Command) {
        this.Command = Command;
    }

    @Override
    public ByteBuf ToByte() {

        byte[] answer = new byte[]{0x02,0x12,0x43,0x66,0x28,0x03};
        msgSTX  = 0x02;
        Command = 0x12;
        codeProduct = 9999;
        ExitNumber  = 40;
        msgETX      = 0x03;

        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(answer);

        return  buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

    }
}
