/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 04 April 2023
 */
package za.ac.cput.util;

import java.util.UUID;

public class Helper {

    public static boolean isNullorEmpty(String i) {
        return (i == null || i.isEmpty() || i == " ");

    }

    public static String generateUserID() {
        return UUID.randomUUID().toString();
    }
}
