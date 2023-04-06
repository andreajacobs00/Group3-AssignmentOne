/** DeepWashPackageOfferedFactory.java
 *  This is a factory class
 *  Andrea Jacobs 218024266
 *  06 April 2023 */

package za.ac.cput.factory.packagesoffered;

import za.ac.cput.domain.packageoffered.DeepWashPackageOffered;
import za.ac.cput.util.Helper;

public class DeepWashPackageOfferedFactory {
    public static DeepWashPackageOffered deepWashPackageOffered(String packageName, String packageDescription, double price) {
        if (Helper.isNullOrEmpty(packageName) || (Helper.isNullOrEmpty(packageDescription) || (Helper.isNullOrEmpty(String.valueOf(price))))) {
            return null;
        }

        String packageId = Helper.generateId();

        return new DeepWashPackageOffered.Builder().setPackageId(packageId)
                .setPackageName(packageName)
                .setPackageDescription(packageDescription)
                .setPackagePrice(price)
                .build();
    }
}
