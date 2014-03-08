/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sibu.immuteclass.service.Impl.Flight.FlightCapacity;
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
public class FlightCapacityTest {
    
   // public FlightCapacityTest() {
  //  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void FlightCapacityTest() throws Exception
     {
         FlightCapacity fc = new FlightCapacity.Builder(101).business(3500).economy(1500).first(2600).build();
        // Assert.assertEquals(fc.flightID(), 100);
         Assert.assertEquals(fc.getBusiness(), 3500);
         Assert.assertEquals(fc.getEconomy(), 1500);
         Assert.assertEquals(fc.getFirst(), 2600);
         Assert.assertEquals(fc.getFlightCapacityID(), 101);
         
     }
     
     @Test
    // public void hello() {}
     public static void FlightCapacityUpdate() throws Exception
     {
         FlightCapacity fc = new FlightCapacity.Builder(102).business(2700).economy(1100).first(2200).build();
          Assert.assertNotEquals(fc.getBusiness(), 3500);
         Assert.assertNotEquals(fc.getEconomy(), 1500);
         Assert.assertNotEquals(fc.getFirst(), 2600);
         Assert.assertNotEquals(fc.getFlightCapacityID(), 101);
         
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
