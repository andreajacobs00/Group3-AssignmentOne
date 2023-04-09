/** IProWashPackageOffered.java
 *  This is an interface class the inherits from IRepository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

import za.ac.cput.domain.packageoffered.ProWashPackageOffered;
import java.util.Set;

public interface IProWashPackageOffered extends IRepository<ProWashPackageOffered, String> {
    public Set<ProWashPackageOffered> getAll();
}
