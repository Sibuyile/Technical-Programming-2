/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.structural.Flyweight.Flyweight;
import com.sibu.designpatterns.structural.Flyweight.FlyweightFactory;
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
public class FlyweightTest {
    
    public FlyweightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
         FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
         
         for(int i = 0; i < 5; i++)
         {
             Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
             flyweightAdder.doMath(i, i);
            // Assert.assertNotNull(flyweightAdder.doMath(i, i));
             
             Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
             flyweightMultiplier.doMath(i, i);
             
             
         }
         Assert.assertNotNull(flyweightFactory.getFlyweight(null));
         
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
