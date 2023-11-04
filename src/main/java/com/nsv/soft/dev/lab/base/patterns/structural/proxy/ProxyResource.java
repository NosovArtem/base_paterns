package com.nsv.soft.dev.lab.base.patterns.structural.proxy;

public class ProxyResource implements Resource{
    RealResource resource;
    String name;
    boolean isAllowed;

    public ProxyResource(String name, boolean isAllowed) {
        this.name = name;
        this.isAllowed = isAllowed;
    }

    @Override
    public void access() {
        if (isAllowed) {
            if (resource == null) {
                resource = new RealResource(name);
            }
            resource.access();
        }else{
            System.out.println("Access to resource " + name + " is not allowed");
        }
    }
}
