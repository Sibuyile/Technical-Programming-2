/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibuyile.assignment2;

import com.sibuyile.assignment2.config.AppConfig;
import com.sibuyile.assignment2.service.AssignmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class MemberDetails {
    
    private AssignmentService as;
    
    public MemberDetails() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     
     public void memberDetails()
    {
        String members = new String();
        members = as.memberDatails();
        
        Assert.assertEquals(members, "Sibuyile" + "Mdladlana" + "Cape Town" + 2010 + 550.00, "Member does not exist");
        
      // Fails
       // Assert.assertEquals(members, "Sibu" + "Mdla" + "CPT" + 2010 + 550.00, "Member does not exist");
            
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
         ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        as = (AssignmentService)ac.getBean("Hiking");    
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
