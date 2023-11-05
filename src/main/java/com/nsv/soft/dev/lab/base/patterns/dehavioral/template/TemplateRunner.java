package com.nsv.soft.dev.lab.base.patterns.dehavioral.template;

public class TemplateRunner {
    public static void main(String[] args) {
        Page welcomePage = new WelcomePage();
        Page newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n=================\n");

        newsPage.showPage();
    }
}
