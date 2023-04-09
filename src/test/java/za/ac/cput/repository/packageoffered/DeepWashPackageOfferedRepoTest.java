/** DeepWashPackageOfferedRepoTest.java
 *  This is a test for repository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.packageoffered.DeepWashPackageOffered;
import za.ac.cput.domain.packageoffered.ProWashPackageOffered;
import za.ac.cput.factory.packagesoffered.DeepWashPackageOfferedFactory;
import za.ac.cput.factory.packagesoffered.ProWashPackageOfferedFactory;

import static org.junit.jupiter.api.Assertions.*;

class DeepWashPackageOfferedRepoTest {
    private static DeepWashPackageOfferedRepo repo = DeepWashPackageOfferedRepo.getRepo();
    private static DeepWashPackageOffered deep = DeepWashPackageOfferedFactory.createDeepWashPackageOffered("Deep Wash Package", "Basic wash, Nano Ceramic Wash, All Purpose Cleaner, One Step Swirl & Scratch Remover, All Purpose Cleaner", 550.00);

    @Test
    void create() {
        DeepWashPackageOffered deepCreate =repo.create(deep);
        assertEquals(deep.getPackageId(), deepCreate.getPackageId());
        System.out.println("Deep Wash Package created: " + deepCreate);
    }

    @Test
    void read() {
        DeepWashPackageOffered deepRead = repo.read(deep.getPackageId());
        assertNotNull(deepRead);
        System.out.println("Deep Wash Package read: " + deepRead);
    }

    @Test
    void update() {
        DeepWashPackageOffered deepUpdate = new DeepWashPackageOffered.Builder().copy(deep).setPackageId("654321")
                .build();
        assertNotNull(repo.update(deepUpdate));
        System.out.println("Deep Wash Package updated: " + deepUpdate);
    }

    @Test
    void delete() {
        boolean success = repo.delete((deep.getPackageId()));
        assertTrue(success);
        System.out.println("Deep Wash deleted: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Show all: " + repo.getAll());
    }


}
