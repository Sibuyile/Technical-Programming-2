/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.SearchTicket;
import com.sibu.immuteclass.service.crud.SearchTicketCrud;
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
public class SearchTicketTest {
    
    @Mock
    SearchTicketCrud stc;
    
    
    public SearchTicketTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   /* @Test
    // public void hello() {}
   
     public static void SearchTicketTest()
     {
         SearchTicket st = new SearchTicket.Builder(100).search(true).build();
        // Flight f = sf.flightID();
         Assert.assertEquals(st.getSearchID(), 100);
       Assert.assertTrue(true);
     }
     
     @Test
     public static void searchUpate()
     {
          SearchTicket st = new SearchTicket.Builder(101).search(true).build();
         
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
        stc = Mockito.mock(SearchTicketCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void SearchTicketCreate() throws Exception
     {
      SearchTicket sf = new SearchTicket.Builder("100").search("true").build();
       
        SearchTicket returnCf = stc.persist(sf);
        when(stc.persist(sf)).thenReturn(returnCf);
        Mockito.verify(stc).persist(sf);

         
         /*Assert.assertEquals(100, cf.getSearchTicketID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void SearchTicketRead() throws Exception {
        
      SearchTicket st = new SearchTicket.Builder("100").search("true").build();
       SearchTicket returnF = stc.find(st.getSearchID());
        when(stc.find(st.getSearchID())).thenReturn(returnF);
        Mockito.verify(stc).find(st.getSearchID());

    }
     
     @Test
     public void SearchTicketUpdate() throws Exception
     {
      SearchTicket st = new SearchTicket.Builder("100").search("true").build();
      SearchTicket fUpdate = new SearchTicket.Builder().search(st).search("false").build();
         
         SearchTicket returnCf = stc.merge(st);
        when(stc.merge(st)).thenReturn(returnCf);
        Mockito.verify(stc).merge(st);
      // Assert.assertEquals(110, pl.getListSearchTicketsID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

       SearchTicket sf = new SearchTicket.Builder("100").search("false").build();
       SearchTicket returnF = stc.remove(sf);
        when(stc.remove(sf)).thenReturn(returnF);
        Mockito.verify(stc).remove(sf);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
