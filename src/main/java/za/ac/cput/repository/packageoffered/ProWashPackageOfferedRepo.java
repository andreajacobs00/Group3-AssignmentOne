/** ProWashPackageOfferedRepo.java
 *  This is a repository class
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;
import za.ac.cput.domain.packageoffered.ProWashPackageOffered;

import java.util.HashSet;
import java.util.Set;

public class ProWashPackageOfferedRepo implements IProWashPackageOffered {
    private static ProWashPackageOfferedRepo repo = null;
    private Set<ProWashPackageOffered> proWashPackageOfferedDb = null;

    private ProWashPackageOfferedRepo() {
        proWashPackageOfferedDb = new HashSet<ProWashPackageOffered>();
    }

    public static ProWashPackageOfferedRepo getRepo() {
        if (repo == null) {
            repo = new ProWashPackageOfferedRepo();
        }
        return repo;
    }

    @Override
    public ProWashPackageOffered create(ProWashPackageOffered proWashPackageOffered) {
        boolean success = proWashPackageOfferedDb.add(proWashPackageOffered);
        if (!success)
            return null;
        return proWashPackageOffered;
    }

    @Override
    public ProWashPackageOffered read (String packageId) {
        ProWashPackageOffered proWashPackageOffered = proWashPackageOfferedDb.stream().filter(c -> c.getPackageId().equals(packageId))
                .findAny()
                .orElse(null);
        return proWashPackageOffered;
    }

    @Override
    public ProWashPackageOffered update(ProWashPackageOffered proWashPackageOffered) {
        ProWashPackageOffered oldProWashPackage = read(proWashPackageOffered.getPackageId());

        if(oldProWashPackage != null) {
            proWashPackageOfferedDb.remove(oldProWashPackage);
            proWashPackageOfferedDb.add(proWashPackageOffered);
            return proWashPackageOffered;
        }
        else {
            proWashPackageOfferedDb.add(proWashPackageOffered);
            return proWashPackageOffered;
        }
    }

    @Override
    public boolean delete (String packageId) {
        ProWashPackageOffered proWashPackageOfferedRemove = read(packageId);
        if(proWashPackageOfferedRemove == null) {
            return false;
        }
        proWashPackageOfferedDb.remove(proWashPackageOfferedRemove);
        return true;
    }


    public Set<ProWashPackageOffered> getAll() {
        return proWashPackageOfferedDb;
    }
}
