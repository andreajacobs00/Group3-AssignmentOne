/*
Author@ Joshua Edward Nolte _ 219342717
 Interface Repository for Customer
 */

package za.ac.cput.repository;
import za.ac.cput.domain.Customer;
import java.util.Set;

public interface ICustomerRepo extends IRepo<Customer,String>{
    public Set<Customer> getAll();

}
