/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.State.HappyState;
import com.sibu.designpatterns.behavioral.State.Person;
import com.sibu.designpatterns.behavioral.State.SadState;
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
public class StateTest {
    
    public StateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
     Person person = new Person(new HappyState());
        System.out.println("Hello in happy state: " + person.sayHello());
        System.out.println("Goodbye in happy state: " + person.sayGoodbye());

        person.setEmotionalState(new SadState());
        System.out.println("Hello in sad state: " + person.sayHello());
        System.out.println("Goodbye in sad state: " + person.sayGoodbye());
     
     
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
