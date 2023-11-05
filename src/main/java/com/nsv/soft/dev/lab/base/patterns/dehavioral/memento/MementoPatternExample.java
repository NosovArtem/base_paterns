package com.nsv.soft.dev.lab.base.patterns.dehavioral.memento;

public class MementoPatternExample {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("State 1");
        history.push(editor.save());

        editor.setContent("State 2");
        history.push(editor.save());

        editor.setContent("State 3");

        System.out.println("Current content: " + editor.getContent());

        // Восстанавливаем состояние из снимка
        editor.restore(history.pop());
        System.out.println("Restored content: " + editor.getContent());
    }
}
