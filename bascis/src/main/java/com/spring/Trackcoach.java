package com.spring;

public class Trackcoach implements Coach{

    @Override
    public String getDailyWorkout() {        
        return "Run hard for 5k";
    }

    @Override
    public String getDailyFortune() {        
        return null;
    }        
}
