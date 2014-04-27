/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.test.repository;

import com.sibu.flightsystemweb.repository.FlightRepository;
import org.springframework.context.ApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author stud
 */
public class FlightRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;

  private FlightRepository rep;
    
    public FlightRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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

/* 

package com.sibu.flightsystemweb.test.respository;

import com.sibu.flightsystemweb.app.conf.ConnectionConfig;
import com.sibu.flightsystemweb.domain.Flight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FlightRepositoryTest {
    
     public static ApplicationContext ctx;
    private Long id;

  private FlightRepository rep;
    
    public FlightRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     
     public void createFlight()
     {
         flyRepo = ctx.getBean(FlightRepository.class);
     
          Flight f = new Flight.Builder("100").flightName("SAA").departureCity("CPT").arriveCity("PE").totalCapacity("50").seatsAvailable("20").build();
        
         flyRepo.save(f);
         id = f.getId();
         Assert.assertNotNull(f);
         
      //   repo.save(p);
      //   id = p.getId();
      //   Assert.assertNotNull(p);
         
     }

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
/*
    public void createPerson() {
         repo = ctx.getBean(PersonRepository.class);
         Person p = new Person.Builder("kabasob@cput.ac.za")
                 .firstname("B")
                 .lastnaname("K")
                 .build();
         repo.save(p);
         id = p.getId();
         Assert.assertNotNull(p);
         
     
     }
     
     @Test(dependsOnMethods = "createPerson")
     public void readPerson(){
         repo = ctx.getBean(PersonRepository.class);
         Person person = repo.findOne(id);
         Assert.assertEquals(person.getFirstname(), "B");
         
     }
     
    @Test(dependsOnMethods = "readPerson")
     private void updatePerson(){
         repo = ctx.getBean(PersonRepository.class);
         Person person = repo.findOne(id);
         Person updatedPerson = new Person.Builder("kabasob@cput.ac.za")
                 .person(person)
                 .firstname("Boniface")
                 .build();
        
         repo.save(updatedPerson);
         
         Person newPerson = repo.findOne(id);
         Assert.assertEquals(newPerson.getFirstname(), "Boniface");
         
     }
     
     @Test(dependsOnMethods = "updatePerson")
     private void deletePerson(){
         repo = ctx.getBean(PersonRepository.class);
         Person person = repo.findOne(id);
         repo.delete(person);
         
         Person deletedPerson = repo.findOne(id);
         
         Assert.assertNull(deletedPerson);
         
         
     }
*/
