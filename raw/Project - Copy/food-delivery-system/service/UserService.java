package service;

import model.User;
import util.FileUtil;

import java.util.HashMap;

public class UserService {
    private HashMap<String, User> users;

    public UserService() {
        users = FileUtil.loadUsers();
    }

    public void registerUser(String userId, String name, String email, String password, String address) {
        User user = new User(userId, name, email, password, address);
        users.put(userId, user);
        FileUtil.saveUsers(users);
    }

    public User loginUser(String email, String password) {
        for (User user : users.values()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    // Other methods to manage user data
}
