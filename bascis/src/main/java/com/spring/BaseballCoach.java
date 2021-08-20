package com.spring;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {        
        return "Get daily workout for Baseball";
    }

    @Override
    public String getDailyFortune() {       
        return fortuneService.getDailyFortune();
    }        
}
