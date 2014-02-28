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
public class Tickets extends Airport {
    
    private int flyNumber;

    @Override
    void setFlightNumber(int flyNumber)
    {
        flyNumber = flyNumber;
    
    }
    
    public int getFlightNumber()
    {
        return flyNumber;
    }
    
    
    
}
