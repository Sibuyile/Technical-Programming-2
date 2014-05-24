/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.creational.Prototype;

/**
 *
 * @author stud
 */
public class Adult implements Flights{
    
    String type;
    
    public Adult(String s)
    {
        this.type = s;
        
    }
  
    @Override
    public Flights doClone() {

        
        return new Adult(type);
    
    }
    
    public String toString()
    {
        return "Adult class";
        
    }
    
    
    
}
