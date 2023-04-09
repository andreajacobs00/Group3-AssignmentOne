/** PackageOfferedFactoryTest.java
 *  This is a test class
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.factory.packagesoffered;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;
import za.ac.cput.domain.packageoffered.DeepWashPackageOffered;
import za.ac.cput.domain.packageoffered.ProWashPackageOffered;


import static org.junit.jupiter.api.Assertions.*;

class PackageOfferedFactoryTest {
    @Test
    public void testBasicPackageOffered() {
        BasicCleanPackageOffered basic = BasicCleanPackageOfferedFactory.createBasicCleanPackageOffered("Basic Clean Option", "Basic wash, wheel clean, clear coat protector, rust protection", 150.00);
        System.out.println(basic.toString());
        assertNotNull(basic);
    }

    @Test
    public void testDeepCleanPackageOffered() {
        DeepWashPackageOffered deep = DeepWashPackageOfferedFactory.createDeepWashPackageOffered("Deep Clean Option", "Basic wash, Nano Ceramic Wash, All Purpose Cleaner, One Step Swirl & Scratch Remover, All Purpose Cleaner", 550.00);
        System.out.println(deep.toString());
        assertNotNull(deep);
    }

    @Test
    public void testProWashPackageOffered() {
        ProWashPackageOffered pro = ProWashPackageOfferedFactory.createProWashPackageOffered("Deep Clean Option", "Hand wash, to soft brush detailing, waxing, polishing, wheel cleaning", 1250.00);
        System.out.println(pro.toString());
        assertNotNull(pro);
    }

}