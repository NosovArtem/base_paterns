package com.nsv.soft.dev.lab.base.patterns.creational.factory;

public class TransportFactory {

    Transport createTransport(String type) {
        Transport transport;
        if ("A".equalsIgnoreCase(type)) {
            transport = new Car();
        } else if ("M".equalsIgnoreCase(type)) {
            transport = new Motobike();
        } else if ("P".equalsIgnoreCase(type)) {
            transport = new Plane();
        } else {
            throw new RuntimeException(type + " is not supported");
        }
        return transport;

    }
}
