/** CartFactory.java
 *  This class sets the factory functionality of the program
 * Cebisani Lamani (219104409)
 * 22 March 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Product;
import za.ac.cput.util.Helper;

public class CartFactory {
    public static Cart addCart(Customer customer_ID, Product product_ID, int quantity){
        double productPrice = product_ID.getProduct_Price();
        double total = (quantity >= 1) ? productPrice * quantity :0.0;

        String cart_ID = Helper.generateID().toString();

        return new Cart.Builder().setCart_ID(cart_ID)
                .setCustomer_ID(customer_ID)
                .setProduct_ID(product_ID)
                .setQuantity(quantity)
                .setTotal_Amount(total)
                .build();
    }
}