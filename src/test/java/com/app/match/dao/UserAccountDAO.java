package com.app.match.dao;

import com.app.match.model.UserAccount;

import java.util.List;

public interface UserAccountDAO {

    void save(UserAccount userAccount);

    UserAccount findById(int id);

    List<UserAccount> findAll();

    List<UserAccount> findMatches(int age, String state);

    void delete(int id);
}
