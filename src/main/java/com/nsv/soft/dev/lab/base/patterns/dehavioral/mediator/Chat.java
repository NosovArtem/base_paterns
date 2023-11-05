package com.nsv.soft.dev.lab.base.patterns.dehavioral.mediator;

public interface Chat { // mediator
    void sendMessage(String message, User user);
}
