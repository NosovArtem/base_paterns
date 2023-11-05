package com.nsv.soft.dev.lab.base.patterns.dehavioral.chain;

public abstract class Notifier {
    private Priority priority;
    private Notifier notifier;

    public Notifier(Priority priority, Notifier notifier) {
        this.priority = priority;
        this.notifier = notifier;
    }

    public void notifyManager(String message, Priority priorityLevel){
        if (priorityLevel.getPriority() >= priority.getPriority()) {
            write(message);
        }
        if (notifier != null) {
            notifier.notifyManager(message, priorityLevel);
        }
    }

    abstract void write(String message);
}
