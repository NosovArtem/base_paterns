package com.nsv.soft.dev.lab.base.patterns.structural.bridge.v2;

public abstract class Program {

    protected  Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
