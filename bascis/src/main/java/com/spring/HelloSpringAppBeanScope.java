package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAppBeanScope {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");   
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("Memory location for theCoach bean: "+ theCoach);
        System.out.println("Memory location for alphaCoach bean: "+ alphaCoach);
        System.out.println(result);


        Coach newCoach = context.getBean("newCoach", Coach.class);
        Coach otherNewCoach = context.getBean("newCoach", Coach.class);
        System.out.println("Memory location for newCoach bean: " + newCoach);        
        System.out.println("Memory location for otherNewCoach bean: "+ otherNewCoach);

        boolean result1 = (newCoach == otherNewCoach);
        System.out.println(result1);

    }    
}
