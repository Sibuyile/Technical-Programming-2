/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.Status;
import com.sibu.immuteclass.service.crud.StatusCrud;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class StatusTest {
    
    @Mock
    StatusCrud status;
    
   // public StatusTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  /*   @Test
    // public void hello() {}
     public static void StatusTest()
     {
         Status s = new Status.Builder(100).Name("Business").Seats(2).Amount(1500.00).build();
         Assert.assertEquals(100, s.getStatusID());
         Assert.assertEquals("Business", s.getStatusName());
         Assert.assertEquals(2, s.getTotalSeatClass() );
         Assert.assertEquals(1500.00, s.getAmount());
         
     }
     
     @Test
   
     public static void StatusUpdate()
     {
         Status s = new Status.Builder(101).Name("Economy").Seats(3).Amount(1500.00).build();
         Assert.assertNotSame(100, s.getStatusID());
         Assert.assertNotSame("Business", s.getStatusName());
         Assert.assertNotSame(2, s.getTotalSeatClass() );
         Assert.assertNotSame(1500.00, s.getAmount());
        
     }*/
     

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        status = Mockito.mock(StatusCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void StatusCreate() throws Exception
     {
      Status s = new Status.Builder("101").Name("Economy").Seats("3").Amount("1500").build();
       
        Status returnCf = status.persist(s);
        when(status.persist(s)).thenReturn(returnCf);
        Mockito.verify(status).persist(s);

         
         /*Assert.assertEquals(100, cf.getStatusID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void StatusRead() throws Exception {
        
      Status s = new Status.Builder("101").Name("Economy").Seats("3").Amount("1500").build();
       Status returnF = status.find(s.getStatusID());
        when(status.find(s.getStatusID())).thenReturn(returnF);
        Mockito.verify(status).find(s.getStatusID());

    }
     
     @Test
     public void StatusUpdate() throws Exception
     {
      Status s = new Status.Builder("101").Name("Economy").Seats("3").Amount("1500").build();
       Status fUpdate = new Status.Builder().status(s).Seats("4").Amount("2500").build();
         
         Status returnCf = status.merge(s);
        when(status.merge(s)).thenReturn(returnCf);
        Mockito.verify(status).merge(s);
      // Assert.assertEquals(110, pl.getListStatussID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

      Status s = new Status.Builder("101").Name("Economy").Seats("3").Amount("1500").build();
       Status returnF = status.remove(s);
        when(status.remove(s)).thenReturn(returnF);
        Mockito.verify(status).remove(s);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
