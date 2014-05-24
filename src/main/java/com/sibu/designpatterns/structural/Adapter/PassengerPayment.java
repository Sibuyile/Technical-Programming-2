/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.structural.Adapter;

/**
 *
 * @author stud
 */
public interface PassengerPayment {
    
    public double BusinessClassPrice();
    public void setClassPrice(double BusinessPrice);
    
    public double EconomyClassPrice();
    public void setEcoClassPrice(double EconomyPrice);
    
    public double FirstClassPrice();
    public void setFirstPrice(double FirstPrice);
    
    
    
}
