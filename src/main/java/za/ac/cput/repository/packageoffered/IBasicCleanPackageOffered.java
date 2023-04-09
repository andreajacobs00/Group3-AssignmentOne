/** IBasicCleanPackageOffered.java
 *  This is an interface class the inherits from IRepository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;
import java.util.Set;

public interface IBasicCleanPackageOffered extends IRepository<BasicCleanPackageOffered, String> {
    public Set<BasicCleanPackageOffered> getAll();
}
