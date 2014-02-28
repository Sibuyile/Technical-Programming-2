/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.LSP.service.Impl;

/**
 *
 * @author stud
 */
public class Flight extends Airport {
    
    private int flightNumber;
    
    @Override
    public void setFlightNumber(int flyNumber)
    {
        flightNumber = flyNumber;
        
    }
    
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
}
