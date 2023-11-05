package com.nsv.soft.dev.lab.base.patterns.dehavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private Admin admin;
    private List<User> userList = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setUserToChat(User user) {
        this.userList.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : userList) {
            if (user != sender) {
                user.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
