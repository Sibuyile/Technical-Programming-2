/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.Payment;
import com.sibu.immuteclass.service.crud.PaymentCrud;
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
public class PaymentTest {
    
    @Mock
    PaymentCrud pay;
    
  //  public PaymentTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   /*  @Test
    // public void hello() {}
     public static void PaymentTest() throws Exception
     {
         Payment pay = new Payment.Builder("120").payMentDate("8 March 2014").paymentAmt("2500").build();
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
        pay = Mockito.mock(PaymentCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void PaymentCreate() throws Exception
     {
       Payment p = new Payment.Builder("120").paymentDate("8 March 2014").paidAmount("2500").build();
         
       
        Payment returnCf = pay.persist(p);
        when(pay.persist(p)).thenReturn(returnCf);
        Mockito.verify(pay).persist(p);

         
         /*Assert.assertEquals(100, cf.getPaymentID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void PaymentRead() throws Exception {
        
       Payment p = new Payment.Builder("120").paymentDate("8 March 2014").paidAmount("2500").build();
        Payment returnF = pay.find(p.getPaymentID());
        when(pay.find(p.getPaymentID())).thenReturn(returnF);
        Mockito.verify(pay).find(p.getPaymentID());

    }
     
     @Test
     public void PaymentUpdate() throws Exception
     {
        Payment p = new Payment.Builder("120").paymentDate("8 March 2014").paidAmount("2500").build();
         Payment fUpdate = new Payment.Builder().payment(p).paidAmount("3600").build();
         
         Payment returnCf = pay.merge(p);
        when(pay.merge(p)).thenReturn(returnCf);
        Mockito.verify(pay).merge(p);
//         Assert.assertEquals(110, pl.getListPaymentsID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void PaymentDelete() throws Exception {

      Payment p = new Payment.Builder("120").paymentDate("8 March 2014").paidAmount("3600").build();
        Payment returnF = pay.remove(p);
        when(pay.remove(p)).thenReturn(returnF);
        Mockito.verify(pay).remove(p);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
