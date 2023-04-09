/** CartRepository.java
 *  This is the repository testing class
 * Cebisani Lamani (219104409)
 * 01 April 2023
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Products;
import za.ac.cput.factory.CartFactory;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.factory.ProductsFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class CartRepositoryTest {
    private static Customer customer = CustomerFactory.createCustomer("219104409","Cebisani", "Lamani");
    private static Products product = ProductsFactory.createProductsID(" 3L Car Wash bottle Soap", 399.99);
    private static Cart cart = CartFactory.addCart(customer, product, 4);
    private static CartRepository cartRepository = CartRepository.getCartRepository();

    @Test
    void a_create() {
        Cart cartCreate = cartRepository.create(cart);
        assertEquals(cart.getCart_ID(), cartCreate.getCart_ID());
        System.out.println("Created:" + cartCreate);
    }

    @Test
    void b_read() {
        Cart cartRead = cartRepository.read(cart.getCart_ID());
        assertNotNull(cartRead);
        System.out.println("Read:" + cartRead);
    }

    @Test
    void c_update() {
        Cart cart2 = new Cart.Builder().copy(cart).setQuantity(2).build();
        assertEquals(cart2, cartRepository.update(cart2));
        System.out.println("Updated:" + cart2);
    }

    @Test
    void e_delete() {
        boolean success = cartRepository.delete(cart.getCart_ID());
        assertTrue(success);
        System.out.println("Deleted:" + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Showing all cart info:");
        System.out.println(cartRepository.getAll());
    }
}