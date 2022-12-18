/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author acer swift 3
 */
@ComponentScan("spring.demo.annotations")
public class AnnotationDemoApp {
    public static void main(String[] args) {
        //read spring config file
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AnnotationDemoApp.class);
        // get the bean from spring container
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        Coach theFootballer=context.getBean("footballCoach",Coach.class);
        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
       // System.out.println(theFootballer.getDailyWorkout());
        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
