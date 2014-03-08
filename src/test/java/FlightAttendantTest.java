/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.CabinCrew.FlightAttendant;
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
    
   // public FlightAttendantTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void FlightAttendantTest()
     {
         FlightAttendant fa = new FlightAttendant.Builder(100).build();
         Assert.assertEquals(fa.getFlightAttendantID(), 100);
         Assert.assertEquals(fa.name(), "Sibu");
         Assert.assertEquals(fa.dob(), "17 April 1991");
         Assert.assertEquals(fa.address(), "50 Swallow Drive");
         Assert.assertEquals(fa.phoneNo(), "0436422866");
         Assert.assertEquals(fa.email(), "sibum0341@gmail.com");
         
     }
     
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
     @Test
    // public void hello() {}
     public static void FlightAttendantUpdate()
     {
         FlightAttendant fa = new FlightAttendant.Builder(101).build();
          Assert.assertEquals(fa.getFlightAttendantID(), 101);
         Assert.assertNotEquals(fa.name(), "Sibuyile");
         Assert.assertNotEquals(fa.dob(), "18 April 1990");
         Assert.assertNotEquals(fa.address(), "5 Maluti Drive");
         Assert.assertNotEquals(fa.phoneNo(), "0436422032");
         Assert.assertNotEquals(fa.email(), "sesem0341@gmail.com");
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
