/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.creational.Builder.Adult;
import com.sibu.designpatterns.creational.Builder.ChildBuilder;
import com.sibu.designpatterns.creational.Builder.Passenger;
import com.sibu.designpatterns.creational.Builder.PassengerBuilder;
import com.sibu.designpatterns.creational.Builder.PassengerList;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public void BuilTest()
     {
         
         PassengerBuilder p = new Adult();
         PassengerList pl = new PassengerList(p);
         pl.PassengerConstructor();
         Passenger ps = pl.getPass();
         System.out.println("Passenger is " + ps);
         
         p = new ChildBuilder();
         pl = new PassengerList(p);
         pl.PassengerConstructor();
         ps = pl.getPass();
         System.out.println("Passenger is " + ps);
         
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
