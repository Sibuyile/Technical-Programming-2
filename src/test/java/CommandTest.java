/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.Command.Command;
import com.sibu.designpatterns.behavioral.Command.Dinner;
import com.sibu.designpatterns.behavioral.Command.DinnerCommand;
import com.sibu.designpatterns.behavioral.Command.Lunch;
import com.sibu.designpatterns.behavioral.Command.LunchCommand;
import com.sibu.designpatterns.behavioral.Command.MealInvoker;
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
public class CommandTest {
    
    public CommandTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
      Lunch lunch = new Lunch(); 
        Command lunchCommand = new LunchCommand(lunch); 

        Dinner dinner = new Dinner(); 
        Command dinnerCommand = new DinnerCommand(dinner); 

        MealInvoker mealInvoker = new MealInvoker(lunchCommand); 
        mealInvoker.invoke();

        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
     
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
