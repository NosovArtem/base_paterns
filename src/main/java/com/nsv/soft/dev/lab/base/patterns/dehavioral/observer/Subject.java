package com.nsv.soft.dev.lab.base.patterns.dehavioral.observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
