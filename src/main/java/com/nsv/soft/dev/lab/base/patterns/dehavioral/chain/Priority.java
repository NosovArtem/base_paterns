package com.nsv.soft.dev.lab.base.patterns.dehavioral.chain;

public enum Priority {

    INFO(1), WARN(2), ASAP(3);

    int priority;

    Priority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
