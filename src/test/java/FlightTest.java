/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Flight.Flight;
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
public class FlightTest {
    
  //  public FlightTest() {
 //   }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     
     public static void flightTest()
     {
         
         Flight f = new Flight.Builder(100).flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity(50).seatsAvailable(20).build();
         Assert.assertSame(f.flightID(), 100);
         Assert.assertEquals(f.getFlightName(), "SAA");
         Assert.assertEquals(f.getDepartureCity(), "CPT");
         Assert.assertEquals(f.getArriveCity(), "PE");
         Assert.assertEquals(f.getTotalCapacity(), 50);
         Assert.assertEquals(f.getSeatsAvailable(), 20);
        Assert.assertEquals(f.flightID(), 100);
        
        
         
         
     }
     
     @Test
    // public void hello() {}
     
     public static void flightUpdate()
     {
         
         Flight f = new Flight.Builder(100).flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity(50).seatsAvailable(20).build();
         Assert.assertSame(f.flightID(), 100);
         Assert.assertNotEquals(f.getFlightName(), "Khulula");
         Assert.assertNotEquals(f.getDepartureCity(), "PE");
         Assert.assertNotEquals(f.getArriveCity(), "CPT");
         Assert.assertNotEquals(f.getTotalCapacity(), 600);
         Assert.assertNotEquals(f.getSeatsAvailable(), 50);
        
        
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
