/** Helper.java
 *  This class does all functionality
 *  Andrea Jacobs 218024266
 *  06 April 2023 */

package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
