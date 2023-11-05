package com.nsv.soft.dev.lab.base.patterns.dehavioral.strategy;

public class Reading implements Action{
    @Override
    public void justDoIt() {
        System.out.println("Developer is Reading documentation...");
    }
}
