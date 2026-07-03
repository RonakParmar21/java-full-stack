package com.ronak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Motor motor = classPathXmlApplicationContext.getBean(Motor.class);
        motor.doWork();
        classPathXmlApplicationContext.close();
    }
}
