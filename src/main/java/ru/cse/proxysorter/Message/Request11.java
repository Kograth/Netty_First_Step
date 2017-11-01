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
public class Request11 extends Request4All {


    //Общие данные класса для правильного декодирования
        public static final byte MESSAGE_CODE=Telegram.TELEGA11;
        public static final int MESSAGE_LENGHT=179;
        
    private short smlSTX = 0x02;        
    private short COMMAND = 0x11;
    private int codePLK = 0;
    private short weight = 0;
    private short StateWeight = 0;   
    private short length = 0;
    private short width = 0;
    private short height = 0;
    private short stateSize  = 0;     
    private String barcode;     
    private short smlETX = 0x03;

    //эти переменные для про
    private String barcode1С;     
    //эти переменные для про
    private short ExitNumber = 0x04;  
    
    
    /**
     * @return the Comand
     */
    public short getCommand() {
        return COMMAND;
    }

    /**
     * @return the codePLK
     */
    public int getCodePLK() {
        return codePLK;
    }

    /**
     * @param codePLK the codePLK to set
     */
    public void setCodePLK(int codePLK) {
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
    public int getWidth() {
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

    /**
     * @return the barcode1С
     */
    public String getBarcode1С() {
        return barcode1С;
    }

    /**
     * @param barcode1С the barcode1С to set
     */
    public void setBarcode1С(String barcode1С) {
        this.barcode1С = barcode1С;
    }    

    /**
     * @return the ExitNumber
     */
    public short getExitNumber() {
        return ExitNumber;
    }

    /**
     * @param ExitNumber the ExitNumber to set
     */
    public void setExitNumber(short ExitNumber) {
        this.ExitNumber = ExitNumber;
    }
    
    @Override
    public ByteBuf ToByte() {
        

        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        smlSTX = msg.readUnsignedByte(); // <STX>
        COMMAND = msg.readUnsignedByte(); // <Команда должна быть равна 11>
        codePLK     = msg.readInt();     // код продукта ПЛК
        weight      = msg.readShort();   // вес
        StateWeight = msg.readShort();   // статус веса
        length      = msg.readShort();   // длина
        width       = msg.readShort();   // ширина
        height      = msg.readShort();   // высота
        stateSize   = msg.readShort();   // статус размера
        byte[] Array = new byte[160];
        msg.readBytes(Array);
        barcode     = new String(Array).trim(); //new String(msg.readBytes(160).array()); //Штрих коды разделенные знаком TAB
        smlETX      = msg.readUnsignedByte(); //<ETX>
    }


}
