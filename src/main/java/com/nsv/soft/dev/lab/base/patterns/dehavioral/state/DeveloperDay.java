package com.nsv.soft.dev.lab.base.patterns.dehavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Developer developer = new Developer(new Reading());

        developer.changeActivity();
        developer.changeActivity();
        developer.changeActivity();
    }
}
