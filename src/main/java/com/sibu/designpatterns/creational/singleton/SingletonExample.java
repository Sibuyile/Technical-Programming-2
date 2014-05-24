/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.creational.singleton;

/**
 *
 * @author stud
 */
public class SingletonExample {
    
    private static SingletonExample single;
    private String f;
    
    private SingletonExample()
    {
        
    }
    
    public static SingletonExample getInstance()
    {
        if(single == null)
            single = new SingletonExample();
        
            return single;
        
    }
    
    public String Flights()
    {
        //System.out.println("Hello");
        
        f = "The are flights available";
        
        return f;
    }
    

    
}
