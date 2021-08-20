package com.spring;

public class CricketCoach implements Coach{

    private FortuneService myFortuneService;

    public CricketCoach(){
        System.out.println("Inside no arg constructor of CricketCoach");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.myFortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {       
        return "Practice batting for 10 days";
    }

    @Override
    public String getDailyFortune() {        
        return myFortuneService.getDailyFortune();
    }
    
}
