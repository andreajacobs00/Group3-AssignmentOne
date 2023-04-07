/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 04 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.UserDetails;
import za.ac.cput.util.Helper;

public class UserDetailsFactory {
    public static UserDetails createUser(String userID, String dateOfReg, String loginDate, String password) {

        if (Helper.isNullorEmpty(dateOfReg) || Helper.isNullorEmpty(loginDate)) {
            return null;
        }
        userID = Helper.generateUserID();

        return new UserDetails.Builder().setUserID(userID)
                .setDateOfReg(dateOfReg)
                .setLoginDate(loginDate)
                .setPassword(password)
                .build();
    }

}
