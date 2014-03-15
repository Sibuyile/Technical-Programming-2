/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.Flight;
import com.sibu.immuteclass.service.crud.FlightCrudService;
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
public class FlightTest {
    @Mock
    FlightCrudService flyt;
    
  //  public FlightTest() {
 //   }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
    // public void hello() {}
     
     public static void flightTest()
     {
         
         Flight f = new Flight.Builder("100").flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity("50").seatsAvailable("20").build();
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
        flyt = Mockito.mock(FlightCrudService.class);
        
    }
    
     @Test
    // public void hello() {}
     public void FlightCreate() throws Exception
     {
          Flight f = new Flight.Builder("100").flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity("50").seatsAvailable("20").build();
        
         
       
        Flight returnCf = flyt.persist(f);
        when(flyt.persist(f)).thenReturn(returnCf);
        Mockito.verify(flyt).persist(f);

         
         /*Assert.assertEquals(100, cf.getFlightDaysID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightDaysID());*/
     }
     
      @Test
    public void FlightRead() throws Exception {
        
        Flight f = new Flight.Builder("100").flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity("50").seatsAvailable("20").build();
        
        Flight returnF = flyt.find(f.getFlightID());
        when(flyt.find(f.getFlightID())).thenReturn(returnF);
        Mockito.verify(flyt).find(f.getFlightID());

    }
     
     @Test
     public void FlightUpdate() throws Exception
     {
         Flight f = new Flight.Builder("100").flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity("50").seatsAvailable("20").build();
         Flight fUpdate = new Flight.Builder().clone(f).flightName("Airlink").arriveCity("Dbn").build();
         
         Flight returnCf = flyt.merge(f);
        when(flyt.persist(f)).thenReturn(returnCf);
        Mockito.verify(flyt).merge(f);
   
      //   Assert.assertEquals(110, f.getFlightDaysID());
       //  Assert.assertFalse(false);
     }
     
      @Test
    public void FlightDelete() throws Exception {

          Flight f = new Flight.Builder("100").flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity("50").seatsAvailable("20").build();
        
        Flight returnF = flyt.remove(f);
        when(flyt.remove(f)).thenReturn(returnF);
        Mockito.verify(flyt).remove(f);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
