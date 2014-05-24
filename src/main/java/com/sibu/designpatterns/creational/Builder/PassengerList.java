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
public class PassengerList {
    
    private PassengerBuilder pass;
    
    public PassengerList(PassengerBuilder p)
    {
            this.pass = p;
    
    }
    
    public void PassengerConstructor()
    {
        pass.buildBusiness();
        pass.buildEconomy();
        pass.buildFirstClass();
        
    }
    
    public Passenger getPass()
    {
        
        return pass.getPass();
    }
    
    
    
}
