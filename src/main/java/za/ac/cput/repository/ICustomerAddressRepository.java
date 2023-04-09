package za.ac.cput.repository;

import za.ac.cput.domain.CustomerAddress;

import java.util.Set;

public interface ICustomerAddressRepository extends IRepository <CustomerAddress, String> {
    public Set<CustomerAddress> getAll();
}
