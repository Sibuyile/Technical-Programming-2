/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.InternationalFlight;
import com.sibu.immuteclass.service.crud.InternationalFlightCrud;
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
public class IntFlightTest {
    
    @Mock
    InternationalFlightCrud intFlyt;
    
   // public IntFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
    // public void hello() {}
     public static void InternationalTest() throws Exception
     {
         InternationalFlight intFly = new InternationalFlight.Builder("300").flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
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
         InternationalFlight intFly = new InternationalFlight.Builder("300").flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
         Assert.assertNotSame("Birtish", intFly.getFlightName());
         Assert.assertNotSame("NewYork", intFly.getDepartureCity());
         Assert.assertNotSame("Auckland", intFly.getArriveCity());
         Assert.assertNotSame(500, intFly.getTotalCapacity());
         Assert.assertNotSame(150, intFly.getSeatsAvailable());
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
        intFlyt = Mockito.mock(InternationalFlightCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void InternationalFlightCreate() throws Exception
     {
          InternationalFlight intFly = new InternationalFlight.Builder("300").flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
         
       
        InternationalFlight returnCf = intFlyt.persist(intFly);
        when(intFlyt.persist(intFly)).thenReturn(returnCf);
        Mockito.verify(intFlyt).persist(intFly);

         
         /*Assert.assertEquals(100, cf.getInternationalFlightID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void InternationalFlightRead() throws Exception {
        
        InternationalFlight intFly = new InternationalFlight.Builder("300").flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
        InternationalFlight returnF = intFlyt.find(intFly.flightID());
        when(intFlyt.find(intFly.flightID())).thenReturn(returnF);
        Mockito.verify(intFlyt).find(intFly.flightID());

    }
     
     @Test
     public void InternationalFlightUpdate() throws Exception
     {
          InternationalFlight intFly = new InternationalFlight.Builder("300").flightName("Birtish").
                  departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
          InternationalFlight fUpdate = new InternationalFlight.Builder().internationalFlight(intFly).flightName("Airlink").arriveCity("Aubi Dabi").build();
         
         InternationalFlight returnCf = intFlyt.merge(intFly);
        when(intFlyt.merge(intFly)).thenReturn(returnCf);
        Mockito.verify(intFlyt).merge(intFly);
   //      Assert.assertEquals(110, intFly.flightID());
     //    Assert.assertFalse(false);
     }
     
      @Test
    public void InternationalFlightDelete() throws Exception {

        InternationalFlight intFly = new InternationalFlight.Builder("300").flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
        InternationalFlight returnF = intFlyt.remove(intFly);
        when(intFlyt.remove(intFly)).thenReturn(returnF);
        Mockito.verify(intFlyt).remove(intFly);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
