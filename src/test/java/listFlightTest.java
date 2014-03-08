/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.FlightTickets.ListOfFlights;
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
public class listFlightTest {
    
  // public listFlightTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public void ListFlightTest() throws Exception
     {
         ListOfFlights lf = new ListOfFlights.Builder(100).build();
         Assert.assertEquals(100, lf.getListID());
         
     }
     
     @Test
     public void ListFlightTestUpdate() throws Exception
     {
         ListOfFlights lf = new ListOfFlights.Builder(100).build();
         Assert.assertNotSame(lf.getListID(), 101);
         
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
