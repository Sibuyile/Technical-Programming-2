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
public class PaymentClassReporter extends Payment implements PassengerPayment{

    @Override
    public double BusinessClassPrice() {
        
      //  return price;
         return CalcBus(price);
    
    }

    @Override
    public void setClassPrice(double BusinessPrice) {

       this.price = BusinessPrice;
    
    }

    @Override
    public double EconomyClassPrice() {
        
        return CalcEco(price);
    
    }

    @Override
    public void setEcoClassPrice(double EconomyPrice) {

            this.price = EconomyPrice;
    
    }

    @Override
    public double FirstClassPrice() {

        return CalcFirst(price);
    }

    @Override
    public void setFirstPrice(double FirstPrice) {
        
        this.price = FirstPrice;

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
