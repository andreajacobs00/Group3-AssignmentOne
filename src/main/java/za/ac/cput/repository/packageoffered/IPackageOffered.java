/** IPackagesOffered.java
 *  This is an interface class the inherits from IRepository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.PackageOffered;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IPackageOffered extends IRepository<PackageOffered, String> {
    public Set<PackageOffered> getAll();
}
