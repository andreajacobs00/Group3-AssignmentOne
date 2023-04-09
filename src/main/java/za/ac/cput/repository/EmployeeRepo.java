/*
Author@ Joshua Edward Nolte _ 219342717
 Repository Class for Employee
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRepo implements IEmployeeRepo{

    private static EmployeeRepo repo = null;
    private Set<Employee> employeeDB = null;

    private EmployeeRepo(){
        employeeDB= new HashSet<Employee>();
    }

    public static EmployeeRepo getRepo(){
        if (repo == null){
            repo = new EmployeeRepo();
        }
        return repo;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeeDB.add(employee);
        if(!success)
            return null;
        return employee;
    }

    @Override
    public Employee read(String employeeId) {
        Employee employee = employeeDB.stream()
                .filter(c -> c.getEmployeeId().equals(employeeId))
                .findAny()
                .orElse(null);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeId());
        if(oldEmployee !=null){
            employeeDB.remove(oldEmployee);
            employeeDB.add(employee);
            return employee;
        }
        else{
            employeeDB.add(employee);
            return employee;
        }
    }

    @Override
    public boolean delete(String employeeId) {
        Employee employeeToDelete = read(employeeId);
        if(employeeToDelete == null)
            return false;
        employeeDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public Set<Employee> getAll() {
        return employeeDB;
    }
}
