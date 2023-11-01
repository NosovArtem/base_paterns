package com.nsv.soft.dev.lab.base.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String makeReview(){
        return " make review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob()  + makeReview();
    }
}
