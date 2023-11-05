package com.nsv.soft.dev.lab.base.patterns.dehavioral.observer;

public class ObserverImpl implements Observer {
    String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message " + message);
    }
}
