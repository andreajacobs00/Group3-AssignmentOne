/** ICartRepository.java
 *  This class has the singleton functionality of the program
 * Cebisani Lamani (219104409)
 * 01 April 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Cart;

import java.util.Set;

public interface ICartRepository extends IRepositoryCartAndEmployeeAddress<Cart, String> {
    public Set<Cart> getAll();
}