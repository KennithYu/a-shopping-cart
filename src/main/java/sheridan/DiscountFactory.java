/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 * DiscountFactory class added
 * Singleton class that ensures only one object of type DiscountFactory is created
 * @author Kennith Yu
 */
public class DiscountFactory {
    // Private member instance represents an object of itself
    private static DiscountFactory instance = null;
    
    // Private constructor added so the class cannot be instantiated through normal means
    private DiscountFactory( ) {
        
    }
    
    /*
     * getDiscount method created
     * Returns a certain Discount subclass based on choice
     * Added by Kennith King Hay Yu
    */
    public Discount getDiscount( DiscountType type ) {
        switch ( type ) {
            case AMOUNT : return new DiscountByAmount( );
            case PERCENTAGE : return new DiscountByPercentage( );
        }
        return null;
    }
    
    /*
     * getInstance method created
     * Only way to instantiate DiscountFactory class
     * Ensures only one object is ever available
     * Added by Kennith King Hay Yu
    */
    public static DiscountFactory getInstance( ) {
        if ( instance == null ) {
            instance = new DiscountFactory( );
        }
        return instance;
    }
}
