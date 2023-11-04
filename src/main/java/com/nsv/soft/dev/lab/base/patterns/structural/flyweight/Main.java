package com.nsv.soft.dev.lab.base.patterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        // Получаем легковесные объекты с одинаковым внутренним состоянием
        Flyweight flyweight1 = factory.getFlyweight("A");
        Flyweight flyweight2 = factory.getFlyweight("A");

        // Легковесные объекты совместно используют общее внутреннее состояние
        flyweight1.operation(); // Выводит: "ConcreteFlyweight: Intrinsic State - A"
        flyweight2.operation(); // Выводит: "ConcreteFlyweight: Intrinsic State - A"

        // Получаем легковесный объект с другим внутренним состоянием
        Flyweight flyweight3 = factory.getFlyweight("B");
        flyweight3.operation(); // Выводит: "ConcreteFlyweight: Intrinsic State - B"
    }
}
