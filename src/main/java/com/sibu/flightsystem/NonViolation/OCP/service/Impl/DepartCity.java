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

import com.sibu.flightsystem.NonViolation.OCP.service.flightInterface;

/**
 *
 * @author stud
 */
public class DepartCity implements flightInterface{

  //  IntFlights f = new IntFlights();
   // LocFlights l;
    int seats = 2;
    double seatPrice;
    double amtPaid;
    
    @Override
    public double ticketPrice() 
    {
       // double choice = 0;
        
        
       /* if(choice == f.intFlights())
        {
            amtPaid = seats * seatPrice;
            
           // return amtPaid;
        }
        else if(choice == l.locFlights())*/
    //    {
            amtPaid = seats * seatPrice;
            
            //return amtPaid;
            
       // }
        return amtPaid;
      
        
    }
    
    
    
    
    
}
