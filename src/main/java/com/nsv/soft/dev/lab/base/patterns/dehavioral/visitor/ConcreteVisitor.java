package com.nsv.soft.dev.lab.base.patterns.dehavioral.visitor;

public class ConcreteVisitor  implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting ConcreteElementB");
        elementB.operationB();
    }
}
