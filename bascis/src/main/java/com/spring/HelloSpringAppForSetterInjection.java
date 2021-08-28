package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAppForSetterInjection {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Coach myCricketCoach = context.getBean("myNewCoach", Coach.class);
        
        CricketCoach cricketCoach = context.getBean("myNewCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        cricketCoach.getEmailAddress();
        cricketCoach.getTeam();
    }
}