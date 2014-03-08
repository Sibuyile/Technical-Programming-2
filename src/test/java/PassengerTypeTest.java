/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Passenger.PassengerType;
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
public class PassengerTypeTest {
    
   // public PassengerTypeTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void PassengerTypeTest() throws Exception
     {
         PassengerType pt = new PassengerType.Builder(100).adult(25).child(6).infant(1).build();
         Assert.assertEquals(25, pt.getAdult());
         Assert.assertEquals(6, pt.getChild());
         Assert.assertEquals(1, pt.getInfant());
     }
     
      @Test
    // public void hello() {}
     public static void PassengerTypeUpdate() throws Exception
     {
         PassengerType pt = new PassengerType.Builder(100).adult(45).child(10).infant(2).build();
         Assert.assertNotSame(25, pt.getAdult());
         Assert.assertNotSame(6, pt.getChild());
         Assert.assertNotSame(1, pt.getInfant());
     
         
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
