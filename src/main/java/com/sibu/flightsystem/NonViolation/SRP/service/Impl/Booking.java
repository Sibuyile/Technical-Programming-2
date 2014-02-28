/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.SRP.service.Impl;

import javax.swing.JOptionPane;

/**
 *
 * @author stud
 */
public class Booking {
    
    Flight f;
    Ticket t;
    private String passengerDetails;
    private String seatsBooked;
    private double amountPaid;
    private int seats;
    
    public void bookTicket()
    {
       // 
       // 
        
        passengerDetails = JOptionPane.showInputDialog("What is your full name: ");
        seatsBooked = JOptionPane.showInputDialog("How many seats do you want??");
        seats = Integer.parseInt(seatsBooked);
        
        amountPaid = seats * f.seatPrice;
           
    }
    
    public String toString()
    {
        return "Ticket number: " + t.getTicketNUmber() + "\n" +
                "Flight number: " + t.getFlightNumber() + "\n" +
                "Passenger Details: " + passengerDetails + "\n" +
                "seats booked: " + seats + "\n" + "Amount: " + amountPaid + " ";
                
    }
    
}
