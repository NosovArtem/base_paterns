package com.nsv.soft.dev.lab.base.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        Transport transport = transportFactory.createTransport("P");

        transport.drive();



    }
}
