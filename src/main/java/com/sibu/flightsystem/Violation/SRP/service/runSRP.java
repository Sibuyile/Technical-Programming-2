/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.Violation.SRP.service;

import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Booking;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Flight;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Ticket;

/**
 *
 * @author stud
 */
public class runSRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Flights fly = new Flights();
        Tickets tick = new Tickets();
        String message;
        
        String passengerDetails = "S. Mdladlana";
        int seats = 2;
        
        tick.setPassengerDetails(passengerDetails);
        tick.setSeatsBooked(seats);
        
        
        if(fly.getFlightNumber() == tick.getFlightNumber())
        {
           
            tick.toString();
        }
        else
            message = "Flight does not exist";
        
       
    }
    
}
