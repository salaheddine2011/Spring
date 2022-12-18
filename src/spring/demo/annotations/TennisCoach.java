/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author acer swift 3
 */

//@Component(value = "TennisCoach")
@Component
public class TennisCoach implements Coach {
     
    @Autowired
    private FortuneService fortuneService;
    
//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService=fortuneService;
//    }
    
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }
    
    //Define a setter method
    //Cofigure the dependency injection
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService){
//        System.out.println(">> TennisCoach: inside setFortuneService() method");
//        fortuneService=theFortuneService;
//    }
    
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService){
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//        fortuneService=theFortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice your Backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() ;
    }
    
}
