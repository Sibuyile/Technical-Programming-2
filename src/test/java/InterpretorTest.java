/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.Interpretor.AndExpression;
import com.sibu.designpatterns.behavioral.Interpretor.Expression;
import com.sibu.designpatterns.behavioral.Interpretor.OrExpression;
import com.sibu.designpatterns.behavioral.Interpretor.TerminalExpression;
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
public class InterpretorTest {
    
    public InterpretorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public Expression buildInterpreterTree() 
    {
        // Literal
        Expression terminal1 = new TerminalExpression("John");
        Expression terminal2 = new TerminalExpression("Henry");
        Expression terminal3 = new TerminalExpression("Mary");
        Expression terminal4 = new TerminalExpression("Owen");

        // Henry or Mary
        Expression alternation1 = new OrExpression(terminal2, terminal3); 

        // John or (Henry or Mary)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        // Owen and (John or (Henry or Mary))
        return new AndExpression(terminal4, alternation2);
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
