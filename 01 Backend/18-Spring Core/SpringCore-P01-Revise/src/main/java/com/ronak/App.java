package com.ronak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Car car = applicationContext.getBean(Car.class);
        car.drive();

        // this is singleton scope example
        // now question is how to identify this project use singleton scope?
        // if scope is singleton then constructor call only once
        // answer is : (this code)
        Car car1 = applicationContext.getBean(Car.class);
        Car car2 = applicationContext.getBean(Car.class);
        System.out.println("Same object? : " + (car1 == car2));


        PetrolEngine petrolEngine1 = applicationContext.getBean(PetrolEngine.class);
        PetrolEngine petrolEngine2 = applicationContext.getBean(PetrolEngine.class);
        // true if scope is singleton
        // false if scope is prototype
        System.out.println("Same petrol engine object? : " + (petrolEngine1 == petrolEngine2));
    }
}
