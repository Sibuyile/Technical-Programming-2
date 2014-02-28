/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightSystem;

import com.sibu.flightsystem.NonViolation.DIP.service.SumInterface;
import com.sibu.flightsystem.NonViolation.PLK.service.Impl.Flights;
import com.sibu.flightsystem.NonViolation.PLK.service.Impl.Tickets;
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
public class PLKTest {
    
    private Tickets plk;
    
    public PLKTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     
     public void PlkTest()
     {
         Flights f = new Flights();
         Tickets t = new Tickets();
         
         f.setFlightNumber(100);
         
         assertEquals(f.getFlightNumber(), 100);
         
         //Fails
          //assertEquals(f.getFlightNumber(), 150);
         
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FlightConfig.class);
        plk = (Tickets)ctx.getBean("PLK");
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
