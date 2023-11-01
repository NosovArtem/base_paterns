package com.nsv.soft.dev.lab.base.patterns.structural.decorator;

public class JavaTeamLead extends  DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    String createReport(){
        return " create report.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + createReport();
    }
}
