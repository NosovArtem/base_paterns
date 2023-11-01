package com.nsv.soft.dev.lab.base.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                new SeniorJavaDeveloper(
                        new JavaDeveloper()
                )
        );

        System.out.println(developer.makeJob());
    }
}
