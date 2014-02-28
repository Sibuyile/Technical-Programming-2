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
public class Ticket {
    
    Flight f;
    
    int ticketNumber;
    int flightNumber;
    String passengerDetails;
    double seatsBooked;
    double amountPaid;
    
    public void tickets()
    {
        ticketNumber = 110;
        flightNumber = f.getFlightNumber();
        
       /* passengerDetails;
        seatsBooked;
        amountPaid;*/
        
    }
    
    public void setTicketNumber(int ticNumber)
    {
        ticketNumber = ticNumber;
    }
    
    public void setFlightNumber(int flyNum)
    {
        flightNumber = flyNum;
    }
    
    public void setPassengerDetails(String pd)
    {
        
        passengerDetails = pd;
    }
    
    public void setSeatsBooked(double sb)
    {
        seatsBooked = sb;
    }
    
    public void setAmountPaid(double amtPaid)
    {
        amountPaid = amtPaid;
    }
    
    public int getTicketNUmber()
    {
        return ticketNumber;
    }
    
    public int getFlightNumber()
    {
        return flightNumber;
    }
            
    public String getPassengerDetails()
    {
        return passengerDetails;
    }
    
    public double getSeatsBooked()
    {
        return seatsBooked;
    }
    
    public double getAmountPaid()
    {
        return amountPaid;
    
    }
    
     public String toString()
    {
        return "Ticket number: " + getTicketNUmber() + "\n" +
                "Flight number: " + getFlightNumber() + "\n" +
                "Passenger Details: " + getPassengerDetails() + "\n" +
                "seats booked: " + getSeatsBooked() + "\n" + "Amount: " + getAmountPaid() + " ";
                
    }
}
