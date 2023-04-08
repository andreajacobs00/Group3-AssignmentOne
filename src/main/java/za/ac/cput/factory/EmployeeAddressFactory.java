/** EmployeeAddressFactory.java
 *  This class sets the factory functionality of the program
 * Cebisani Lamani (219104409)
 * 22 March 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.util.Helper;

public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(Employee employee_ID, String house_No, String street_Name, String suburb, String postal_Code){
        if(Helper.isNullorEmpty(house_No) || Helper.isNullorEmpty(street_Name) || Helper.isNullorEmpty(suburb) || Helper.isNullorEmpty(postal_Code)){
            return null;
        }

        String address_ID = Helper.generateID().toString();

        return new EmployeeAddress.Builder()
                .setAddress_ID(address_ID)
                .setEmployee(employee_ID)
                .setHouse_No(house_No)
                .setStreet_Name(street_Name)
                .setSuburb(suburb)
                .setPostal_Code(postal_Code)
                .build();
    }
}