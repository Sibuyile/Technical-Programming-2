/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.ListOfPassengers;
import com.sibu.immuteclass.service.crud.ListOfPassengersCrud;
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
public class ListPassengerTest {
    
    @Mock
    ListOfPassengersCrud list;
    
    //public ListPassengerTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
    // public void hello() {}
     public static void PassengerList() throws Exception
     {
         ListOfPassengers pl = new ListOfPassengers.Builder("111").build();
         Assert.assertEquals(pl.getListPassengersID(), 111);
         
         
         
         
     }
     
     @Test
    // public void hello() {}
     public static void PassengerListUpdate() throws Exception
     {
         ListOfPassengers pl = new ListOfPassengers.Builder("112").build();
          Assert.assertNotEquals(pl.getListPassengersID(), 111);
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
        list = Mockito.mock(ListOfPassengersCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void ListOfPassengersCreate() throws Exception
     {
        ListOfPassengers pl = new ListOfPassengers.Builder("112").build();
         
       
        ListOfPassengers returnCf = list.persist(pl);
        when(list.persist(pl)).thenReturn(returnCf);
        Mockito.verify(list).persist(pl);

         
         /*Assert.assertEquals(100, cf.getListOfPassengersID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void PassengerRead() throws Exception {
        
        ListOfPassengers pl = new ListOfPassengers.Builder("112").build();
        ListOfPassengers returnF = list.find(pl.getListPassengersID());
        when(list.find(pl.getListPassengersID())).thenReturn(returnF);
        Mockito.verify(list).find(pl.getListPassengersID());

    }
     
     @Test
     public void ListOfPassengersUpdate() throws Exception
     {
        ListOfPassengers pl = new ListOfPassengers.Builder("112").build();
        
         ListOfPassengers ctUpdate = new ListOfPassengers.Builder().listOfPassengers(pl).build();
         
          ListOfPassengers returnF = list.merge(pl);
        when(list.merge(pl)).thenReturn(returnF);
        Mockito.verify(list).merge(pl);
//         Assert.list(110, pl.getListPassengersID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

        ListOfPassengers pl = new ListOfPassengers.Builder("112").build();
        ListOfPassengers returnF = list.remove(pl);
        when(list.remove(pl)).thenReturn(returnF);
        Mockito.verify(list).remove(pl);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
