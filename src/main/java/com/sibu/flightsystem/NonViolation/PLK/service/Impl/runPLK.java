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
public class runPLK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Flights fly = new Flights();
      Tickets tick = new Tickets();
      
      fly.setFlightNumber(100);
      
      System.out.println( tick.Tickets(fly));
      
      
    }
    
}
