/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.structural.Facade;

/**
 *
 * @author stud
 */
public class Class2 {
    
    public int doAnotherThing(Class1 class1, int x)
    {
        return 2 * class1.doSomethingComplicated(x);
    }
    
}
