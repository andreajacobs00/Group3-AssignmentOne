/** CartFactory.java
 *  This is the unit testing class
 * Cebisani Lamani (219104409)
 * 22 March 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeAddress;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {
    @Test
    public void test(){
        Employee employee = EmployeeFactory.createEmployee("Cebisani", "Lamani", "cebisanilamani100@gmail.com");
        EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress(employee, "87", "King Edward Street", "Cape Town", "7500" );
        System.out.println(employeeAddress.toString());
        assertNotNull(employeeAddress);
    }
}