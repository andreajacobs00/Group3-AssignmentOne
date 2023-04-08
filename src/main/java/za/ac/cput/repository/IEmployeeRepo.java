/*
Author@ Joshua Edward Nolte _ 219342717
 Interface Repository for Employee
 */

package za.ac.cput.repository;
import za.ac.cput.domain.Employee;
import java.util.Set;

public interface IEmployeeRepo extends IRepo<Employee,String>{
    public Set<Employee> getAll();

}
