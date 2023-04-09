/** IRewards.java
 *  This is an interface the inherits from IRepository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.loyaltypoints;

import za.ac.cput.domain.loyaltypoints.Rewards;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IRewards extends IRepository<Rewards, String> {
    public Set<Rewards> getAll();
}
