/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Flight.LocalFlight;
import org.testng.Assert;
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
public class LocFlightTest {
    
   // public LocFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void LocFlightTest() throws Exception
     {
         LocalFlight locFly = new LocalFlight.Builder(123).flightName("British").departureCity("Umtata").arriveCity("Jhb").totalCapacity(200).seatsAvailable(60).build();
         Assert.assertEquals(locFly.getFlightName(), "British");
         Assert.assertEquals(locFly.getDepartureCity(), "Umtata");
         Assert.assertEquals(locFly.getArriveCity(), "Jhb");
         Assert.assertEquals(locFly.getTotalCapacity(), 200);
         Assert.assertEquals(locFly.getSeatsAvailable(), 60);
     }
     
    @Test
    // public void hello() {}
     public static void LocFlightUpdate() throws Exception
     {
         LocalFlight locFly = new LocalFlight.Builder(113).flightName("SAA").departureCity("Dbn").arriveCity("CPT").totalCapacity(150).seatsAvailable(50).build();
         Assert.assertNotEquals(locFly.getFlightName(), "British");
         Assert.assertNotEquals(locFly.getDepartureCity(), "Umtata");
         Assert.assertNotEquals(locFly.getArriveCity(), "Jhb");
         Assert.assertNotEquals(locFly.getTotalCapacity(), 200);
         Assert.assertNotEquals(locFly.getSeatsAvailable(), 60);
        
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
