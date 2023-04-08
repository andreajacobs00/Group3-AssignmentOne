/*
Author@ Joshua Edward Nolte _ 219342717
 Factory Class for Customer
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer (String custId, String firstName, String lastName){

        if(Helper.isNullorEmpty(custId) || Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName))
            return null;

        return new Customer.Builder()
                .setCustId(custId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
