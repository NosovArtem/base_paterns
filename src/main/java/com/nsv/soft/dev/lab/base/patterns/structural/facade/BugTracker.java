package com.nsv.soft.dev.lab.base.patterns.structural.facade;

public class BugTracker {

    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("stop sprint...");
        this.activeSprint = true;
    }

    public void stopSprint() {
        System.out.println("start sprint...");
        this.activeSprint = false;
    }
}
