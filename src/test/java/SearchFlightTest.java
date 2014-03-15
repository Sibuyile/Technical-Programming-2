/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.SearchFlight;
import com.sibu.immuteclass.service.crud.SearchFlightCrud;
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
public class SearchFlightTest {
    
    @Mock
    SearchFlightCrud sfc;
    
   // public SearchFlightTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   /*  @Test
    // public void hello() {}
     public static void SearchFlightTest()
     {
         SearchFlight sf = new SearchFlight.Builder("100").search(true).build();
        // Flight f = sf.flightID();
         Assert.assertEquals(sf.getSearchID(), 100);
        Assert.assertTrue(true);
     }
     
     @Test
     public static void SearchFlightUpdate()
     {
         SearchFlight sf = new SearchFlight.Builder(101).search(true).build();
        
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
        sfc = Mockito.mock(SearchFlightCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void SearchFlightCreate() throws Exception
     {
      SearchFlight sf = new SearchFlight.Builder("100").search("false").build();
       
        SearchFlight returnCf = sfc.persist(sf);
        when(sfc.persist(sf)).thenReturn(returnCf);
        Mockito.verify(sfc).persist(sf);

         
         /*Assert.assertEquals(100, cf.getSearchFlightID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void SearchFlightRead() throws Exception {
        
      SearchFlight sf = new SearchFlight.Builder("100").search("true").build();
       SearchFlight returnF = sfc.find(sf.getSearchID());
        when(sfc.find(sf.getSearchID())).thenReturn(returnF);
        Mockito.verify(sfc).find(sf.getSearchID());

    }
     
     @Test
     public void SearchFlightUpdate() throws Exception
     {
      SearchFlight sf = new SearchFlight.Builder("100").search("true").build();
       SearchFlight fUpdate = new SearchFlight.Builder().searchFlight(sf).search("false").build();
         
         SearchFlight returnCf = sfc.merge(sf);
        when(sfc.merge(sf)).thenReturn(returnCf);
        Mockito.verify(sfc).merge(sf);
      // Assert.assertEquals(110, pl.getListSearchFlightsID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

       SearchFlight sf = new SearchFlight.Builder("100").search("false").build();
       SearchFlight returnF = sfc.remove(sf);
        when(sfc.remove(sf)).thenReturn(returnF);
        Mockito.verify(sfc).remove(sf);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
