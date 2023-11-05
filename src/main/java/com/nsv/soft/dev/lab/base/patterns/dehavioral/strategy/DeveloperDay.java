package com.nsv.soft.dev.lab.base.patterns.dehavioral.strategy;

public class DeveloperDay {
    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setAction(new Reading());
        developer.execute();

        developer.setAction(new Coding());
        developer.execute();

    }
}
