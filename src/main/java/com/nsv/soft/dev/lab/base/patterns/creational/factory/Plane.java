package com.nsv.soft.dev.lab.base.patterns.creational.factory;

public class Plane implements Transport{
    @Override
    public void drive() {
        System.out.println("travel by Plane");
    }
}
