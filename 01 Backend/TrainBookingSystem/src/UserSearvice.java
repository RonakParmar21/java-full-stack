import java.util.HashMap;
import java.util.Map;

public class UserSearvice {
    // username --> user
    private Map<String, User> userMap = new HashMap<>();
    private User currentUser = null;

    public boolean registerUser(String userName, String password, String fullName, String contact) {
        if(userMap.containsKey(userName)) {
            System.out.println("User name already exists. Please choose another");
            return false;
        }

        User user = new User(userName, password, fullName, contact);
        userMap.put(userName, user);
        System.out.println("User register successfully...");
        return true;
    }

    public boolean loginuser(String username, String password) {
        if(!userMap.containsKey(username)) {
            System.out.println("No user found with this username");
            return false;
        }

        User user = userMap.get(username);

        if(!user.getPassword().equals(password)) {
            System.out.println("Incorrect password");
            return false;
        }
        currentUser = user;
        System.out.println("Welcome " + currentUser.getFullName() + "!");
        return true;
    }

    public void logoutUser() {
        if(currentUser != null) {
            System.out.println("Logged out : " + currentUser.getFullName());
        }
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}
