package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAppForSetterInjection {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("myNewCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());
    }
}