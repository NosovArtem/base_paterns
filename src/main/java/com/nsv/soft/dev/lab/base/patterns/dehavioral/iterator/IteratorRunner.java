package com.nsv.soft.dev.lab.base.patterns.dehavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Maven", "Spring", "PostgreSQL", "Kafka"};

        Developer developer = new Developer("Artem", skills);


        System.out.println("Developer: " + developer.name);
        System.out.println("Skills: ");
        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
