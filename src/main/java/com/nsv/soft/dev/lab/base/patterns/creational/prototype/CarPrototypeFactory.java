package com.nsv.soft.dev.lab.base.patterns.creational.prototype;

public class CarPrototypeFactory {
    Car car;

    public CarPrototypeFactory(Car car) {
        this.car = car;
    }

    Car createCarByPrototype(){
        return (Car) car.clone();
    }
}
