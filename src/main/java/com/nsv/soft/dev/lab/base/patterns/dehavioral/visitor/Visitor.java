package com.nsv.soft.dev.lab.base.patterns.dehavioral.visitor;

public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
