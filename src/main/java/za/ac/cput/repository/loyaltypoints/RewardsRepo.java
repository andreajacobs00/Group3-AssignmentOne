/** RewardsRepo.java
 * This is a repository class
 * Andrea Jacobs 218024266
 * 09 April 2023 */

package za.ac.cput.repository.loyaltypoints;

import za.ac.cput.domain.loyaltypoints.Rewards;
import za.ac.cput.domain.packageoffered.BasicCleanPackageOffered;
import za.ac.cput.repository.packageoffered.BasicCleanPackageOfferedRepo;

import java.util.HashSet;
import java.util.Set;

public class RewardsRepo implements IRewards{
    private static RewardsRepo repo = null;
    private Set<Rewards> rewardsDb = null;

    private RewardsRepo() {
        rewardsDb = new HashSet<Rewards>();
    }

    public static RewardsRepo getRepo() {
        if (repo == null) {
            repo = new RewardsRepo();
        }
        return repo;
    }

    public Rewards create(Rewards rewards) {
        boolean success = rewardsDb.add(rewards);
        if (!success)
            return null;
        return rewards;
    }

    @Override
    public Rewards read (String rewardsId) {
        Rewards rewards = rewardsDb.stream().filter(c -> c.getRewardsId().equals(rewardsId))
                .findAny()
                .orElse(null);
        return rewards;
    }

    @Override
    public Rewards update(Rewards rewards) {
        Rewards oldRewards = read(rewards.getRewardsId());
        if(oldRewards != null) {
            rewardsDb.remove(oldRewards);
            rewardsDb.add(rewards);
            return rewards;
        }
        else {
            rewardsDb.add(rewards);
            return rewards;
        }
    }

    @Override
    public boolean delete (String rewardsId) {
        Rewards rewardsRemove = read(rewardsId);
        if(rewardsRemove == null) {
            return false;
        }
        rewardsDb.remove(rewardsRemove);
        return true;
    }


    public Set<Rewards> getAll() {
        return rewardsDb;
    }
}

