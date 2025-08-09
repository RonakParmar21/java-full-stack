/*
    - why we create UserService
        -> where we need to mapping for user so use this user services
 */

import java.util.HashMap;
import java.util.Map;

public class UserSearvice {
    private Map<String, User> userMap = new HashMap<>();
    private User currentUser = null;

    public boolean registerUser(String userName, String userPassword, String userFullName, String userContact) {
        if(userMap.containsKey(userName)) {
            System.out.println("User name is already exists, please choose another");
            return false;
        }

        User user = new User(userName, userPassword, userFullName, userContact);
        userMap.put(userName, user);
        System.out.println("Registration Successfull!");

        return true;
    }

    public boolean loginUser(String userName, String userPassword) {
        if(!userMap.containsKey(userName)) {
            System.out.println("No user found with this username");
            return false;
        }

        User user = userMap.get(userName);
        if(!user.getPassword().equals(userPassword)) {
            System.out.println("Incorrect password");
            return false;
        }

        currentUser = user;
        System.out.println("Welcome : " + currentUser.getFullName());
        return true;
    }

    public void logoutUser() {
        if(currentUser != null) {
            System.out.println("Logged out : " + currentUser.getUserName());
            currentUser = null;
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}
