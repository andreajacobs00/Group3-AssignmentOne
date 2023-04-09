/** CartRepository.java
 *  This class has the singleton functionality of the program
 *  Cebisani Lamani (219104409)
 *  01 April 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Cart;

import java.util.HashSet;
import java.util.Set;

public class CartRepository implements ICartRepository {
    public static CartRepository cartRepository = null;
    private Set<Cart> cartSet = null;
    // Constructor
    private CartRepository(){cartSet = new HashSet<Cart>();}

    public static CartRepository getCartRepository(){
        if(cartRepository == null){
            cartRepository = new CartRepository();
        }
        return cartRepository;
    }

    @Override
    public Cart create(Cart cart) {
        boolean success = cartSet.add(cart);
        if (!success) {
            return null;
        }
        return cart;
    }

    @Override
    public Cart read(String cart_ID) {
        Cart cart = cartSet
                .stream().filter(e -> e.getCart_ID().equals(cart_ID))
                .findAny()
                .orElse(null);

        return cart;
    }

    @Override
    public Cart update(Cart cart) {
        Cart oldCart = read(cart.getCart_ID());
        if (oldCart != null){
            cartSet.remove(oldCart);
            cartSet.add(cart);
            return cart;
        }
        return null;
    }

    @Override
    public boolean delete(String cart_ID) {
        Cart cartDelete = read(cart_ID);
        if(cartDelete != null){
            cartSet.remove(cartDelete);
            return true;
        }
        return false;
    }

    @Override
    public Set<Cart> getAll() {
        return cartSet;
    }
}