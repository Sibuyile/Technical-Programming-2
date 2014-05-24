/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.creational.Factory;

/**
 *
 * @author stud
 */
public class Infant extends AgeType {
    
    int age;
    String msg;

    @Override
    public String getAge() {
        
        if(age < 3)
          msg = "The passenger is an infant";
        return "less than 3";
        
        
        
    }
    
}
