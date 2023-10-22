package com.nsv.soft.dev.lab.base.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Database database = new AdapterDbToJavaApp(new JavaApp());

        database.insert();
        database.get();
        database.update();
        database.remove();
    }
}
