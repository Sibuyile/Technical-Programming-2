/*
 * To change this license header, choose License Headers in Projefa Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.FlightAttendant;
import com.sibu.immuteclass.model.FlightAttendant;
import com.sibu.immuteclass.service.crud.FlightAttendantCrud;
import com.sibu.immuteclass.service.crud.FlightAttendantCrud;
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
public class FlightAttendantTest {
    
    @Mock
    FlightAttendantCrud flyAtt;
    
   // public FlightAttendantTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     
    /* @Test
    // public void hello() {}
     public static void FlightAttendantTest1()
     {
         FlightAttendant fa = new FlightAttendant.Builder(110).build();
         Assert.assertEquals(fa.getFlightAttendantID(), 110);
         Assert.assertEquals(fa.name(), "Sese");
         Assert.assertEquals(fa.dob(), "4 April 1991");
         Assert.assertEquals(fa.address(), "52 Swallow Drive");
         Assert.assertEquals(fa.phoneNo(), "0436422032");
         Assert.assertEquals(fa.email(), "sesem0341@gmail.com");
         
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
        flyAtt = Mockito.mock(FlightAttendantCrud.class);
        
    }

    @Test
    // public void hello() {}
     public void FlightAttendantCreate() throws Exception
     {
          FlightAttendant fa = new FlightAttendant.Builder("110").build();
         
       
        FlightAttendant returnCf = flyAtt.persist(fa);
        when(flyAtt.persist(fa)).thenReturn(returnCf);
        Mockito.verify(flyAtt).persist(fa);

         
         /*Assert.assertEquals(100, fa.getCanceTicketID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(fa.getFlightID());*/
     }
      @Test
    public void FlightAttendantRead() throws Exception {
        
       FlightAttendant fa = new FlightAttendant.Builder("110").build();
        FlightAttendant returnFa = flyAtt.find(fa.getFlightAttendantID());
        when(flyAtt.find(fa.getFlightAttendantID())).thenReturn(returnFa);
        Mockito.verify(flyAtt).find(fa.getFlightAttendantID());

    }
     
     @Test
     public void FlightAttendantUpdate() throws Exception
     {
         FlightAttendant fa = new FlightAttendant.Builder("110").build();
         FlightAttendant fUpdate = new FlightAttendant.Builder().flightAttendant(fa).build();
         
         FlightAttendant returnCf = flyAtt.merge(fa);
        when(flyAtt.merge(fa)).thenReturn(returnCf);
        Mockito.verify(flyAtt).merge(fa);
         
       //  Assert.assertEquals(110, fa.getFlightAttendantID());
        // Assert.assertFalse(false);
     }
     
      @Test
    public void FlightAttendantDelete() throws Exception {

         FlightAttendant fa = new FlightAttendant.Builder("110").build();
        FlightAttendant returnFa = flyAtt.remove(fa);
        when(flyAtt.remove(fa)).thenReturn(returnFa);
        Mockito.verify(flyAtt).remove(fa);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
