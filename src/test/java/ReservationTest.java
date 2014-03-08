/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Passenger.Reservation;
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
public class ReservationTest {
    
  //  public ReservationTest() {
  //  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void ReservationTest() throws Exception
     {
         Reservation res = new Reservation.Builder(100).NoOfSeats(2).JourneyDate("9 March 2014").build();
         Assert.assertEquals(res.getNoOfSeats(), 2);
         Assert.assertEquals(res.getJourneyDate(), "9 March 2014");
     }
     
      @Test
    // public void hello() {}
     public static void ReservationUpdate() throws Exception
     {
         Reservation res = new Reservation.Builder(101).NoOfSeats(3).JourneyDate("11 March 2014").build();
         Assert.assertNotEquals(res.getNoOfSeats(), 2);
         Assert.assertNotEquals(res.getJourneyDate(), "9 March 2014");
         
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
