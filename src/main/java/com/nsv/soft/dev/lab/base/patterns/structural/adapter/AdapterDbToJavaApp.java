package com.nsv.soft.dev.lab.base.patterns.structural.adapter;

public class AdapterDbToJavaApp implements Database {

    JavaApp javaApp;

    public AdapterDbToJavaApp(JavaApp javaApp) {
        this.javaApp = javaApp;
    }

    @Override
    public void insert() {
        javaApp.create();
    }

    @Override
    public void get() {
        javaApp.read();
    }

    @Override
    public void update() {
        javaApp.update();
    }

    @Override
    public void remove() {
        javaApp.delete();
    }
}
