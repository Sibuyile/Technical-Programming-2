/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.ListOfFlights;
import com.sibu.immuteclass.service.crud.ListOfFlightsCrud;
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
public class ListFlightTest {
    
    @Mock
    ListOfFlightsCrud lfc;
    
  // public ListFlightTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   /*  @Test
    // public void hello() {}
     public void ListFlightTest() throws Exception
     {
         ListOfFlights lf = new ListOfFlights.Builder(100).build();
         Assert.assertEquals(100, lf.getListID());
         
     }
     
     @Test
     public void ListFlightTestUpdate() throws Exception
     {
         ListOfFlights lf = new ListOfFlights.Builder(100).build();
         Assert.assertNotSame(lf.getListID(), 101);
         
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
        lfc = Mockito.mock(ListOfFlightsCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void ListOfFlightsCreate() throws Exception
     {
        ListOfFlights lf = new ListOfFlights.Builder("100").build();
         
       
        ListOfFlights returnCf = lfc.persist(lf);
        when(lfc.persist(lf)).thenReturn(returnCf);
        Mockito.verify(lfc).persist(lf);

         
         /*Assert.assertEquals(100, cf.getListOfFlightsID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void ListOfFlightRead() throws Exception {
        
        ListOfFlights lf = new ListOfFlights.Builder("100").build();
        ListOfFlights returnF = lfc.find(lf.getListID());
        when(lfc.find(lf.getListID())).thenReturn(returnF);
        Mockito.verify(lfc).find(lf.getListID());

    }
     
     @Test
     public void ListOfFlightsUpdate() throws Exception
     {
       ListOfFlights lf = new ListOfFlights.Builder("100").build();
       ListOfFlights ctUpdate = new ListOfFlights.Builder().listOfFlights(lf).build();
       
        ListOfFlights returnQuestion = lfc.merge(lf);
        when(lfc.merge(lf)).thenReturn(returnQuestion);
        Mockito.verify(lfc).merge(lf);
       
       
//         Assert.assertEquals(110, pl.getListPassengersID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void ListOfFlightDelete() throws Exception {

       ListOfFlights lf = new ListOfFlights.Builder("100").build();
        ListOfFlights returnF = lfc.remove(lf);
        when(lfc.remove(lf)).thenReturn(returnF);
        Mockito.verify(lfc).remove(lf);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
