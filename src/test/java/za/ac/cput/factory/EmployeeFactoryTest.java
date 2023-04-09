/*
Author@ Joshua Edward Nolte _ 219342717
Factory Test Class for Employee class
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void test(){
        Employee employee = EmployeeFactory.createEmployee("219342717");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }

}