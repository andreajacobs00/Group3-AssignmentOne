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
import za.ac.cput.domain.CustomerAddress;
import za.ac.cput.domain.UserDetails;
import za.ac.cput.factory.CustomerAddressFactory;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.factory.UserDetailsFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerAddressRepositoryTest {
    private static CustomerAddressRepository repo = CustomerAddressRepository.getRepo();
    static Customer custAddID = CustomerFactory.createCustomer("","Richard", "Peterson");
    private static CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(custAddID, "19",  "08/04/2023", "Password123", 7880);

    @Test
    void a_create() {
        CustomerAddress created = repo.create(customerAddress);
        assertEquals(customerAddress.getAddress_ID(), created.getAddress_ID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        CustomerAddress read = repo.read(customerAddress.getAddress_ID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        CustomerAddress updated = new CustomerAddress.Builder().copy(customerAddress)
                .setAddress_ID("")
                .setHouse_No("17")
                .setStreetName("Walker")
                .setSuburb("Kenwyn")
                .setPostal_code(String.valueOf(7780))
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repo.delete(customerAddress.getAddress_ID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show All:");
        System.out.println(repo.getAll());;
    }
}