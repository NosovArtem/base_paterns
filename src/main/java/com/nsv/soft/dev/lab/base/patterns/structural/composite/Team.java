package com.nsv.soft.dev.lab.base.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Developer> developerList = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    public void startTeamWork() {
        System.out.println("Start team working...\n");
        for (Developer developer : developerList) {
            developer.writeCode();
        }
    }
}
