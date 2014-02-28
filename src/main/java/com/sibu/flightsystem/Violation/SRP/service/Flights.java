/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.Violation.SRP.service;

/**
 *
 * @author stud
 */
public class Flights {
    
    int flightNumber;
    String flightDate;
    String departCity;
    String arriveCity;
    int seatsAvailable;
    double seatPrice;
    int seatsSold;
    boolean cancelled;
    
    
   
    public void setFlightNumber(int flyNum)
    {
        flightNumber = flyNum;
    }
    
    public void setFlightDate(String fDate)
    {
        flightDate = fDate;
    }
    
    public void setDepartCity(String deptCity)
    {
        departCity = deptCity;
    }
    
    public void setArriveCity(String arrCity)
    {
        arriveCity = arrCity;
    }
    
    public void setSeatsAvailable(int seatsAvail)
    {
        seatsAvailable = seatsAvail;
    }
    
    public void setSeatPrice(double seatPrice)
    {
        this.seatPrice = seatPrice;
    }
    
    public void setSeatsSold(int seatSold)
    {
        seatsSold = seatSold;
    }
    
    public void setCancelled(boolean cancel)
    {
        cancelled = cancel;
    }
    
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
    public String getFlightDate()
    {
        return flightDate;
    }
    
    public String getDepartCity()
    {
        return departCity;
    }
    
    public String getArriveCity()
    {
        return arriveCity;
    }
    
    public int getSeatsAvailable()
    {
        return seatsAvailable;
    }
    
    public double getSeatPrice()
    {
        return seatPrice;
    }
    
    public int getSeatsSold()
    {
        return seatsSold;
    }
    
    public boolean getCancel()
    {
        return false;
    }
    
}
