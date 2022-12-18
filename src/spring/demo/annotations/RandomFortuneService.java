/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring.demo.annotations;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author acer swift 3
 */
@Component
public class RandomFortuneService implements FortuneService {

    	// create an array of strings
	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
        
        // create a random number generator
	private Random myRandom = new Random();
    
    @Override
    public String getFortune() {
        int index=myRandom.nextInt(data.length);
        String theFortune=data[index];
        return theFortune;
    }
    
}
