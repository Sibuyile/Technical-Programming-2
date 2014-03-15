/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sibu.immuteclass.model.FlightCapacity;
import com.sibu.immuteclass.service.crud.FlightCapacityCrud;
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
public class FlightCapacityTest {
    
    @Mock
    FlightCapacityCrud flyCap;
    
   // public FlightCapacityTest() {
  //  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     /*@Test
    // public void hello() {}
     public static void FlightCapacityTest() throws Exception
     {
          FlightCapacity fc = new FlightCapacity.Builder("101").business("3500").economy("1500").first("2600").build();
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
          FlightCapacity fc = new FlightCapacity.Builder("101").business("3500").economy("1500").first("2600").build();
          Assert.assertNotEquals(fc.getBusiness(), 3500);
         Assert.assertNotEquals(fc.getEconomy(), 1500);
         Assert.assertNotEquals(fc.getFirst(), 2600);
         Assert.assertNotEquals(fc.getFlightCapacityID(), 101);
         
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
        flyCap = Mockito.mock(FlightCapacityCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void FlightCapacityCreate() throws Exception
     {
         FlightCapacity fc = new FlightCapacity.Builder("101").business("3500").economy("1500").first("2600").build();
      
         
       
        FlightCapacity returnCf = flyCap.persist(fc);
        when(flyCap.persist(fc)).thenReturn(returnCf);
        Mockito.verify(flyCap).persist(fc);

         
         /*Assert.assertEquals(100, fc.getFlightCapacityID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(fc.getFlightID());*/
     }
     
      @Test
    public void testRead() throws Exception {
        
         FlightCapacity fc = new FlightCapacity.Builder("101").business("3500").economy("1500").first("2600").build();
        FlightCapacity returnFc = flyCap.find(fc.getFlightCapacityID());
        when(flyCap.find(fc.getFlightCapacityID())).thenReturn(returnFc);
        Mockito.verify(flyCap).find(fc.getFlightCapacityID());

    }
     
     @Test
     public void FlightCapacityUpdate() throws Exception
     {
          FlightCapacity fc = new FlightCapacity.Builder("101").business("3500").economy("1500").first("2600").build();
          FlightCapacity fcUpdate = new FlightCapacity.Builder().business("4500").build();
         
         FlightCapacity returnCf = flyCap.merge(fc);
        when(flyCap.merge(fc)).thenReturn(returnCf);
        Mockito.verify(flyCap).merge(fc);
          
        // Assert.assertEquals(110, fc.getFlightCapacityID());
        // Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

          FlightCapacity fc = new FlightCapacity.Builder("101").business("3500").economy("1500").first("2600").build();
        FlightCapacity returnFc = flyCap.remove(fc);
        when(flyCap.remove(fc)).thenReturn(returnFc);
        Mockito.verify(flyCap).remove(fc);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
