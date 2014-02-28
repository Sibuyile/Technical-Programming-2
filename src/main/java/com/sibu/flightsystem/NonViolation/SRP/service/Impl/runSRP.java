/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.SRP.service.Impl;

/**
 *
 * @author stud
 */
public class runSRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Booking book = new Booking();
        Flight fly = new Flight();
        Ticket tick = new Ticket();
        String message;
        
        if(fly.getFlightNumber() == tick.getFlightNumber())
        {
            book.bookTicket();
            book.toString();
        }
        else
            message = "Flight does not exist";
            
        
    }
    
}
