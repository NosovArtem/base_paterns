package com.nsv.soft.dev.lab.base.patterns.structural.flyweight;

 // Конкретный легковесный объект
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState; // Общее (внутреннее) состояние

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight: Intrinsic State - " + intrinsicState);
    }
}