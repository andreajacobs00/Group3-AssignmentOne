/*
Author@ Joshua Edward Nolte _ 219342717
Factory Test Class for Customer class
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    public void test(){
        Customer customer = CustomerFactory.createCustomer("219342717", "Joshua Edward", "Nolte");
        System.out.println(customer.toString());
        assertNotNull(customer);
    }

}