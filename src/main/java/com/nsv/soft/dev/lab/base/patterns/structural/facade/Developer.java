package com.nsv.soft.dev.lab.base.patterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer work work");
        }else {
            System.out.println("Developer chil chil");
        }
    }
}
