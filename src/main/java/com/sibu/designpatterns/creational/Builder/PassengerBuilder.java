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
public interface PassengerBuilder {
    
    public void buildBusiness();
    public void buildEconomy();
    public void buildFirstClass();
    
    public Passenger getPass();
    
}
