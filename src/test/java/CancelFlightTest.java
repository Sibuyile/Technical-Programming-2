/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sibu.immuteclass.model.CancelFlight;
import com.sibu.immuteclass.service.crud.CancelFlightCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class CancelFlightTest {
    
    @Mock
    CancelFlightCrudService canFlyt;
    
   // public CancelFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        canFlyt = Mockito.mock(CancelFlightCrudService.class);
        
    }
    
     @Test
    // public void hello() {}
     public void CancelFlightCreate() throws Exception
     {
         CancelFlight cf = new CancelFlight.Builder("100").cancel("false").build();
         
       
        CancelFlight returnCf = canFlyt.persist(cf);
        when(canFlyt.persist(cf)).thenReturn(returnCf);
        Mockito.verify(canFlyt).persist(cf);

         
         /*Assert.assertEquals(100, cf.getCancelFlightID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void CancelFlightRead() throws Exception {
        
        CancelFlight cf = new CancelFlight.Builder("110").cancel("false").build();
        CancelFlight returnCf = canFlyt.find(cf.getCancelFlightID());
        when(canFlyt.find(cf.getCancelFlightID())).thenReturn(returnCf);
        Mockito.verify(canFlyt).find(cf.getCancelFlightID());

    }
     
     @Test
     public void CancelFlightUpdate() throws Exception
     {
         CancelFlight cf = new CancelFlight.Builder("110").cancel("false").build();
         CancelFlight cfUpdate = new CancelFlight.Builder().clone(cf).cancel("true").build();
         
        
        CancelFlight returnCf = canFlyt.merge(cf);
        when(canFlyt.persist(cf)).thenReturn(returnCf);
        Mockito.verify(canFlyt).merge(cf);
         
        // Assert.assertEquals(110, cf.getCancelFlightID());
         //Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

         CancelFlight cf = new CancelFlight.Builder("110").cancel("false").build();
        CancelFlight returnCf = canFlyt.remove(cf);
        when(canFlyt.remove(cf)).thenReturn(returnCf);
        Mockito.verify(canFlyt).remove(cf);

    }
     
    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
