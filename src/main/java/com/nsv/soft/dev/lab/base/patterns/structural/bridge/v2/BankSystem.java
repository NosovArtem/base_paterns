package com.nsv.soft.dev.lab.base.patterns.structural.bridge.v2;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        developer.writeCode();
    }
}
