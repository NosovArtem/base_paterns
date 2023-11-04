package com.nsv.soft.dev.lab.base.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Фабрика легковесных объектов
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}