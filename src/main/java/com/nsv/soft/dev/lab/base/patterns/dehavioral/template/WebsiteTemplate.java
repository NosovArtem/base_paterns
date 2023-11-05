package com.nsv.soft.dev.lab.base.patterns.dehavioral.template;

public abstract class WebsiteTemplate implements Page {
    @Override
    public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    abstract void showContent();

}
