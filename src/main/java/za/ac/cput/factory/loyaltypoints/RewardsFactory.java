/** RewardsFactory.java
 *  This is a factory class
 *  Andrea Jacobs 218024266
 *  06 April 2023 */

package za.ac.cput.factory.loyaltypoints;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.loyaltypoints.*;
import za.ac.cput.util.Helper;

public class RewardsFactory {
    public static Rewards createRewards(Tier tier, Customer customerId, int points) {
        String rewardsId = Helper.generateId();

        return new Rewards.Builder().setTier(tier)
                .setRewardsId(rewardsId)
                .setCustomerId(customerId)
                .setPoints(points)
                .build();
    }
}
