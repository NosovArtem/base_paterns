package com.nsv.soft.dev.lab.base.patterns.structural.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Resource resource = new ProxyResource("usual_file.exe", true);
        resource.access();// Доступ разрешен

        Resource resource2 = new ProxyResource("system_file.exe", false);
        resource2.access();// Доступ запрещен
    }
}
