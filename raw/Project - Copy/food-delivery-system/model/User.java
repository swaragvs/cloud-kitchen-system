package model;

import java.io.Serializable;
import java.util.LinkedList;

public class User implements Serializable {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private LinkedList<Order> orderHistory;

    public User(String userId, String name, String email, String password, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.orderHistory = new LinkedList<>();
    }

    // Getters and setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public LinkedList<Order> getOrderHistory() { return orderHistory; }
    public void setOrderHistory(LinkedList<Order> orderHistory) { this.orderHistory = orderHistory; }
}
