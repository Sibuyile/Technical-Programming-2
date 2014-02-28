/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.OCP.service.Impl;

/**
 *
 * @author stud
 */
public class LocFlights extends DepartCity{
    
     private double amount = 1500;
    
    public double locFlights()
    {
        
        amtPaid = super.ticketPrice() * amount;
        
        return amtPaid;
        
        
    
        
        
        
    }
    
}
