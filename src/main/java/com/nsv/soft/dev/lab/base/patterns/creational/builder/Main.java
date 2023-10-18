package com.nsv.soft.dev.lab.base.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        Car car = new CarBuilder().createCar()
                .withCore("2.1")
                .withName("Octavia")
                .withPrice(12_000)
                .withColor("blue")
                .build();

        Car car1 = new CarBuilder().createCar()
                .withName("Rapid")
                .build();

        System.out.println(car);
        System.out.println(car1);



    }
}
