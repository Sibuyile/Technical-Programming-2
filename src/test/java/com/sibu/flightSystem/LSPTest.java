/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightSystem;

import com.sibu.flightsystem.NonViolation.DIP.service.SumInterface;
import com.sibu.flightsystem.NonViolation.LSP.service.Impl.Flight;
import com.sibu.flightsystem.Violation.LSP.service.Impl.Ticket;
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
public class LSPTest {
    
    private Flight lsp;
    
    public LSPTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public void testLSP()
     {
         Flight fly = new Flight();
         Ticket tic = new Ticket();
         int flightNumber = 100;
         
         fly.setFlightNumber(flightNumber);
         tic.setFlightNumber(flightNumber);
         
         assertEquals(fly.getFlightNumber(), tic.getFlightNumber());
         //Fails
         //assertNotEquals(fly.getFlightNumber(), tic.getFlightNumber());
         
     }
     

    @BeforeClass
    public void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FlightConfig.class);
        lsp = (Flight)ctx.getBean("LSP");
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
