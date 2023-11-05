package com.nsv.soft.dev.lab.base.patterns.dehavioral.chain;

public class EmailNotifier extends Notifier{
    public EmailNotifier(Priority priority, Notifier notifier) {
        super(priority, notifier);
    }

    @Override
    void write(String message) {
        System.out.println("Email notifier sent: " + message);
    }
}
