package com.apress.springrecipes.hello;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello();
        
        List<Holiday> holidays = helloWorld.getHolidays();
        for (int i = 0; i < holidays.size(); i ++) {
        	System.out.println("Month: " + holidays.get(i).getMonth());
        	System.out.println("Day: " + holidays.get(i).getDay());
        	System.out.println("Greeting: " + holidays.get(i).getGreeting());
        }
    }
}
