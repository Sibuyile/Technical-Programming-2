/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.FlightTickets.PrintTicket;
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
public class PrintTicketTest {
    
  //  public PrintTicketTest() {
  //  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
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
         PrintTicket pt = new PrintTicket.Builder(210).print("Reservation Details").build();
         Assert.assertEquals("Reservation Details", pt.getPrint());
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
