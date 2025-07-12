package com.app.match.controller;

import com.app.match.dao.UserAccountDAO;
import com.app.match.dao.UserAccountDAOImpl;
import com.app.match.model.Interest;
import com.app.match.model.UserAccount;

public class UserAccountController {

    public static void main(String[] args) {
        UserAccountController controller = new UserAccountController();
        controller.registerUser();
        controller.findAllUsers();
        controller.findMatchUsers();
    }

    public void registerUser() {
        UserAccountDAO userAccountDAO = new UserAccountDAOImpl();
        UserAccount userAccount = getUserAccount();
        userAccountDAO.save(userAccount);
        System.out.println(userAccountDAO.findById(1));
    }

    public void findAllUsers() {
        UserAccountDAO userAccountDAO = new UserAccountDAOImpl();
        createUser(userAccountDAO);
        userAccountDAO.delete(1);
        System.out.println(userAccountDAO.findAll());
    }

    public void findMatchUsers() {
        UserAccountDAO userAccountDAO = new UserAccountDAOImpl();
        createUser(userAccountDAO);
        System.out.println(userAccountDAO.findMatches(30, "TN"));
    }

    public void createUser(UserAccountDAO userAccountDAO) {
        UserAccount userAccount = getUserAccount();
        userAccountDAO.save(userAccount);
        UserAccount userAccount2 = new UserAccount();
        userAccount2.setId(2);
        userAccount2.setUserName("Alex");
        userAccount2.setAge(30);
        userAccount2.setGender("M");
        userAccount2.setEmailId("alex@test.com");
        userAccount2.setPhoneNumber("9876543210");
        userAccount2.setPassword("Allow@me");
        userAccount2.setCity("BLR");
        userAccount2.setState("KA");
        Interest interest2 = new Interest();
        interest2.setId(1);
        interest2.setLikes("Cricket");
        interest2.setDislikes("Laziness");
        interest2.setAbout("Comedian");
        interest2.setProfileUrl("www.alex.com");
        interest2.setHobbies("Chitchat");
        userAccount2.setInterest(interest2);
        userAccountDAO.save(userAccount2);
    }

    private static UserAccount getUserAccount() {
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setUserName("John");
        userAccount.setAge(30);
        userAccount.setGender("M");
        userAccount.setEmailId("john@test.com");
        userAccount.setPhoneNumber("9876543210");
        userAccount.setPassword("Allow@me");
        userAccount.setCity("MAS");
        userAccount.setState("TN");
        Interest interest = new Interest();
        interest.setId(1);
        interest.setLikes("Painting");
        interest.setDislikes("Nothing");
        interest.setAbout("Perfect");
        interest.setProfileUrl("www.john.com");
        interest.setHobbies("Gym");
        userAccount.setInterest(interest);
        return userAccount;
    }

}
