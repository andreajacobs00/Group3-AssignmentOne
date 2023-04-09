/*
Author@ Joshua Edward Nolte _ 219342717
 Repository Class for Customer
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Customer;
import java.util.HashSet;
import java.util.Set;

public class CustomerRepo implements ICustomerRepo{

    private static CustomerRepo repo = null;
    private Set<Customer> customerDB = null;

    private CustomerRepo(){
        customerDB= new HashSet<Customer>();
    }

    public static CustomerRepo getRepo(){
        if (repo == null){
            repo = new CustomerRepo();

        }
        return repo;
    }

    @Override
    public Customer create(Customer customer) {
        boolean success = customerDB.add(customer);
        if(!success)
            return null;
        return customer;
    }

    @Override
    public Customer read(String custId) {
        Customer customer = customerDB.stream()
                .filter(c -> c.getCustId().equals(custId))
                .findAny()
                .orElse(null);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getCustId());
        if(oldCustomer !=null){
            customerDB.remove(oldCustomer);
            customerDB.add(customer);
            return customer;
        }
        else {
            customerDB.add(customer);
            return customer;
        }
    }

    @Override
    public boolean delete(String custId) {
        Customer customerToDelete = read(custId);
        if(customerToDelete == null)
            return false;
        customerDB.remove(customerToDelete);
        return true;
    }

    @Override
    public Set<Customer> getAll() {
        return customerDB;
    }
}
