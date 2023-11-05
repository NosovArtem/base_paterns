package com.nsv.soft.dev.lab.base.patterns.dehavioral.visitor;

public class ConcreteElementB {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operationB() {
        System.out.println("Operation B in ConcreteElementB");
    }
}
