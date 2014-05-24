/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.creational.Builder;

/**
 *
 * @author stud
 */
public class ChildBuilder implements PassengerBuilder{
    
    private Passenger p;
    
    public ChildBuilder()
    {
        p = new Passenger();
    }

    @Override
    public void buildBusiness() {
        
        p.setBusiness("Child business");
    
    }

    @Override
    public void buildEconomy() {

        p.setEconomy("Child Economy");
    }

    @Override
    public void buildFirstClass() {

        p.setFirstClass("Child First class");
    
    }

    @Override
    public Passenger getPass() {

        return p;
    }
    
    
    
}
