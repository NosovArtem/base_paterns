package com.nsv.soft.dev.lab.base.patterns.dehavioral.visitor;

public class VisitorPatternExample {
    public static void main(String[] args) {
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();
        ConcreteVisitor visitor = new ConcreteVisitor();

        elementA.accept(visitor);
        System.out.println("\n===============\n");
        elementB.accept(visitor);
    }
}
