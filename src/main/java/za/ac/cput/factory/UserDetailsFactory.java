/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.UserDetails;
import za.ac.cput.util.Helper;

public class UserDetailsFactory {
    public static UserDetails createUser( String dateOfReg, String loginDate, String password) {

        if (Helper.isNullorEmpty(dateOfReg) || Helper.isNullorEmpty(loginDate) || Helper.isNullorEmpty(password)) {
            return null;
        }
        String userID = Helper.generateUserID();

        return new UserDetails.Builder().setUserID(userID)
                .setDateOfReg(dateOfReg)
                .setLoginDate(loginDate)
                .setPassword(password)
                .build();
    }
}
