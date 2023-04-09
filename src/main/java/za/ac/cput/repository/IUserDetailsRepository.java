package za.ac.cput.repository;

import za.ac.cput.domain.UserDetails;

import java.util.Set;

public interface IUserDetailsRepository extends IRepository <UserDetails, String> {
    public Set<UserDetails> getAll();
}
