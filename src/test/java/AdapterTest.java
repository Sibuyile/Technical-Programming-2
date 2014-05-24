/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sibu.designpatterns.structural.Adapter.PassengerPayment;
import com.sibu.designpatterns.structural.Adapter.PaymentClassReporter;
import com.sibu.designpatterns.structural.Adapter.PaymentObjectReporter;
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
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
         PassengerPayment pp = new PaymentClassReporter();
         testPayment(pp);
         
         System.out.println("Payment object");
         pp = new PaymentObjectReporter();
         testPayment(pp);
         
     }
     
     
     public static void testPayment(PassengerPayment p)
     {
         p.setClassPrice(2);
         System.out.println("Business " + p.BusinessClassPrice());
       //  Assert.assertNotEquals(3000.0, p.BusinessClassPrice());
         System.out.println("Economy " + p.EconomyClassPrice());
         p.setFirstPrice(2);
         System.out.println("First class " + p.FirstClassPrice());
         
         
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
