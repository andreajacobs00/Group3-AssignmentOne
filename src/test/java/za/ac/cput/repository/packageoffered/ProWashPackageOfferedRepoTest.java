/** ProWashPackageOfferedReopTest.java
 *  This is a test for the repository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.packageoffered.ProWashPackageOffered;
import za.ac.cput.factory.packagesoffered.ProWashPackageOfferedFactory;

import static org.junit.jupiter.api.Assertions.*;

class ProWashPackageOfferedRepoTest {
    private static ProWashPackageOfferedRepo repo = ProWashPackageOfferedRepo.getRepo();
    private static ProWashPackageOffered pro = ProWashPackageOfferedFactory.createProWashPackageOffered("Pro Wash", "Hand wash, to soft brush detailing, waxing, polishing, wheel cleaning\",", 1250.00);

    @Test
    void create() {
        ProWashPackageOffered proCreate =repo.create(pro);
        assertEquals(pro.getPackageId(), proCreate.getPackageId());
        System.out.println("Pro WashPackage created: " + proCreate);
    }

    @Test
    void read() {
        ProWashPackageOffered proRead = repo.read(pro.getPackageId());
        assertNotNull(proRead);
        System.out.println("Pro Wash Packaege read: " + proRead);
    }

    @Test
    void update() {
        ProWashPackageOffered proUpdate = new ProWashPackageOffered.Builder().copy(pro).setPackageId("654321")
                .build();
        assertNotNull(repo.update(proUpdate));
        System.out.println("Pro Wash Package updated: " + proUpdate);
    }

    @Test
    void delete() {
        boolean success = repo.delete((pro.getPackageId()));
        assertTrue(success);
        System.out.println("Rewards deleted: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Show all: " + repo.getAll());
    }


}