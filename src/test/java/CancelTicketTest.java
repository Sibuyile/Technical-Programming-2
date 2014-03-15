/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.CancelTicket;
import com.sibu.immuteclass.model.CancelTicket;
import com.sibu.immuteclass.service.crud.CancelTicketCrud;
import com.sibu.immuteclass.service.crud.CancelTicketCrud;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
//import junit.framework.Assert;
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
public class CancelTicketTest {
    
    @Mock
    CancelTicketCrud canTick;
    //public CancelTicketTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

     @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        canTick = Mockito.mock(CancelTicketCrud.class);
        
    }
    
    @Test
    // public void hello() {}
     public void CancelTicketCreate() throws Exception
     {
          CancelTicket ct = new CancelTicket.Builder("100").cancel("true").build();
         
       
        CancelTicket returnCf = canTick.persist(ct);
        when(canTick.persist(ct)).thenReturn(returnCf);
        Mockito.verify(canTick).persist(ct);

         
         /*Assert.assertEquals(100, ct.getCanceTicketID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(ct.getFlightID());*/
     }
      @Test
    public void testRead() throws Exception {
        
        CancelTicket ct = new CancelTicket.Builder("101").cancel("false").reservationID("10").build();
        CancelTicket returnCf = canTick.find(ct.getCancelTicketID());
        when(canTick.find(ct.getCancelTicketID())).thenReturn(returnCf);
        Mockito.verify(canTick).find(ct.getCancelTicketID());

    }
     
     @Test
     public void CanceTicketUpdate() throws Exception
     {
         CancelTicket ct = new CancelTicket.Builder("110").cancel("false").build();
         CancelTicket ctUpdate = new CancelTicket.Builder().clone(ct).cancel("true").build();
         
          CancelTicket returnF = canTick.merge(ct);
        when(canTick.merge(ct)).thenReturn(returnF);
        Mockito.verify(canTick).merge(ct);
         
      //  Assert.assertEquals(110, ct.getCancelTicketID());
        // Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

         CancelTicket ct = new CancelTicket.Builder("110").cancel("false").build();
        CancelTicket returnCt = canTick.remove(ct);
        when(canTick.remove(ct)).thenReturn(returnCt);
        Mockito.verify(canTick).remove(ct);

    }
    
     
    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
