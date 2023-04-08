/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.CustomerAddress;

import static org.junit.jupiter.api.Assertions.*;

class CustomerAddressFactoryTest {
    @Test
    public void createAddressTest() {
        CustomerAddress cAddress = CustomerAddressFactory.createCustomerAddress("17",
                "New Market",
                "Wetton",
                7780);
        System.out.println(cAddress);
        assertNotNull(cAddress);
    }

}