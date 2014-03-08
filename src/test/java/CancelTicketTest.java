/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Cancel.CancelTicket;
import junit.framework.Assert;
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
    
    //public CancelTicketTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void CancelTicketTest() throws Exception
     {
         CancelTicket ct = new CancelTicket.Builder(100).cancel(true).reservationID(110).build();
         Assert.assertEquals(100, ct.getCancelTicketID());
         Assert.assertTrue(true);
         Assert.assertEquals(110, ct.getReservationID());
     }
     
     @Test
     public static void CancelTicketUpdate() throws Exception
     {
         CancelTicket ct = new CancelTicket.Builder(101).cancel(false).reservationID(10).build();
         Assert.assertEquals(101, ct.getCancelTicketID());
         Assert.assertTrue(true);
         Assert.assertEquals(10, ct.getReservationID());
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
