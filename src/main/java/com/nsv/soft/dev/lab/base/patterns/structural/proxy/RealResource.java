package com.nsv.soft.dev.lab.base.patterns.structural.proxy;

public class RealResource implements Resource {

    String name;

    public RealResource(String name) {
        this.name = name;
    }

    @Override
    public void access() {
        System.out.println("Accessing resource: " + name);
    }
}
