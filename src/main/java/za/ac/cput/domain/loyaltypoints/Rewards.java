/** Rewards.java
 *  This is a POJO class
 *  Andrea Jacobs 218024266
 *  04 April 2023 */

package za.ac.cput.domain.loyaltypoints;

import za.ac.cput.domain.Customer;

import java.util.Objects;

public class Rewards {
    private Tier tier;
    private String rewardsId;

    private Customer customerId;

    private int points;

    public Rewards() {}

    private Rewards(Builder builder) {
        this.tier = builder.tier;
        this.rewardsId = builder.rewardsId;
        this.points = builder.points;
        this.customerId = builder.customerId;
    }


    public Tier getTier() {
        return tier;
    }

    public String getRewardsId() {
        return rewardsId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rewards rewards = (Rewards) o;
        return Objects.equals(rewardsId, rewards.rewardsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewardsId);
    }

    @Override
    public String toString() {
        return "Rewards{" +
                "tier=" + tier +
                ", rewardsId='" + rewardsId + '\'' +
                ", customerId=" + customerId +
                ", points=" + points +
                '}';
    }

    public static class Builder {
        private Tier tier;
        private String rewardsId;
        private Customer customerId;
        private int points;

        public Builder setTier(Tier tier) {
            this.tier = tier;
            return this;
        }

        public Builder setRewardsId(String rewardsId) {
            this.rewardsId = rewardsId;
            return this;
        }

        public Builder setCustomerId(Customer customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setPoints(int points) {
            this.points = points;
            return this;
        }

        public Rewards build() {
            return new Rewards(this);
        }

        public Builder copy (Rewards rewards) {
            this.tier = rewards.tier;
            this.rewardsId = rewards.rewardsId;
            this.customerId = rewards.customerId;
            this.points = rewards.points;
            return null;
        }
    }
}
