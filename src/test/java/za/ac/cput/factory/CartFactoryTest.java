/** CartFactory.java
 *  This is the unit testing class
 * Cebisani Lamani (219104409)
 * 22 March 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Product;
import za.ac.cput.domain.Products;

import static org.junit.jupiter.api.Assertions.*;

class CartFactoryTest {
    @Test
    public void test(){
        Customer customer = CustomerFactory.createCustomer("Cebisani", "Lamani");
        Products product = ProductFactory.createProduct("500g Tyre polish", 179.99);
        Cart cart = CartFactory.addCart(customer, product, 3);
        assertNotNull(cart);
        System.out.println("Cart:" + cart);
    }
}