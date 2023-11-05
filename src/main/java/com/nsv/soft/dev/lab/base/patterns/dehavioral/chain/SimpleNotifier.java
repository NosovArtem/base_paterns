package com.nsv.soft.dev.lab.base.patterns.dehavioral.chain;

public class SimpleNotifier extends  Notifier{
    public SimpleNotifier(Priority priority, Notifier notifier) {
        super(priority, notifier);
    }

    @Override
    void write(String message) {
        System.out.println("Simple notifier sent: "+ message);
    }
}
