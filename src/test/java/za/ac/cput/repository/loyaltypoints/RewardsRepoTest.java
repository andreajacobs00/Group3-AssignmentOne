/** RewardsRepoTest.java
 *  This is a test class for the repository
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.loyaltypoints;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.loyaltypoints.Rewards;
import za.ac.cput.factory.loyaltypoints.RewardsFactory;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.domain.loyaltypoints.Tier.BRONZE;

class RewardsRepoTest {
    private static RewardsRepo repo = RewardsRepo.getRepo();
    private static Customer customerId;
    private static Rewards rewards = RewardsFactory.createRewards(BRONZE, customerId, 10);

    @Test
    void create() {
        Rewards rewardsCreate =repo.create(rewards);
        assertEquals(rewards.getRewardsId(), rewardsCreate.getRewardsId());
        System.out.println("Rewards created: " + rewardsCreate);
    }

    @Test
    void read() {
        Rewards rewardsRead = repo.read(rewards.getRewardsId());
        assertNotNull(rewardsRead);
        System.out.println("Rewards read: " + rewardsRead);
    }

    @Test
    void update() {
        Rewards rewardsUpdate = new Rewards.Builder().copy(rewards).setRewardsId("654321")
                .build();
        assertNotNull(repo.update(rewardsUpdate));
        System.out.println("Rewards updated: " + rewardsUpdate);
    }

    @Test
    void delete() {
        boolean success = repo.delete((rewards.getRewardsId()));
        assertTrue(success);
        System.out.println("Rewards deleted: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Show all: " + repo.getAll());
    }
}