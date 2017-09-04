/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Message;

/**
 *
 * @author Oleynik
 */
public class Responce12 {
      
    private byte Command = 0x00;  

    /**
     * @return the Command
     */
    public byte getCommand() {
        return Command;
    }

    /**
     * @param Command the Command to set
     */
    public void setCommand(byte Command) {
        this.Command = Command;
    }
}
