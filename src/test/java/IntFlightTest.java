/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Flight.InternationalFlight;
import junit.framework.Assert;
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
public class IntFlightTest {
    
   // public IntFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void InternationalTest() throws Exception
     {
         InternationalFlight intFly = new InternationalFlight.Builder(300).flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity(500).seatsAvailable(150).build();
         Assert.assertEquals("Birtish", intFly.getFlightName());
         Assert.assertEquals("NewYork", intFly.getDepartureCity());
         Assert.assertEquals("Auckland", intFly.getArriveCity());
         Assert.assertEquals(500, intFly.getTotalCapacity());
         Assert.assertEquals(150, intFly.getSeatsAvailable());
     }
     
     //
     @Test
    // public void hello() {}
     public static void InternationalUpdate() throws Exception
     {
         InternationalFlight intFly = new InternationalFlight.Builder(310).flightName("British").departureCity("Saint Petersburg").arriveCity("Tamanrasset").totalCapacity(400).seatsAvailable(50).build();
         Assert.assertNotSame("Birtish", intFly.getFlightName());
         Assert.assertNotSame("NewYork", intFly.getDepartureCity());
         Assert.assertNotSame("Auckland", intFly.getArriveCity());
         Assert.assertNotSame(500, intFly.getTotalCapacity());
         Assert.assertNotSame(150, intFly.getSeatsAvailable());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
