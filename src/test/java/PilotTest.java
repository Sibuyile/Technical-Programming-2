/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.Pilot;
import com.sibu.immuteclass.service.crud.PilotCrud;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
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
public class PilotTest {
    
    @Mock
    PilotCrud pc;
    
   // public PilotTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   /*  @Test
    // public void hello() {}
     public static void PilotTest()
     {
       //  Flight f = new Flight.Builder(100).build();
         Pilot p = new Pilot.Builder("100").build();
        
       // Assert.assertEquals(p.flightID(), 101);
       //  Assert.assertSame(f.flightID(), p.flightID());
        
         Assert.assertEquals(p.getPilotID(), 100);
         Assert.assertEquals(p.name(), "Simthembile");
         Assert.assertEquals(p.dob(), "2 February 1990");
         Assert.assertEquals(p.email(), "ssmith@gmail.com");
         Assert.assertEquals(p.address(), "2636 Varha Road");
         Assert.assertEquals(p.phoneNo(), "043642294");
     }
     
     @Test
     public static void PilotUpdate()
     {
         Pilot p = new Pilot.Builder(101).build();
         
          Assert.assertNotSame(p.getPilotID(), 100);
         Assert.assertNotSame(p.name(), "Lubabalo");
         Assert.assertNotSame(p.dob(), "29 July 1985");
         Assert.assertNotSame(p.email(), "lmakh@gmail.com");
         Assert.assertNotSame(p.address(), "2636 Mabdalay Street");
         Assert.assertNotSame(p.phoneNo(), "0217589541");
     }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    // public void hello() {}
     public void PilotCreate() throws Exception
     {
          Pilot fa = new Pilot.Builder("110").build();
         
       
        Pilot returnCf = pc.persist(fa);
        when(pc.persist(fa)).thenReturn(returnCf);
        Mockito.verify(pc).persist(fa);

         
         /*Assert.assertEquals(100, fa.getCanceTicketID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(fa.getFlightID());*/
     }
      @Test
    public void PilotRead() throws Exception {
        
       Pilot fa = new Pilot.Builder("110").build();
        Pilot returnFa = pc.find(fa.getPilotID());
        when(pc.find(fa.getPilotID())).thenReturn(returnFa);
        Mockito.verify(pc).find(fa.getPilotID());

    }
     
     @Test
     public void PilotUpdate() throws Exception
     {
         Pilot fa = new Pilot.Builder("110").build();
          Pilot fUpdate = new Pilot.Builder().pilot(fa).build();
         
         Pilot returnCf = pc.merge(fa);
        when(pc.merge(fa)).thenReturn(returnCf);
        Mockito.verify(pc).merge(fa);
       //  Assert.assertEquals(110, fa.getPilotID());
        // Assert.assertFalse(false);
     }
     
      @Test
    public void PilotDelete() throws Exception {

         Pilot pi = new Pilot.Builder("110").build();
        Pilot returnFa = pc.remove(pi);
        when(pc.remove(pi)).thenReturn(returnFa);
        Mockito.verify(pc).remove(pi);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
