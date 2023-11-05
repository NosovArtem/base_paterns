package com.nsv.soft.dev.lab.base.patterns.dehavioral.observer;

public class ObserverExample {
    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl("Observer 1");
        Observer observer2 = new ObserverImpl("Observer 2");
        Subject subject = new SubjectImpl();

        subject.addObserver(observer1);
        subject.addObserver(observer2);


        subject.notifyObservers("Hello, observers!");

        System.out.println("\n=============\n");

        subject.removeObserver(observer1);
        subject.notifyObservers("Hello, after remove one");
    }
}
