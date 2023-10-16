package com.nsv.soft.dev.lab.base.patterns.creational.factory;

public class Car implements Transport{
    @Override
    public void drive() {
        System.out.println("travel by car");
    }
}
