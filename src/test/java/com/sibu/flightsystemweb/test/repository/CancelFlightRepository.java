/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.test.repository;


import com.sibu.flightsystemweb.app.conf.ConnectionConfig;
import com.sibu.flightsystemweb.domain.CancelFlight;
import com.sibu.flightsystemweb.repository.FlightRepository;
import com.sibu.flightsystemweb.repository.TicketRepository;
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
public class CancelFlightRepository {
    
    
       public static ApplicationContext ctx;
    private Long id;

  private CancelFlight canFlytRepo;
    
    
    public CancelFlightRepository() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   //  @Test
    // public void hello() {}
    
        // public void hello() {}
   /*  public void CancelFlightCreate() throws Exception
     {
         canFlytRepo = ctx.getBean(CancelFlight.class);
     
          CancelFlight cf = new CancelFlight.Builder("100").cancel("true").build();
         canFlytRepo.save(cf);
         id = cf.getId();
         Assert.assertTrue(true);
         /*Assert.assertEquals(100, cf.getCancelFlightID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/

     
   /*  @Test
    public void CancelFlightRead() throws Exception {
        
       
          canFlytRepo = ctx.getBean(CancelFlight.class);
         CancelFlight cf = canFlytRepo.findOne(id);
         Assert.assertEquals(cf.getCancelFlightID(), "100");

    }
     
     @Test
     public void CancelFlightUpdate() throws Exception
     {
      
          canFlytRepo = ctx.getBean(CancelFlight.class);
         CancelFlight cf = canFlytRepo.findOne(id);
         CancelFlight updatedFlight = new CancelFlight.Builder("true")
                 .cancelFlight(cf)
                 .build();
        
         canFlytRepo.save(updatedFlight);
         
         CancelFlight newPilot = canFlytRepo.findOne(id);
         Assert.assertEquals(newPilot.getCancelFlightID(), "110");
     }
     
      @Test
    public void testDelete() throws Exception {

        canFlytRepo = ctx.getBean(CancelFlight.class);
         CancelFlight cf = canFlytRepo.findOne(id);
         canFlytRepo.delete(cf);
         
         CancelFlight deletedFlight = canFlytRepo.findOne(id);
         
         Assert.assertNull(deletedFlight);
    }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
        
          ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
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
