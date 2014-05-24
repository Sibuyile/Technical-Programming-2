/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sibu.designpatterns.behavioral.Iterator.Item;
import com.sibu.designpatterns.behavioral.Iterator.Menu;
import java.util.Iterator;
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
public class IteratorTest {
    
    public IteratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
      Item i1 = new Item("spaghetti", 7.50f);
        Item i2 = new Item("hamburger", 6.00f);
        Item i3 = new Item("chicken sandwich", 6.50f);

        Menu menu = new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);

        System.out.println("Displaying Menu:");
        Iterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
                Item item = iterator.next();
                System.out.println(item);
        }

        System.out.println("\nRemoving last item returned");
        iterator.remove();

        System.out.println("\nDisplaying Menu:");
        iterator = menu.iterator();
        while (iterator.hasNext()) {
                Item item = iterator.next();
                System.out.println(item);
        }
     
     }

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
