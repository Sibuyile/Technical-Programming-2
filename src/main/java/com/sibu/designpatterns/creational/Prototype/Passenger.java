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
public class Passenger implements Flights{
    
    String name;
    
    public Passenger(String n)
    {
        this.name = n;
        
    }

    @Override
    public Flights doClone() {

        return new Passenger(name);
        
    }

    @Override
    public String toString() {
        return "Sibu";
    }
    
    
    
}
