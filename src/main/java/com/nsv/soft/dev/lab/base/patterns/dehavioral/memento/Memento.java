package com.nsv.soft.dev.lab.base.patterns.dehavioral.memento;

public class Memento {
    private final String savedContent;

    public Memento(String content) {
        this.savedContent = content;
    }

    public String getSavedContent() {
        return savedContent;
    }
}
