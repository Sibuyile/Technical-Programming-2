/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.Reservation;
import com.sibu.immuteclass.service.crud.ReservationCrud;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
    
    @Mock
     ReservationCrud rc;       
    
  //  public ReservationTest() {
  //  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /*@Test
    // public void hello() {}
     public static void ReservationTest() throws Exception
     {
         Reservation res = new Reservation.Builder("100").NoOfSeats("2").JourneyDate("9 March 2014").build();
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
         
     }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

     @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        rc = Mockito.mock(ReservationCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void ReservationCreate() throws Exception
     {
      Reservation res = new Reservation.Builder("100").NoOfSeats("2").JourneyDate("9 March 2014").build();
       
        Reservation returnCf = rc.persist(res);
        when(rc.persist(res)).thenReturn(returnCf);
        Mockito.verify(rc).persist(res);

         
         /*Assert.assertEquals(100, cf.getReservationID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void ReservationRead() throws Exception {
        
      Reservation res = new Reservation.Builder("100").NoOfSeats("2").JourneyDate("9 March 2014").build();
       Reservation returnF = rc.find(res.getReservationID());
        when(rc.find(res.getReservationID())).thenReturn(returnF);
        Mockito.verify(rc).find(res.getReservationID());

    }
     
     @Test
     public void ReservationUpdate() throws Exception
     {
       Reservation res = new Reservation.Builder("100").NoOfSeats("2").JourneyDate("9 March 2014").build();
       
        Reservation fUpdate = new Reservation.Builder().reservation(res).NoOfSeats("5").build();
         
         Reservation returnCf = rc.merge(res);
        when(rc.merge(res)).thenReturn(returnCf);
        Mockito.verify(rc).merge(res);
      // Assert.assertEquals(110, pl.getListReservationsID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

        Reservation res = new Reservation.Builder("100").NoOfSeats("2").JourneyDate("9 March 2014").build();
       Reservation returnF = rc.remove(res);
        when(rc.remove(res)).thenReturn(returnF);
        Mockito.verify(rc).remove(res);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
