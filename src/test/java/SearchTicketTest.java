/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.FlightTickets.SearchTicket;
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
public class SearchTicketTest {
    
    public SearchTicketTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
   
     public static void SearchTicketTest()
     {
         SearchTicket st = new SearchTicket.Builder(100).search(true).build();
        // Flight f = sf.flightID();
         Assert.assertEquals(st.getSearchID(), 100);
       Assert.assertTrue(true);
     }
     
     @Test
     public static void searchUpate()
     {
          SearchTicket st = new SearchTicket.Builder(101).search(true).build();
         
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
