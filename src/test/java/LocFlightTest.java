/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.LocalFlight;
import com.sibu.immuteclass.service.crud.LocalFlightCrud;
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
public class LocFlightTest {
    
    @Mock
    LocalFlightCrud locFlyt;
    
   // public LocFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
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
        locFlyt = Mockito.mock(LocalFlightCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void LocalFlightCreate() throws Exception
     {
          LocalFlight locFly = new LocalFlight.Builder("113").flightName("SAA").departureCity("Dbn").arriveCity("CPT").totalCapacity("150").seatsAvailable("50").build();
         
       
        LocalFlight returnCf = locFlyt.persist(locFly);
        when(locFlyt.persist(locFly)).thenReturn(returnCf);
        Mockito.verify(locFlyt).persist(locFly);

         
         /*Assert.assertEquals(100, cf.getLocalFlightID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void LocalFlightRead() throws Exception {
        
      LocalFlight locFly = new LocalFlight.Builder("113").flightName("SAA").departureCity("Dbn").arriveCity("CPT").totalCapacity("150").seatsAvailable("50").build();
        LocalFlight returnF = locFlyt.find(locFly.flightID());
        when(locFlyt.find(locFly.flightID())).thenReturn(returnF);
        Mockito.verify(locFlyt).find(locFly.flightID());

    }
     
     @Test
     public void LocalFlightUpdate() throws Exception
     {
          LocalFlight locFly = new LocalFlight.Builder("113").flightName("SAA").departureCity("Dbn").arriveCity("CPT").totalCapacity("150").seatsAvailable("50").build();
          LocalFlight fUpdate = new LocalFlight.Builder().local(locFly).flightName("British Airways").departureCity("Umtata").build();
         
         LocalFlight returnCf = locFlyt.merge(locFly);
        when(locFlyt.merge(locFly)).thenReturn(returnCf);
        Mockito.verify(locFlyt).merge(locFly);
   //      Assert.assertEquals(110, locFly.flightID());
     //    Assert.assertFalse(false);
     }
     
      @Test
    public void LocalFlightDelete() throws Exception {

        LocalFlight locFly = new LocalFlight.Builder("300").flightName("Birtish").departureCity("NewYork").arriveCity("Auckland").totalCapacity("500").seatsAvailable("150").build();
        
        LocalFlight returnF = locFlyt.remove(locFly);
        when(locFlyt.remove(locFly)).thenReturn(returnF);
        Mockito.verify(locFlyt).remove(locFly);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
