/** DeepWashPackageOfferedRepo.java
 *  This is a repository class
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;
import za.ac.cput.domain.packageoffered.DeepWashPackageOffered;

import java.util.HashSet;
import java.util.Set;

public class DeepWashPackageOfferedRepo implements IDeepWashPackageOffered {
    private static DeepWashPackageOfferedRepo repo = null;
    private Set<DeepWashPackageOffered> deepWashPackageOfferedDb = null;

    private DeepWashPackageOfferedRepo() {
        deepWashPackageOfferedDb = new HashSet<DeepWashPackageOffered>();
    }

    public static DeepWashPackageOfferedRepo getRepo() {
        if (repo == null) {
            repo = new DeepWashPackageOfferedRepo();
        }
        return repo;
    }

    @Override
    public DeepWashPackageOffered create(DeepWashPackageOffered deepWashPackageOffered) {
        boolean success = deepWashPackageOfferedDb.add(deepWashPackageOffered);
        if (!success)
            return null;
        return deepWashPackageOffered;
    }

    @Override
    public DeepWashPackageOffered read (String packageId) {
        DeepWashPackageOffered deepWashPackageOffered = deepWashPackageOfferedDb.stream().filter(c -> c.getPackageId().equals(packageId))
                .findAny()
                .orElse(null);
        return deepWashPackageOffered;
    }

    @Override
    public DeepWashPackageOffered update(DeepWashPackageOffered deepWashPackageOffered) {
        DeepWashPackageOffered oldDeepWashPackage = read(deepWashPackageOffered.getPackageId());

        if(oldDeepWashPackage != null) {
            deepWashPackageOfferedDb.remove(oldDeepWashPackage);
            deepWashPackageOfferedDb.add(deepWashPackageOffered);
            return deepWashPackageOffered;
        }
        else {
            deepWashPackageOfferedDb.add(deepWashPackageOffered);
            return deepWashPackageOffered;
        }
    }

    @Override
    public boolean delete (String packageId) {
        DeepWashPackageOffered deepWashPackageOfferedRemove = read(packageId);
        if(deepWashPackageOfferedRemove == null) {
            return false;
        }
        deepWashPackageOfferedDb.remove(deepWashPackageOfferedRemove);
        return true;
    }

    public Set<DeepWashPackageOffered> getAll() {
        return deepWashPackageOfferedDb;
    }
}
