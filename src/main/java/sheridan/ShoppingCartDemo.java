/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 *
 * @author ramses
 */
public class ShoppingCartDemo {
    
    public static void main( String args [ ] ) {
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance( );
        PaymentService creditService = factory.getPaymentService( PaymentServiceType.CREDIT );
        PaymentService debitService = factory.getPaymentService( PaymentServiceType.DEBIT );  
        
        DiscountFactory discountFactory = DiscountFactory.getInstance();
        Discount amountDiscount = discountFactory.getDiscount(DiscountType.AMOUNT);
        Discount percentageDiscount = discountFactory.getDiscount(DiscountType.PERCENTAGE);
        
            // create cart and add products
        Cart cart = new Cart( );
        cart.addProduct( new Product( "shirt" , 50 ) );
        cart.addProduct( new Product( "pants" , 60 ) );
            // set credit service and pay
        cart.setPaymentService( creditService );
        cart.setDiscount(amountDiscount, 10);
        cart.payCart();
            // set debit service and pay
        cart.setPaymentService( debitService );
        cart.setDiscount(percentageDiscount, 20);
        cart.payCart();        
        
    } 
    
}
