/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import com.sibu.immuteclass.model.FlightDays;
import com.sibu.immuteclass.service.crud.FlightDaysCrud;
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
public class FlightDaysTest {
    
    @Mock
    FlightDaysCrud flytDays;
    
   // public FlightDaysDaysTest() {
    //}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /* @Test
    // public void hello() {}
     public static void FlightDaysDaysTest()
     {
         FlightDaysDays fd = new FlightDaysDays.Builder("100").Date("8 March 2014").DepartureCity("Jhb").ArriveCity("CPT").build();
         Assert.assertEquals(fd.getFlightDaysDaysID(), 100);
         Assert.assertEquals(fd.getDate(), "8 March 2014");
         Assert.assertEquals(fd.getDepartureCity(), "Jhb");
         Assert.assertEquals(fd.getArriveCity(), "CPT");
        
         
     }
     
     @Test
     public static void FlightDaysDaysUpdate()
     {
         FlightDaysDays fd = new FlightDaysDays.Builder("100").Date("8 March 2014").DepartureCity("Jhb").ArriveCity("CPT").build();
         Assert.assertNotEquals(fd.getFlightDaysDaysID(), 110);
         Assert.assertNotEquals(fd.getDate(), "9 March 2014");
         Assert.assertNotEquals(fd.getDepartureCity(), "CPT");
         Assert.assertNotEquals(fd.getArriveCity(), "JHB");
         
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
        flytDays = Mockito.mock(FlightDaysCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public static void FlightDaysCreate() throws Exception
     {
         FlightDays cf = new FlightDays.Builder("100").build();
         
       /*
        FlightDays returnCf = flytDays.persist(cf);
        when(flytDays.persist(cf)).thenReturn(returnCf);
        Mockito.verify(flytDays).persist(cf);*/

         
         /*Assert.assertEquals(100, cf.getFlightDaysID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightDaysID());*/
     }
     
      @Test
    public void FlightDaysRead() throws Exception {
        
       FlightDays cf = new FlightDays.Builder("100").build();
        FlightDays returnCf = flytDays.find(cf.getFlightDaysID());
        when(flytDays.find(cf.getFlightDaysID())).thenReturn(returnCf);
        Mockito.verify(flytDays).find(cf.getFlightDaysID());

    }
     
     @Test
     public static void FlightDaysUpdate() throws Exception
     {
        FlightDays f = new FlightDays.Builder("100").build();
      //   Assert.assertEquals(110, f.getFlightDaysID());
       //  Assert.assertFalse(false);
     }
     
      @Test
    public void FlightDaysDelete() throws Exception {

         FlightDays f = new FlightDays.Builder("100").build();
        FlightDays returnF = flytDays.remove(f);
        when(flytDays.remove(f)).thenReturn(returnF);
        Mockito.verify(flytDays).remove(f);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
