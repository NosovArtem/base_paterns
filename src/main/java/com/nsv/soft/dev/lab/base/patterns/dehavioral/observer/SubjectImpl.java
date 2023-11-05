package com.nsv.soft.dev.lab.base.patterns.dehavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> observerList = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
