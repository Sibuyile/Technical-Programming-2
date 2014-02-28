/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.Violation.ISP.service.Impl;

import com.sibu.flightsystem.Violation.ISP.service.Airport;

/**
 *
 * @author stud
 */
public class Tickets implements Airport{

    @Override
    public void flightNumber() {
    
        System.out.println ("The flight number");
    }

    @Override
    public void ticketNumber() {
        
        System.out.println("The ticket number");
    
    }
    
}
