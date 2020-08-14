/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 * DiscountByAmount class added
 * subclass to Discount class
 * @author Kennith Yu
 */
public class DiscountByAmount extends Discount{
    
    // returns a double value representing the total price of a Cart
    // after applying a flat discount to the total
    public double applyDiscount(double total, double discountAmount) {
        return total - discountAmount;
    }
    
}
