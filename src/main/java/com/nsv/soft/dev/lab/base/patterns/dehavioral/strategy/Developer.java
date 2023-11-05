package com.nsv.soft.dev.lab.base.patterns.dehavioral.strategy;

public class Developer {

    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void execute() {
        action.justDoIt();
    }
}
