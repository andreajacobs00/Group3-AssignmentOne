package za.ac.cput.repository;

import org.jetbrains.annotations.NotNull;
import za.ac.cput.domain.CustomerAddress;

import java.util.HashSet;
import java.util.Set;

public  class CustomerAddressRepository implements ICustomerAddressRepository {
    private static CustomerAddressRepository repo = null;
    private Set<CustomerAddress> custAddressDB = null;

    public CustomerAddressRepository() {
        custAddressDB = new HashSet<CustomerAddress>();
    }

    public static CustomerAddressRepository getRepo() {
        if (repo == null) {
            repo = new CustomerAddressRepository();
        }
        return repo;
    }

    @Override
    public CustomerAddress create(CustomerAddress customerAddressID) {
           boolean success = custAddressDB.add(customerAddressID);
            if (!success) {
                return null;
            }
            return customerAddressID;
    }

    @Override
    public CustomerAddress read(String customerAddressID) {
        for (CustomerAddress cA : custAddressDB) {
            if (cA.getAddress_ID().equals(customerAddressID)) {
                return cA;
            }
        }
        return null;
    }
    @Override
    public CustomerAddress update( CustomerAddress customerAddressID) {
        CustomerAddress oldAddress = read(customerAddressID.getAddress_ID());

        if (oldAddress != null) {
            custAddressDB.remove(oldAddress);
            custAddressDB.add(customerAddressID);
            return customerAddressID;
        } else {
            custAddressDB.add(customerAddressID);
            return customerAddressID;
        }
    }

    @Override
    public boolean delete(String customerAddressID) {

        CustomerAddress custToDelete = read(customerAddressID);
        if (custToDelete == null) {
            return false;
        }
        custAddressDB.remove(custToDelete);
        return true;
    }

    @Override
    public Set<CustomerAddress> getAll() {
        return custAddressDB;
    }
}
