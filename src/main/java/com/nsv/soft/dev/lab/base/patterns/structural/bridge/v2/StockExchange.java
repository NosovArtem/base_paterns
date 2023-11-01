package com.nsv.soft.dev.lab.base.patterns.structural.bridge.v2;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        developer.writeCode();
    }
}
