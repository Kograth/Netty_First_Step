/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

import java.util.List;

/**
 *
 * @author Oleynik
 */
public class Request11 {
    
    private byte Command = 0x00;
    private byte[] codePLK = new byte[4];
    private short weight = 0;
    private short StateWeight = 0;   
    private short length = 0;
    private short width = 0;
    private short height = 0;
    private short stateSize  = 0;     
    private String barcode;     


    public  List ReadMessage(ByteBuf msg, List<Object> out) {

        for (int i = 0; i < msg.capacity(); i ++) {
            if (msg.readableBytes() < 4) {
                return out;
            }

            msg.markReaderIndex();
//            int length = msg.readInt();
//
//            if (msg.readableBytes() < length) {
//                msg.resetReaderIndex();
//                return out;
//            }

            out.add(msg.readBytes(length));

        }
        return out;
    }

    /**
     * @return the Comand
     */
    public byte getCommand() {
        return Command;
    }

    /**
     * @param Comand the Comand to set
     */
    public void setCommand(byte Comand) {
        this.Command = Comand;
    }

    /**
     * @return the codePLK
     */
    public byte[] getCodePLK() {
        return codePLK;
    }

    /**
     * @param codePLK the codePLK to set
     */
    public void setCodePLK(byte[] codePLK) {
        this.codePLK = codePLK;
    }

    /**
     * @return the weight
     */
    public short getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(short weight) {
        this.weight = weight;
    }

    /**
     * @return the StateWeight
     */
    public short getStateWeight() {
        return StateWeight;
    }

    /**
     * @param StateWeight the StateWeight to set
     */
    public void setStateWeight(short StateWeight) {
        this.StateWeight = StateWeight;
    }

    /**
     * @return the length
     */
    public short getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(short length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public short getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(short width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public short getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(short height) {
        this.height = height;
    }

    /**
     * @return the stateSize
     */
    public short getStateSize() {
        return stateSize;
    }

    /**
     * @param stateSize the stateSize to set
     */
    public void setStateSize(short stateSize) {
        this.stateSize = stateSize;
    }

    /**
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


}
