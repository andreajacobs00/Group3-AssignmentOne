/** BasicCleanPackageOfferedRepoTest.java
 *  This is a test for repository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;
import za.ac.cput.domain.packageoffered.PackageOffered;
import za.ac.cput.factory.packagesoffered.BasicCleanPackageOfferedFactory;

import static org.junit.jupiter.api.Assertions.*;

class BasicCleanPackageOfferedRepoTest {
    private static BasicCleanPackageOfferedRepo repo = BasicCleanPackageOfferedRepo.getRepo();
    private static BasicCleanPackageOffered basic = BasicCleanPackageOfferedFactory
            .createBasicCleanPackageOffered("Basic Clean", "Basic wash, wheel clean, clear coat protector, rust protection", 150.00);

    @Test
    void create() {
        BasicCleanPackageOffered basicCreate =repo.create(basic);
        assertEquals(basic.getPackageId(), basicCreate.getPackageId());
        System.out.println("Basic Package created: " + basicCreate);
    }

    @Test
    void read() {
        BasicCleanPackageOffered basicRead = repo.read(basic.getPackageId());
        assertNotNull(basicRead);
        System.out.println("Basic Package read: " + basicRead);
    }

    @Test
    void update() {
        BasicCleanPackageOffered basicUpdate = new BasicCleanPackageOffered.Builder().copy(basic).setPackageId("654321")
                .build();
        assertNotNull(repo.update(basicUpdate));
        System.out.println("Rewards updated: " + basicUpdate);
    }

    @Test
    void delete() {
        boolean success = repo.delete((basic.getPackageId()));
        assertTrue(success);
        System.out.println("Basic Package deleted: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Show all: " + repo.getAll());
    }
}
