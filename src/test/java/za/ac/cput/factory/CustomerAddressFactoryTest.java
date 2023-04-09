/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.CustomerAddress;

import static org.junit.jupiter.api.Assertions.*;

class CustomerAddressFactoryTest {
    @Test
    public void createAddressTest() {
        Customer cust =  CustomerFactory.createCustomer("", "Kauthar", "Bloodclart");

        CustomerAddress cAddress = CustomerAddressFactory.createCustomerAddress(cust,
                "18",
                "New Market",
                "Ottery",
                7880);
        System.out.println(cAddress);
        assertNotNull(cAddress);
    }

}