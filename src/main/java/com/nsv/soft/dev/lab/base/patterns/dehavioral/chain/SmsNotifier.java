package com.nsv.soft.dev.lab.base.patterns.dehavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(Priority priority, Notifier notifier) {
        super(priority, notifier);
    }

    @Override
    void write(String message) {
        System.out.println("Sms notifier sent: " + message);
    }
}
