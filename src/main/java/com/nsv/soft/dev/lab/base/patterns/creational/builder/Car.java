package com.nsv.soft.dev.lab.base.patterns.creational.builder;

public class Car {
    String name;
    String core;
    int price;
    String color;

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", core='" + core + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
