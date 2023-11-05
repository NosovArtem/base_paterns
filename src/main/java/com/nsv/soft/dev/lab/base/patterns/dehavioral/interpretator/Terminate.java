package com.nsv.soft.dev.lab.base.patterns.dehavioral.interpretator;

public class Terminate implements Expression {

    String data;

    public Terminate(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
