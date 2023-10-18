package com.nsv.soft.dev.lab.base.patterns.creational.builder;

public class CarBuilder {

    public CarBuilder() {
    }

    Car car;

    CarBuilder createCar() {
        car = new Car();
        car.setColor("default_white");
        car.setCore("default_1.8");
        car.setName("default_Skoda");
        car.setPrice(10_000);
        return this;
    }

    CarBuilder withPrice(int price) {
        car.setPrice(price);
        return this;
    }

    CarBuilder withName(String name) {
        car.setName(name);
        return this;
    }

    CarBuilder withCore(String core) {
        car.setCore(core);
        return this;
    }

    CarBuilder withColor(String color) {
        car.setColor(color);
        return this;
    }

    Car build(){
        return car;
    }

}
