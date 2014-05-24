/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.structural.Composite;

/**
 *
 * @author stud
 */
public class Leaf implements Component {
    
    String name;
    
    public Leaf(String name)
    {
        this.name = name;
        
    }

    @Override
    public void sayHello() {

        System.out.println(name + "Leaf says hello");
    
    }

    @Override
    public void sayGoodbye() {

        System.out.println(name + "Leaf say goodbye");
        }
    
}
