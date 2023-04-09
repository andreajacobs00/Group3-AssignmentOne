/** BasicCleanPackageOfferedRepo.java
 * This is a repository class
 * Andrea Jacobs 218024266
 * 09 April 202 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;

import java.util.HashSet;
import java.util.Set;

public class BasicCleanPackageOfferedRepo implements IBasicCleanPackageOffered {
    private static BasicCleanPackageOfferedRepo repo = null;
    private Set<BasicCleanPackageOffered> basicCleanPackageOfferedDb = null;

    private BasicCleanPackageOfferedRepo() {
        basicCleanPackageOfferedDb = new HashSet<BasicCleanPackageOffered>();
    }

    public static BasicCleanPackageOfferedRepo getRepo() {
        if (repo == null) {
            repo = new BasicCleanPackageOfferedRepo();
        }
        return repo;
    }

    @Override
    public BasicCleanPackageOffered create(BasicCleanPackageOffered basicCleanPackageOffered) {
        boolean success = basicCleanPackageOfferedDb.add(basicCleanPackageOffered);
        if (!success)
            return null;
        return basicCleanPackageOffered;
    }

    @Override
    public BasicCleanPackageOffered read (String packageId) {
        BasicCleanPackageOffered basicCleanPackageOffered = basicCleanPackageOfferedDb.stream().filter(c -> c.getPackageId().equals(packageId))
                .findAny()
                .orElse(null);
        return basicCleanPackageOffered;
    }

    @Override
    public BasicCleanPackageOffered update(BasicCleanPackageOffered basicCleanPackageOffered) {
        BasicCleanPackageOffered oldbasicCleanPackage = read(basicCleanPackageOffered.getPackageId());

        if(oldbasicCleanPackage != null) {
            basicCleanPackageOfferedDb.remove(oldbasicCleanPackage);
            basicCleanPackageOfferedDb.add(basicCleanPackageOffered);
            return basicCleanPackageOffered;
        }
        else {
            basicCleanPackageOfferedDb.add(basicCleanPackageOffered);
            return basicCleanPackageOffered;
        }
    }

    @Override
    public boolean delete (String packageId) {
        BasicCleanPackageOffered basicCleanPackageOfferedRemove = read(packageId);
        if(basicCleanPackageOfferedRemove == null) {
            return false;
        }
        basicCleanPackageOfferedDb.remove(basicCleanPackageOfferedRemove);
        return true;
    }


    public Set<BasicCleanPackageOffered> getAll() {
        return basicCleanPackageOfferedDb;
    }
}
