package com.spring;

public class CricketCoach implements Coach{

    private FortuneService myFortuneService;


    // Injecting literal values
    public String emailAddress;
    public String team; 
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method : setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method : setTeam");
        this.team = team;
    }    

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
