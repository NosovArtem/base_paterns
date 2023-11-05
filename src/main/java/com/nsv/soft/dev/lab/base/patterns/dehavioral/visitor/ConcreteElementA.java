package com.nsv.soft.dev.lab.base.patterns.dehavioral.visitor;

public class ConcreteElementA {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operationA() {
        System.out.println("Operation A in ConcreteElementA");
    }
}
