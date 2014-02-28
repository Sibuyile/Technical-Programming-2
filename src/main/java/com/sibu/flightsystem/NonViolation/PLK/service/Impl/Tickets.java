/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.PLK.service.Impl;

/**
 *
 * @author stud
 */
public class Tickets {
    
   
    int flightNumber;
    
    public void setFlightNumber(Flights f)
    {
        f = new Flights();
        
        flightNumber = f.getFlightNumber();
    
    }
    
    public int Tickets( Flights f)
    {
        flightNumber = f.getFlightNumber();
        
        return flightNumber;
        
    }
    
}
