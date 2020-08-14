/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramses
 */
public class Cart {
    
    private List <Product> products = new ArrayList<>( );
    private PaymentService service;
    
    /*
     * Added two new private members to Cart class
     * discount represents a Discount object, injected by ShoppingCartDemo
     * through a factory
     * Added by Kennith King Hay Yu
    */
    private Discount discount;
    private double discountAmount;
    
    public void setPaymentService( PaymentService service ) {
        this.service  = service;
    }

    /*
     * Added the method setDiscount
     * Accepts parameters dicount of type Discount and amount of type Double
     * sets private members discount and disocuntAmount to their respective
     * values passed.
     * Added by Kennith King Hay Yu
    */
    public void setDiscount(Discount discount, double amount) {
        this.discount = discount;
        this.discountAmount = amount;
    }
    
    public void addProduct( Product product ) {
        products.add( product );
    }
    
    /*
     * Updated payCart class
     * Added logic for checking if there is a discount to apply
     * then applies the discount to the total cart price
     * Added by Kennith King Hay Yu
    */
    public void payCart( ) {
        double total = 0;
        
       for ( Product product : products ) {
           total += product.getPrice( );
       }
       
       if(discount != null && discountAmount != 0) {
          total = discount.applyDiscount(total, discountAmount);
          discount = null;
       }
       
        service.processPayment( total );
    }
    
    /*
     * Added getCartSize
     * Returns an integer that represents the amount of objects 
     * in the ArrayList products
     * Added by Kennith King Hay Yu
    */
    public int getCartSize() {
        return products.size();
    }
}
