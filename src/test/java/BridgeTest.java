/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.structural.Bridge.BigBus;
import com.sibu.designpatterns.structural.Bridge.BigEngine;
import com.sibu.designpatterns.structural.Bridge.SmallCar;
import com.sibu.designpatterns.structural.Bridge.SmallEngine;
import com.sibu.designpatterns.structural.Bridge.Vehicle;
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
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
         Vehicle vehicle = new BigBus(new SmallEngine());
         vehicle.drive();
         vehicle.setEngine(new BigEngine());
         vehicle.drive();
         
         vehicle = new SmallCar(new SmallEngine());
         vehicle.drive();
         vehicle.setEngine(new BigEngine());
         vehicle.drive();
         
        
     
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
