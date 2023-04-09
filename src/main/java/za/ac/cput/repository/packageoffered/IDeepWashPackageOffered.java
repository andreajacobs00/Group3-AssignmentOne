/** DeepCleanPackageOffered.java
 *  This is an interface class the inherits from IRepository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.DeepWashPackageOffered;
import java.util.Set;

public interface IDeepWashPackageOffered extends IRepository<DeepWashPackageOffered, String> {
    public Set<DeepWashPackageOffered> getAll();
}
