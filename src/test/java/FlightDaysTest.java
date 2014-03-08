/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Flight.flightDays;
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
public class FlightDaysTest {
    
   // public FlightDaysTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void FlightDaysTest()
     {
         flightDays fd = new flightDays.Builder(100).Date("8 March 2014").DepartureCity("Jhb").ArriveCity("CPT").build();
         Assert.assertEquals(fd.getFlightDaysID(), 100);
         Assert.assertEquals(fd.getDate(), "8 March 2014");
         Assert.assertEquals(fd.getDepartureCity(), "Jhb");
         Assert.assertEquals(fd.getArriveCity(), "CPT");
        
         
     }
     
     @Test
     public static void FlightDaysUpdate()
     {
         flightDays fd = new flightDays.Builder(100).Date("8 March 2014").DepartureCity("Jhb").ArriveCity("CPT").build();
         Assert.assertNotEquals(fd.getFlightDaysID(), 110);
         Assert.assertNotEquals(fd.getDate(), "9 March 2014");
         Assert.assertNotEquals(fd.getDepartureCity(), "CPT");
         Assert.assertNotEquals(fd.getArriveCity(), "JHB");
         
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
