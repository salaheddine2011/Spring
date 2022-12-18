/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author acer swift 3
 */
@Component
public class RandomService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
    
}
