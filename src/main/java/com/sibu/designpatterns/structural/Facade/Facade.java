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
public class Facade {
    
    public int cubex(int x)
    {
        Class1 class1 = new Class1();
        return class1.doSomethingComplicated(x);
    }
    
    public int cubeXTimes(int x)
    {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        return class2.doAnotherThing(class1, x);
    }
    
    public int xToSixthPowerTimes2(int x)
    {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        return class3.doMoreStaff(class1, class2, x);
    }
     
    
}
