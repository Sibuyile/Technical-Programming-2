/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightSystem;

import com.sibu.flightsystem.NonViolation.DIP.service.SumInterface;
import com.sibu.flightsystem.NonViolation.OCP.service.Impl.IntFlights;
import com.sibu.flightsystem.NonViolation.OCP.service.Impl.LocFlights;
import com.sibu.flightsystem.NonViolation.OCP.service.flightInterface;
import com.sibu.flightsystem.config.FlightConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author stud
 */
public class OCPTest {
    
    private flightInterface ocp;
    
    public OCPTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     
  
     public void TicketPrice()
     {
        IntFlights intFly = new IntFlights();
         
         LocFlights lf = new LocFlights();
       //  int seats = 2;
         double intSeatPrice;
         double locSeatPrice;
         
         
         
         intSeatPrice = intFly.intFlights();
         locSeatPrice = lf.locFlights();
         
         //fails
         // assertNotEquals(locSeatPrice, intSeatPrice);
         assertEquals(locSeatPrice, intSeatPrice);
         
         
     }

    @BeforeClass
    public  void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FlightConfig.class);
        ocp = (flightInterface)ctx.getBean("OCP");
        
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
