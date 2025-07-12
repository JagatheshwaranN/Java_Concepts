package com.app.match.dao;

import com.app.match.model.UserAccount;

import java.util.*;

public class UserAccountDAOImpl implements UserAccountDAO {

    Map<Integer, UserAccount> userAccountMap = new HashMap<>();


    @Override
    public void save(UserAccount userAccount) {
        userAccountMap.put(userAccount.getId(), userAccount);
    }

    @Override
    public UserAccount findById(int id) {
        return userAccountMap.get(id);
    }

    @Override
    public List<UserAccount> findAll() {
        return new ArrayList<>(userAccountMap.values());
    }

    @Override
    public List<UserAccount> findMatches(int age, String state) {
        Collection<UserAccount> userAccounts = userAccountMap.values();
        ArrayList<UserAccount> matches = new ArrayList<>();
        for(UserAccount user : userAccounts) {
            if(user.getAge() == age && user.getState().equals(state)) {
                matches.add(user);
            }
        }
        return matches;
    }

    @Override
    public void delete(int id) {
        userAccountMap.remove(id);
    }

}
