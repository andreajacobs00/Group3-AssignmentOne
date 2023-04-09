/** EmployeeAddressRepository.java
 *  This class has the singleton functionality of the program
 * Cebisani Lamani (219104409)
 */
package za.ac.cput.repository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeAddressRepository implements IEmployeeAddress {
    private static EmployeeAddressRepository employeeAddressRepository = null;
    private Set<za.ac.cput.domain.EmployeeAddress> employeeAddressSet = null;

    // Constructor
    private EmployeeAddressRepository(){
        employeeAddressSet = new HashSet<za.ac.cput.domain.EmployeeAddress>();
    }
    public static EmployeeAddressRepository getEmployeeAddressRepository(){
        if (employeeAddressRepository == null){
            employeeAddressRepository = new EmployeeAddressRepository();
        }
        return employeeAddressRepository;
    }

    @Override
    public za.ac.cput.domain.EmployeeAddress create(za.ac.cput.domain.EmployeeAddress employeeAddress) {
        boolean success = employeeAddressSet.add(employeeAddress);
        if (!success)
            return null;

        return employeeAddress;

    }

    @Override
    public za.ac.cput.domain.EmployeeAddress read(String address_ID) {
        /*for (EmployeeAddressRepository ea: employeeAddressSet) {
            if (ea.getAddress_ID().equals(address_ID))
                return ea;
        }
        return null;*/
        za.ac.cput.domain.EmployeeAddress employeeAddress = employeeAddressSet
                .stream()
                .filter(ea -> ea.getAddress_ID()
                        .equals(address_ID))
                .findAny()
                .orElse(null);

        return employeeAddress;
    }

    @Override
    public za.ac.cput.domain.EmployeeAddress update(za.ac.cput.domain.EmployeeAddress employeeAddress) {
        za.ac.cput.domain.EmployeeAddress oldEmployeeAddress = read(employeeAddress.getAddress_ID());
        if (oldEmployeeAddress != null){
            employeeAddressSet.remove(oldEmployeeAddress);
            employeeAddressSet.add(employeeAddress);
            return employeeAddress;
        }
        return null;
    }

    @Override
    public boolean delete(String address_ID) {
        za.ac.cput.domain.EmployeeAddress deleteEmployeeAddress = read(address_ID);
        if (deleteEmployeeAddress != null) {
            employeeAddressSet.remove(deleteEmployeeAddress);
            return true;
        }
        return false;
    }
    @Override
    public Set<za.ac.cput.domain.EmployeeAddress> getAll() {
        return employeeAddressSet;
    }
}