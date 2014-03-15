/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.immuteclass.model.PassengerType;
import com.sibu.immuteclass.service.crud.PassengerTypeCrud;
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
public class PassengerTypeTest {
    
    @Mock
    PassengerTypeCrud passT;
    
   // public PassengerTypeTest() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     /*@Test
    // public void hello() {}
     public static void PassengerTypeTest() throws Exception
     {
         PassengerType pt = new PassengerType.Builder("100").adult("25").child("6").infant("1").build();
         Assert.assertEquals(25, pt.getAdult());
         Assert.assertEquals(6, pt.getChild());
         Assert.assertEquals(1, pt.getInfant());
     }
     
      @Test
    // public void hello() {}
     public static void PassengerTypeUpdate() throws Exception
     {
         PassengerType pt = new PassengerType.Builder(100).adult(45).child(10).infant(2).build();
         Assert.assertNotSame(25, pt.getAdult());
         Assert.assertNotSame(6, pt.getChild());
         Assert.assertNotSame(1, pt.getInfant());
     
         
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
        passT = Mockito.mock(PassengerTypeCrud.class);
        
    }
    
     @Test
    // public void hello() {}
     public void PassengerTypeCreate() throws Exception
     {
       PassengerType pt = new PassengerType.Builder("100").adult("25").child("6").infant("1").build();
         
       
        PassengerType returnCf = passT.persist(pt);
        when(passT.persist(pt)).thenReturn(returnCf);
        Mockito.verify(passT).persist(pt);

         
         /*Assert.assertEquals(100, cf.getPassengerTypeID());
         Assert.assertTrue(true);
       //  Assert.assertEquals(cf.getFlightID());*/
     }
     
      @Test
    public void PassengerTypeRead() throws Exception {
        
       PassengerType pt = new PassengerType.Builder("100").adult("25").child("6").infant("1").build();
        PassengerType returnF = passT.find(pt.getPassType());
        when(passT.find(pt.getPassType())).thenReturn(returnF);
        Mockito.verify(passT).find(pt.getPassType());

    }
     
     @Test
     public void PassengerTypeUpdate() throws Exception
     {
       PassengerType pt = new PassengerType.Builder("100").adult("25").child("6").infant("1").build();
       
        PassengerType fUpdate = new PassengerType.Builder().passengerType(pt).adult("30").child("5").build();
         
         PassengerType returnCf = passT.merge(pt);
        when(passT.merge(pt)).thenReturn(returnCf);
        Mockito.verify(passT).merge(pt);
//         Assert.assertEquals(110, pl.getListPassengerTypesID());
  //       Assert.assertFalse(false);
     }
     
      @Test
    public void testDelete() throws Exception {

       PassengerType pt = new PassengerType.Builder("100").adult("25").child("6").infant("1").build();
        PassengerType returnF = passT.remove(pt);
        when(passT.remove(pt)).thenReturn(returnF);
        Mockito.verify(passT).remove(pt);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
