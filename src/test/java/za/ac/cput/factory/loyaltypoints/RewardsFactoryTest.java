/** RewardsFactoryTest.java
 *  This is a test class
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.factory.loyaltypoints;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.loyaltypoints.Rewards;
import za.ac.cput.factory.CustomerFactory;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.domain.loyaltypoints.Tier.BRONZE;

class RewardsFactoryTest {
    @Test
    public void createRewardsMember() {
        Customer customer = CustomerFactory.createCustomer("123456", "Andrea", "Jacobs");
        Rewards rewards = RewardsFactory.createRewards(BRONZE, customer, 5);
        System.out.println(rewards.toString());
        assertNotNull(rewards);
    }


    }