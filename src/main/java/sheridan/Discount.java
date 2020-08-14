/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 * Discount class added
 * Abstract class that expects implementation for the method applyDiscount
 * @author Kennith Yu
 */
public abstract class Discount {   
    public abstract double applyDiscount(double total, double discountAmount);
}
