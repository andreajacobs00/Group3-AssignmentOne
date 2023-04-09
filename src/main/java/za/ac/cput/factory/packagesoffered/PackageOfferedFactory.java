/** PackagesOfferedFactory.java
 *  This is a factory class
 *  Andrea Jacobs 218024266
 *  06 April 2023 */

package za.ac.cput.factory.packagesoffered;

import za.ac.cput.domain.packageoffered.PackageOffered;
import za.ac.cput.util.Helper;

public class PackageOfferedFactory {
    public static PackageOffered createPackagesOffered(String packageDescription) {
        String packageId = Helper.generateUserID();

        return new PackageOffered.Builder().setPackageId(packageId)
                .setPackageDescription(packageDescription)
                .build();
    }
}
