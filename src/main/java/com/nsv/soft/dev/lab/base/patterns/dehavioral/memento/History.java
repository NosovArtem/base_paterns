package com.nsv.soft.dev.lab.base.patterns.dehavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Memento> mementos = new ArrayList<>();

    public void push(Memento memento) {
        mementos.add(memento);
    }

    public Memento pop() {
        Memento memento = mementos.remove(mementos.size() - 1);
        return memento;
    }
}
