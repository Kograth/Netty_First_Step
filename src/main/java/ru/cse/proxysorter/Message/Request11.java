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
public class Request11 {

    protected byte Comand = 0x00;
    protected byte[] codePLK = new byte[4];
    protected short weight = 0;
    protected short StateWeight = 0;   
    protected short length = 0;
    protected short width = 0;
    protected short height = 0;
    protected short stateSize  = 0;     
    protected String barcode;     
}
