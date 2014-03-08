/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Flight.Status;
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
public class StatusTest {
    
   // public StatusTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void StatusTest()
     {
         Status s = new Status.Builder(100).Name("Business").Seats(2).Amount(1500.00).build();
         Assert.assertEquals(100, s.getStatusID());
         Assert.assertEquals("Business", s.getStatusName());
         Assert.assertEquals(2, s.getTotalSeatClass() );
         Assert.assertEquals(1500.00, s.getAmount());
         
     }
     
     @Test
   
     public static void StatusUpdate()
     {
         Status s = new Status.Builder(101).Name("Economy").Seats(3).Amount(1500.00).build();
         Assert.assertNotSame(100, s.getStatusID());
         Assert.assertNotSame("Business", s.getStatusName());
         Assert.assertNotSame(2, s.getTotalSeatClass() );
         Assert.assertNotSame(1500.00, s.getAmount());
        
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
