/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.creational.Factory.AgeFactory;
import com.sibu.designpatterns.creational.Factory.AgeType;
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
public class FactoryTest {
    
    public FactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public void factoryTest()
     {
         
         AgeFactory agef = new AgeFactory();
         
         AgeType infant = agef.getFactory(2);
         Assert.assertEquals("less than 3", infant.getAge());
         
         System.out.println("Age is:" + infant.getAge());
         
        // AgeType child = agef.getFactory(5);
         //Assert.assertEquals("over 10", child.getAge());
         
        // System.out.println("Age is:" + child.getAge());
         
         AgeType adult = agef.getFactory(25);
         Assert.assertEquals("over 10", adult.getAge());
         
         System.out.println("Age is:" + adult.getAge());
         
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
