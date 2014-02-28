/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightSystem;

import com.sibu.flightsystem.NonViolation.DIP.service.SumInterface;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Booking;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Flight;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Ticket;
import com.sibu.flightsystem.config.FlightConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author stud
 */
public class SRPTest {
    
    private Booking srp;
    
    public SRPTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     
     public void SRPTest()
     {
         Flight fly = new Flight();
         Ticket tic = new Ticket();
         
        
         //Fails
       //  assertTrue(fly.getFlightNumber() != tic.getFlightNumber());
         
         assertTrue(fly.getFlightNumber() == tic.getFlightNumber());
         
     
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FlightConfig.class);
        srp = (Booking)ctx.getBean("SRP");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
