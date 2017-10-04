package ru.cse;

import TestData.GetArraysByte;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PointOfEntry {

    //Класс для тестирования отправки данных в поток

    public static void main(String[] args) throws Exception {


        GetArraysByte MassToStream = new GetArraysByte();
        byte[] ArrayToStream;
        ArrayToStream = MassToStream.Request11();

        Socket clientSocket = new Socket("localhost",5150);

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        outToServer.write(ArrayToStream);
        outToServer.flush();
    }
}
