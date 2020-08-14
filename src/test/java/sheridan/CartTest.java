/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import org.junit.*;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Kennith Yu
 */
public class CartTest {
    
    public CartTest() {
    }
    
    @Test
    public void testAddProductGood() {
        System.out.println("addProductGood");
        Product product = new Product("Test", 20);
        Cart instance = new Cart();
        instance.addProduct(product);
        
        assertEquals("Products in cart does not equal to 1.", 1, instance.getCartSize());
    }

    @Test 
    public void testAddProductBad() {
        System.out.println("addProductBad");
        Product product = null;
        Cart instance = new Cart();
        instance.addProduct(product);
        
        assertEquals("Products in cart does not equal to 0.", 0,  instance.getCartSize());
    }
    
}
