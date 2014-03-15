/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.PrintTicket;
import com.sibu.immuteclass.service.crud.PrintTicketCrud;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class PrintTicketTest {
    
    @Mock
    PrintTicketCrud ptc;
    
  //  public PrintTicketTest() {
  //  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
    // public void hello() {}
     public static void printTest() throws Exception
     {
         PrintTicket pt = new PrintTicket.Builder(200).print("Printed ticket").build();
         Assert.assertEquals("Printed ticket", pt.getPrint());
     }
     
      @Test
    // public void hello() {}
     public static void printUpdate() throws Exception
     {
         PrintTicket pt = new PrintTicket.Builder("210").print("Reservation Details").build();
         Assert.assertEquals("Reservation Details", pt.getPrint());
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
        ptc = Mockito.mock(PrintTicketCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void PrintTicketCreate() throws Exception
     {
      PrintTicket pt = new PrintTicket.Builder("210").print("Reservation Details").build();   
       
        PrintTicket returnCf = ptc.persist(pt);
        when(ptc.persist(pt)).thenReturn(returnCf);
        Mockito.verify(ptc).persist(pt);

         
         /*Assert.assertEquals(100, cf.getPrintTicketID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void PrintTicketRead() throws Exception {
        
       PrintTicket pt = new PrintTicket.Builder("210").print("Reservation Details").build();
       PrintTicket returnF = ptc.find(pt.getPrintTicketID());
        when(ptc.find(pt.getPrintTicketID())).thenReturn(returnF);
        Mockito.verify(ptc).find(pt.getPrintTicketID());

    }
     
     @Test
     public void PrintTicketUpdate() throws Exception
     {
       PrintTicket pt = new PrintTicket.Builder("210").print("Reservation Details").build();
        PrintTicket fUpdate = new PrintTicket.Builder().printTicket(pt).print("Details").build();
         
         PrintTicket returnCf = ptc.merge(pt);
        when(ptc.merge(pt)).thenReturn(returnCf);
        Mockito.verify(ptc).merge(pt);
      // Assert.assertEquals(110, pl.getListPrintTicketsID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

       PrintTicket pt = new PrintTicket.Builder("210").print("Reservation Details").build();
       PrintTicket returnF = ptc.remove(pt);
        when(ptc.remove(pt)).thenReturn(returnF);
        Mockito.verify(ptc).remove(pt);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
