/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.UserDetails;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.factory.UserDetailsFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class UserDetailsRepositoryTest {
    private static UserDetailsRepository repo = UserDetailsRepository.getRepo();
    static Customer cust = CustomerFactory.createCustomer("", "John","Routledge");
    private static UserDetails user = UserDetailsFactory.createUser(cust, "12/13/2023", "08/04/2023", "Password123");

    @Test
    void a_create() {
        UserDetails created = repo.create(user);
        assertEquals(user.getUserID(), created.getUserID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        UserDetails read = repo.read(user.getUserID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        UserDetails updated = new UserDetails.Builder().copy(user)
                .setDateOfReg("12/13/2023")
                .setLoginDate("09/04/20203")
                .setPassword("Password123")
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void d_delete() {
        boolean success = repo.delete(user.getUserID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show All:");
        System.out.println(repo.getAll());;
    }
}