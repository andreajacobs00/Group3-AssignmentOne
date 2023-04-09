/** PackageOfferedRepo.java
 *  This is the repository class
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.PackageOffered;

import java.util.HashSet;
import java.util.Set;

public class PackageOfferedRepo implements IPackageOffered {
    private static PackageOfferedRepo repo = null;
    private Set<PackageOffered> packageOfferedDb = null;

    private PackageOfferedRepo() {
        packageOfferedDb = new HashSet<PackageOffered>();
    }

    public static PackageOfferedRepo getRepo() {
        if (repo == null) {
            repo = new PackageOfferedRepo();
        }
        return repo;
    }

    @Override
    public PackageOffered create(PackageOffered packageOffered) {
        boolean success = packageOfferedDb.add(packageOffered);
        if (!success)
            return null;
        return packageOffered;
    }

    @Override
    public PackageOffered read (String packageId) {
        PackageOffered packageOffered = packageOfferedDb.stream().filter(c -> c.getPackageId().equals(packageId))
                .findAny()
                .orElse(null);
        return packageOffered;
    }

    @Override
    public PackageOffered update(PackageOffered packageOffered) {
        PackageOffered oldPackageOffered = read(packageOffered.getPackageId());

        if(oldPackageOffered != null) {
            packageOfferedDb.remove(oldPackageOffered);
            packageOfferedDb.add(packageOffered);
            return packageOffered;
        }
        else {
            packageOfferedDb.add(packageOffered);
            return packageOffered;
        }
    }

    @Override
    public boolean delete (String packageId) {
        PackageOffered packageOfferedRemove = read(packageId);
        if(packageOfferedRemove == null) {
            return false;
        }
        packageOfferedDb.remove(packageOfferedRemove);
        return true;
    }


    public Set<PackageOffered> getAll() {
        return packageOfferedDb;
    }
}
