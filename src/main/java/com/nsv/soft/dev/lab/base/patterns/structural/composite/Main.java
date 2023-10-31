package com.nsv.soft.dev.lab.base.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        Developer dev1 = new JavaDeveloper();
        Developer dev2 = new JavaDeveloper();
        Developer dev3 = new CppDeveloper();

        team.addDeveloper(dev1);
        team.addDeveloper(dev2);
        team.addDeveloper(dev3);


        dev1.writeCode(); // Вызываю операцию у разработчика
        team.startTeamWork(); // Вызываю операцию композитной сущности команды
    }
}
