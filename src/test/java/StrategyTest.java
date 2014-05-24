/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.Strategy.Context;
import com.sibu.designpatterns.behavioral.Strategy.HikeStrategy;
import com.sibu.designpatterns.behavioral.Strategy.SkiStrategy;
import com.sibu.designpatterns.behavioral.Strategy.Strategy;
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
public class StrategyTest {
    
    public StrategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
     int temperatureInF = 60;

        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);

        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());

        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);

        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());
   
     
     
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
