package ru.cse;

import TestData.GetArraysByte;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PointOfEntry {

    //Класс для тестирования отправки данных в поток

    public static void main(String[] args) throws Exception {


       GetArraysByte MassToStream = new GetArraysByte();
       //byte[] ArrayToStream = new byte[] {2, 111, 58, 50, 53, 54, 51, 50, 49, 52, 55, 56, 57, 54, 9, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 80, 3,};
        byte[] ArrayToStream = MassToStream.Request11();


        Socket clientSocket = new Socket("localhost",5111); //te1


        Character  TABs = 0x09;
        //String BarCode              = new String("4605246004353"+TABs+"4703934000779"+TABs+"4803934000779"+TABs+"4804934000779"+TABs+"4303934000779"+TABs+"5003934000779"+TABs+"0603934000779"+TABs+"4793934000779"+TABs+"4103934000779"+TABs+"4504934000779"+TABs+"4903934000779"+TABs+"450444");


       /* DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        outToServer.writeByte(2);
        outToServer.writeByte(111);
        outToServer.writeByte(91);
        outToServer.write(BarCode.getBytes());
        outToServer.writeByte(23);
        outToServer.writeByte(3);*/
        //outToServer.write(BarCode3.getBytes());


        //DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        //outToServer.write(ArrayToStream);
        //outToServer.flush();*/

        //GetArraysByte MassByte = new GetArraysByte();
        //byte[] ArrayToStream = MassByte.Request11();

        //Socket clientSocket = new Socket("te1",5150); //te1
        //byte[] ArrayToStream = new byte[] {2, 111, 58, 50, 53, 54, 51, 50, 49, 52, 55, 56, 57, 54, 9, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 80, 3,};

       // System.out.println(ArrayToStream.length);
       DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
       outToServer.write(ArrayToStream);
        //outToServer.flush();


    }
}
