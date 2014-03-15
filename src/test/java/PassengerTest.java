/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.sibu.immuteclass.model.Passenger;
import com.sibu.immuteclass.service.crud.PassengerCrud;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author stud
 */
public class PassengerTest {
    
    @Mock  
    PassengerCrud pass;
    
   // public PassengerTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
    // public void hello() {}
     public static void PassengerTest() throws Exception
     {
         
         Passenger pass = new Passenger.Builder("110").details("Sibuyile Mdladlana").dob("17 May 1985").phoneNumber("0782686802").emailAd("sibum@yahoo.com").build();
         Assert.assertEquals(pass.getDetails(), "Sibuyile Mdladlana");
         Assert.assertEquals(pass.getDOB(), "17 May 1985");
         Assert.assertEquals(pass.getPhoneNo(), "0782686802");
         Assert.assertEquals(pass.getEmailAdd(), "sibum@yahoo.com");
         
     }
     
      @Test
    // public void hello() {}
     public static void PassengerUpdate() throws Exception
     {
         
         Passenger pass = new Passenger.Builder(111).details("Sibu Mdla").dob("17 Ocotber 1985").phoneNumber("04364228032").emailAd("sibu0341@yahoo.com").build();
        
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
        pass = Mockito.mock(PassengerCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public static void PassengerCreate() throws Exception
     {
       Passenger pass = new Passenger.Builder("111").details("Sibu Mdla").dob("17 Ocotber 1985").phoneNumber("04364228032").emailAd("sibu0341@yahoo.com").build();
         
       /*
        Passenger returnCf = pass.persist(cf);
        when(pass.persist(cf)).thenReturn(returnCf);
        Mockito.verify(pass).persist(cf);*/

         
         /*Assert.assertEquals(100, cf.getPassengerID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void PassengerRead() throws Exception {
        
        Passenger p = new Passenger.Builder("111").details("Sibu Mdla").dob("17 Ocotber 1985").phoneNumber("04364228032").emailAd("sibu0341@yahoo.com").build();
        Passenger returnF = pass.find(p.getPassengerID());
        when(pass.find(p.getPassengerID())).thenReturn(returnF);
        Mockito.verify(pass).find(p.getPassengerID());

    }
     
     @Test
     public void PassengerUpdate() throws Exception
     {
        Passenger p = new Passenger.Builder("111").details("Sibu Mdla").dob("17 Ocotber 1985").phoneNumber("04364228032").emailAd("sibu0341@yahoo.com").build();
         Passenger fUpdate = new Passenger.Builder().passenger(p).emailAd("sbu@gmail.com").build();
         
         Passenger returnCf = pass.merge(p);
        when(pass.merge(p)).thenReturn(returnCf);
        Mockito.verify(pass).merge(p);
//         Assert.assertEquals(110, pl.getListPassengersID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

       Passenger p = new Passenger.Builder("111").details("Sibu Mdla").dob("17 Ocotber 1985").phoneNumber("04364228032").emailAd("sibu0341@yahoo.com").build();
        Passenger returnF = pass.remove(p);
        when(pass.remove(p)).thenReturn(returnF);
        Mockito.verify(pass).remove(p);

    }
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
