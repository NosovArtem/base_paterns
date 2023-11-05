package com.nsv.soft.dev.lab.base.patterns.dehavioral.mediator;

public class SimpleUser implements  User{
    Chat chat; // mediator
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " received message: " + message + ".");
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
}
