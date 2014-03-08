/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.FlightTickets.ListOfPassengers;
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
public class ListPassengerTest {
    
    //public ListPassengerTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void PassengerList() throws Exception
     {
         ListOfPassengers pl = new ListOfPassengers.Builder(111).build();
         Assert.assertEquals(pl.getListPassengersID(), 111);
         
         
         
         
     }
     
     @Test
    // public void hello() {}
     public static void PassengerListUpdate() throws Exception
     {
         ListOfPassengers pl = new ListOfPassengers.Builder(112).build();
          Assert.assertNotEquals(pl.getListPassengersID(), 111);
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
