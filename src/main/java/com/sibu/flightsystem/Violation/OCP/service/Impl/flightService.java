/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.Violation.OCP.service.Impl;

/**
 *
 * @author stud
 */
public class flightService {
    
    int travelChoice;
    String message;
    double seatPrice;
    int seatsBooked;
    
    
 
    
    public void Travel()
    {
        if(travelChoice == 0)
            InternationalFlights();
        else
            LocalFlights();
       
        
    }
    
    public void InternationalFlights()
    {
        double intPrice = 15000;
        
        seatPrice = intPrice * seatsBooked;
        
            
    }
    
    public void LocalFlights()
    {
        double locPrice = 15000;
        
        seatPrice = locPrice * seatsBooked;
        
    }
    
   
    
    
}
