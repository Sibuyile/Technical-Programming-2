/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.Mediator.AmericanSeller;
import com.sibu.designpatterns.behavioral.Mediator.Buyer;
import com.sibu.designpatterns.behavioral.Mediator.DollarConverter;
import com.sibu.designpatterns.behavioral.Mediator.FrenchBuyer;
import com.sibu.designpatterns.behavioral.Mediator.Mediator;
import com.sibu.designpatterns.behavioral.Mediator.SwedishBuyer;
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
public class MediatorTest {
    
    public MediatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
      Mediator mediator = new Mediator();

        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollars = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);

        float swedishBidInKronor = 55.0f;
        while (!swedishBuyer.attemptToPurchase(swedishBidInKronor)) {
                swedishBidInKronor += 15.0f;
        }

        float frenchBidInEuros = 3.0f;
        while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) {
                frenchBidInEuros += 1.5f;
        }
     
     
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
