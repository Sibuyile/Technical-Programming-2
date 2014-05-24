/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.ChainOfResponsibility.EarthHandler;
import com.sibu.designpatterns.behavioral.ChainOfResponsibility.MercuryHandler;
import com.sibu.designpatterns.behavioral.ChainOfResponsibility.PlanetEnum;
import com.sibu.designpatterns.behavioral.ChainOfResponsibility.PlanetHandler;
import com.sibu.designpatterns.behavioral.ChainOfResponsibility.VenusHandler;
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
public class ChainOfResponsibilityTest {
    
    public ChainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
        PlanetHandler chain = setUpChain();

        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);
	
    }
    
    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
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
