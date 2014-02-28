/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.DIP.service.Add.Impl;

import com.sibu.flightsystem.NonViolation.DIP.service.SumInterface;

/**
 *
 * @author stud
 */
public class Sum implements SumInterface{
   
    private double amount;
    
    
    @Override
    public double amountPaid(int seatsBooked, int seatPrice)
    {
        amount = seatsBooked * seatPrice;
        
        return amount;
    
    }

    
}
