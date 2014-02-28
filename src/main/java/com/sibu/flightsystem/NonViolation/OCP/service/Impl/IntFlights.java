/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.NonViolation.OCP.service.Impl;

import java.util.Scanner;

/**
 *
 * @author stud
 */
public class IntFlights extends DepartCity {
    
    private double amount = 10000;
    
    public double intFlights()
    {
        
        amtPaid = super.ticketPrice() * amount;
        
        return amtPaid;
        
        
        
    }
    
    
}
