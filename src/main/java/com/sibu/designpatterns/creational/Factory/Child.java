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
public class Child extends AgeType {
    
    int age;
    String msg;

    @Override
    public String getAge() {
        
        if(age < 3)
          msg = "The passenger is an child and must pay 10%";
        
        return "less than 10";
        
        
        
    }
    
}