package com.nsv.soft.dev.lab.base.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Skoda Rapid", 5000);

        System.out.println(car);
        System.out.println(car.hashCode());

        System.out.print("\n");

        CarPrototypeFactory carPrototypeFactory = new CarPrototypeFactory(car);

        Car carClone = carPrototypeFactory.createCarByPrototype();

        System.out.println(carClone);
        System.out.println(carClone.hashCode());
    }
}
