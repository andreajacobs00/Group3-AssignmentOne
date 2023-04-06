/** PackagesOfferedFactory.java
 *  This is a factory class
 *  Andrea Jacobs 218024266
 *  06 April 2023 */

package za.ac.cput.factory.packagesoffered;

import za.ac.cput.domain.packagesoffered.PackagesOffered;
import za.ac.cput.util.Helper;

public class PackagesOfferedFactory {
    public static PackagesOffered packagesOffered(String packageDescription) {
        String packageId = Helper.generateId();

        return new PackagesOffered.Builder().setPackageId(packageId)
                .setPackageDescription(packageDescription)
                .build();
    }
}
