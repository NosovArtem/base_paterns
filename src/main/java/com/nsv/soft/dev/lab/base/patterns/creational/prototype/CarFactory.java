package com.nsv.soft.dev.lab.base.patterns.creational.prototype;

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    Car createCarByPrototype(){
        return (Car) car.clone();
    }
}
