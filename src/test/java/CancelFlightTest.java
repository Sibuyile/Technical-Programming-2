/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sibu.immuteclass.service.Impl.Cancel.CancelFlight;
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
public class CancelFlightTest {
    
   // public CancelFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void CancelFlightTest() throws Exception
     {
         CancelFlight cf = new CancelFlight.Builder(100).cancel(true).build();
         Assert.assertEquals(100, cf.getCancelFlightID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());
     }
     
     @Test
     public static void CancelFlightUpdate() throws Exception
     {
         CancelFlight cf = new CancelFlight.Builder(110).cancel(false).build();
         Assert.assertEquals(110, cf.getCancelFlightID());
         Assert.assertFalse(false);
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
