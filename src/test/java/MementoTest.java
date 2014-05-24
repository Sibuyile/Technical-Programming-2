/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.Memento.DietInfo;
import com.sibu.designpatterns.behavioral.Memento.DietInfoCaretaker;
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
public class MementoTest {
    
    public MementoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         
     DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();

        // originator
        DietInfo dietInfo = new DietInfo("Fred", 1, 100);
        System.out.println(dietInfo);

        dietInfo.setDayNumberAndWeight(2, 99);
        System.out.println(dietInfo);

        System.out.println("Saving state.");
        dietInfoCaretaker.saveState(dietInfo);

        dietInfo.setDayNumberAndWeight(3, 98);
        System.out.println(dietInfo);

        dietInfo.setDayNumberAndWeight(4, 97);
        System.out.println(dietInfo);

        System.out.println("Restoring saved state.");
        dietInfoCaretaker.restoreState(dietInfo);
        System.out.println(dietInfo);
     
     
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
