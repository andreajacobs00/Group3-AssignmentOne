/** Helper.java
 *  This class does all functionality
 *  Andrea Jacobs 218024266
 *  06 April 2023 */

package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String str) {
        if(str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
