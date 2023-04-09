/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.UserDetails;
import za.ac.cput.util.Helper;

public class UserDetailsFactory {
    public static UserDetails createUser( Customer cust_ID, String dateOfReg, String loginDate, String password) {

        if (Helper.isNullorEmpty(dateOfReg) || Helper.isNullorEmpty(loginDate) || Helper.isNullorEmpty(password)) {
            return null;
        }
        String userID = Helper.generateUserID();
        //cust_ID = Helper.generateUserID();

        return new UserDetails.Builder().setUserID(userID)
                .setCust_ID(cust_ID)
                .setDateOfReg(dateOfReg)
                .setLoginDate(loginDate)
                .setPassword(password)
                .build();
    }
}
