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
public class Adult implements PassengerBuilder{
    
    private Passenger p;
    
    public Adult()
    {
        p = new Passenger();
    }

    @Override
    public void buildBusiness() {
        
        p.setBusiness("Adult business");
        
    }

    @Override
    public void buildEconomy() {

        p.setEconomy("Adult economy");
    
    }

    @Override
    public void buildFirstClass() {

        p.setFirstClass("Adult first class");
        
    }

    @Override
    public Passenger getPass() {

        return p;
        
    }
    
    
}
