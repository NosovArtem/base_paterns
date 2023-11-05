package com.nsv.soft.dev.lab.base.patterns.dehavioral.state;

public class Developer {

    Activity activity;

    public Developer(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    void changeActivity(){
        if (activity instanceof Coding) {
            setActivity(new Reading());
            activity.justDoIt();
        }else if (activity instanceof Reading){
            setActivity(new Coding());
            activity.justDoIt();
        }
    }


}
