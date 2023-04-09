/*
Author@ Joshua Edward Nolte _ 219342717
 Repository Test Class for Customer
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import org.junit.jupiter.api.Test;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepoTest {
    private static CustomerRepo repo = CustomerRepo.getRepo();
    private static Customer customer = CustomerFactory.createCustomer("219342717", "Joshua Edward", "Nolte");

    @Test
    void a_create() {
        Customer created = repo.create(customer);
        assertEquals(customer.getCustId(),created.getCustId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Customer read = repo.read(customer.getCustId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Customer updated = new Customer.Builder().copy(customer)
                .setFirstName("Charles")
                .setLastName("Charlie")
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repo.delete(customer.getCustId());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repo.getAll());
    }
}