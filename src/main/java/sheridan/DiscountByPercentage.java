/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 * DiscountByPercentage class added
 * subclass to Discount class
 * @author Kennith Yu
 */
public class DiscountByPercentage extends Discount{
    
    // Returns a double value representing the total price of a Cart
    // after applying a percentage discount
    public double applyDiscount(double total, double discountAmount) {
        return total - (total * (discountAmount * 0.01));
    }
    
}
