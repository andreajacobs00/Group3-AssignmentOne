package za.ac.cput.repository;

import za.ac.cput.domain.UserDetails;

import java.util.HashSet;
import java.util.Set;

public class UserDetailsRepository implements IUserDetailsRepository {
    private static UserDetailsRepository repo = null;
    private Set<UserDetails> userDetailsDB = null;

    public UserDetailsRepository() {
       userDetailsDB = new HashSet<UserDetails>();
    }

    public static UserDetailsRepository getRepo() {
        if (repo == null) {
            repo = new UserDetailsRepository();
        }
        return repo;
    }

    @Override
    public UserDetails create(UserDetails userDetails) {
        boolean success = userDetailsDB.add(userDetails);
        if (!success) {
            return null;
        }
        return userDetails;
    }

    @Override
    public UserDetails read(String userID) {
        for (UserDetails ud : userDetailsDB) {
            if (ud.getUserID().equals(userID)) {
                return ud;
            }
        }
        return null;
    }

    @Override
    public UserDetails update(UserDetails userDetails) {
        UserDetails oldUser = read(userDetails.getUserID());
        if (oldUser != null) {
            userDetailsDB.remove(oldUser);
            userDetailsDB.add(userDetails);
            return userDetails;
        }
        return null;
    }

    @Override
    public boolean delete(String userID) {
        UserDetails userToDelete = read(userID);
        if (userToDelete == null) {
            return false;
        }
        userDetailsDB.remove(userToDelete);
        return true;
    }

    @Override
    public Set<UserDetails> getAll() {
        return userDetailsDB;
    }
}
