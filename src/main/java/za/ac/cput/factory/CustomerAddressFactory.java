/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.CustomerAddress;
import za.ac.cput.util.Helper;

public class CustomerAddressFactory {
    public static CustomerAddress createCustomerAddress (String houseNo, String streetName, String suburb, long postalCode) {
        if (Helper.isNullorEmpty(houseNo) || Helper.isNullorEmpty(streetName) ||Helper.isNullorEmpty(suburb) ||Helper.isNullorEmpty(String.valueOf(postalCode))){
            return null;
        }
        String customerAddressID = Helper.generateUserID();

        return new CustomerAddress.Builder().setAddress_ID(customerAddressID)
                .setHouse_No(houseNo)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setPostal_code(String.valueOf(postalCode))
                .build();
    }
}
