package com.nsv.soft.dev.lab.base.patterns.dehavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier notifier = new SimpleNotifier(
                Priority.INFO, new EmailNotifier(
                        Priority.WARN, new SmsNotifier(
                                Priority.ASAP, null
                        )
                )
        );


//        notifier.notifyManager("Everything is ok", Priority.INFO);
//        notifier.notifyManager("Need conversation", Priority.WARN);
        notifier.notifyManager("Production was dropped", Priority.ASAP);

    }
}
