/*
Author@ Joshua Edward Nolte _ 219342717
 Factory Class for Employee
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;
public class EmployeeFactory {
    public static Employee createEmployee(String employeeId){

        if(Helper.isNullorEmpty(employeeId))
            return null;

        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .build();
    }

}
