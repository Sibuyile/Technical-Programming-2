/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.service.Impl.Passenger.Payment;
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
public class PaymentTest {
    
  //  public PaymentTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public static void PaymentTest() throws Exception
     {
         Payment pay = new Payment.Builder(120).payMentDate("8 March 2014").paymentAmt(2500.00).build();
         Assert.assertEquals(pay.getPaymentDate(), "8 March 2014");
         Assert.assertEquals(pay.getPaidAmount(), 2500.00);
     }
     
     @Test
    // public void hello() {}
     public static void PaymentUpdate() throws Exception
     {
         Payment pay = new Payment.Builder(122).payMentDate("9 March 2014").paymentAmt(2590.00).build();
          Assert.assertNotSame(pay.getPaymentDate(), "8 March 2014");
         Assert.assertNotSame(pay.getPaidAmount(), 2500.00);
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
