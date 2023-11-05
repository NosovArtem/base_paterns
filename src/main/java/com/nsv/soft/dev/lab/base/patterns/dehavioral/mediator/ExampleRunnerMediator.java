package com.nsv.soft.dev.lab.base.patterns.dehavioral.mediator;

public class ExampleRunnerMediator {
    public static void main(String[] args) {
        SimpleTextChat mediator = new SimpleTextChat();

        Admin admin = new Admin(mediator, "Admin");
        User user1 = new SimpleUser(mediator, "User1");
        User user2 = new SimpleUser(mediator, "User2");

        mediator.setAdmin(admin);
        mediator.setUserToChat(user1);
        mediator.setUserToChat(user2);


        admin.sendMessage("Hello from Amdin!");
        System.out.println("\n============\n");

        user1.sendMessage("Hello from User1!");
        System.out.println("\n============\n");

        user2.sendMessage("Hello from User2!");
    }
}