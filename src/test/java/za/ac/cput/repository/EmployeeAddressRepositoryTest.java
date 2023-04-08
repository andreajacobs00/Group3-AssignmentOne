/** EmployeeAddressRepository.java
 *  This is the repository testing class
 * Cebisani Lamani (219104409)
 * 01 April 2023
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.factory.EmployeeAddressFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class EmployeeAddressRepositoryRepositoryTest {
    private static Employee employee = EmployeeFactory.createEmployee("Cebisani", "Lamani", "cebisanilamani100@gmail.com");
    private static EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress(employee, "87", "King Edward Street", "Cape Town", "7500");
    private static EmployeeAddressRepository employeeAddressRepository = EmployeeAddressRepository.getEmployeeAddressRepository();
    @Test
    void a_create() {
        za.ac.cput.domain.EmployeeAddress employeeAddressCreate = employeeAddressRepository.create(employeeAddress);
        /*assertNotNull(employeeAddressCreate);*/
        assertEquals(employeeAddress.getAddress_ID(), employeeAddressCreate.getAddress_ID());
        System.out.println("Created: " + employeeAddressCreate );
    }

    @Test
    void b_read() {
        za.ac.cput.domain.EmployeeAddress employeeAddressRead = employeeAddressRepository.read(employeeAddress.getAddress_ID());
        assertNotNull(employeeAddressRead);
        System.out.println("Read: " + employeeAddressRead);
    }

    @Test
    void c_update() {
        za.ac.cput.domain.EmployeeAddress employeeAddressUpdate = new za.ac.cput.domain.EmployeeAddress.Builder().copy(employeeAddress).setHouse_No("E20")
                .setStreet_Name("Summerstrand")
                .setSuburb("Port Elizabeth")
                .setPostal_Code("6001")
                .build();
        assertEquals(employeeAddressUpdate, employeeAddressRepository.update(employeeAddressUpdate));
        System.out.println("Updated: " + employeeAddressUpdate);
    }

    @Test
    void e_delete() {
        boolean success = employeeAddressRepository.delete(employeeAddress.getAddress_ID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Showing all Employee Addresses:");
        System.out.println(employeeAddressRepository.getAll());
    }
}