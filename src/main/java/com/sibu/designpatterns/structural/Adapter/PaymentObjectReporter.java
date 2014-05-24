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
public class PaymentObjectReporter implements PassengerPayment{
    
    Payment p;
    
    public PaymentObjectReporter()
    {
       p = new Payment();
        
    }

   

    @Override
    public double BusinessClassPrice() {

    return p.getPrice();
        
    }

    @Override
    public void setClassPrice(double BusinessPrice) {
        
        p.setPrice(BusinessPrice);
    
    }

    @Override
    public double EconomyClassPrice() {

        return p.getPrice();
    
    }

    @Override
    public void setEcoClassPrice(double EconomyPrice) {

    
           p.setPrice(EconomyPrice);
    }

    @Override
    public double FirstClassPrice() {

        return p.getPrice();
    
    }

    @Override
    public void setFirstPrice(double FirstPrice) {

        p.setPrice(FirstPrice);
    
    }
    
     public double CalcBus(double b)
    {
        return b * 1500;
        
    }
    
    public double CalcEco(double e)
    {
        return e * 700;
        
    }
    
    public double CalcFirst(double f)
    {
        return f * 1500;
        
    }
    
}
