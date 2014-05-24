/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.structural.Proxy;

/**
 *
 * @author stud
 */
public class SlowThing {
    
    public SlowThing()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
