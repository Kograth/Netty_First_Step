package ru.cse.proxysorter;

public interface CamelService {

    public void send(String message);

    public String receive();
}
