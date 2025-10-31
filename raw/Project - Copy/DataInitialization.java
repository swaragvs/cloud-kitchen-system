package main;

import util.FileUtil;
import model.User;
import model.Restaurant;
import model.Order;
import model.DeliveryPerson;
import model.MenuItem;

import java.util.HashMap;

public class DataInitialization {
    public static void main(String[] args) {
        createFiles();
    }

    private static void createFiles() {
        createUsersFile();
        createRestaurantsFile();
        createOrdersFile();
        createDeliveryPeopleFile();
        // Uncomment the line below if you want to create the menu_items.ser file
        // createMenuItemsFile();
    }

    private static void createUsersFile() {
        HashMap<String, User> users = new HashMap<>();
        FileUtil.saveUsers(users);
        System.out.println("Created users.ser file.");
    }

    private static void createRestaurantsFile() {
        HashMap<String, Restaurant> restaurants = new HashMap<>();
        FileUtil.saveRestaurants(restaurants);
        System.out.println("Created restaurants.ser file.");
    }

    private static void createOrdersFile() {
        HashMap<String, Order> orders = new HashMap<>();
        FileUtil.saveOrders(orders);
        System.out.println("Created orders.ser file.");
    }

    private static void createDeliveryPeopleFile() {
        HashMap<String, DeliveryPerson> deliveryPeople = new HashMap<>();
        FileUtil.saveDeliveryPeople(deliveryPeople);
        System.out.println("Created delivery_people.ser file.");
    }

    private static void createMenuItemsFile() {
        HashMap<String, MenuItem> menuItems = new HashMap<>();
        // Populate menuItems HashMap if needed
        FileUtil.saveMenuItems(menuItems);
        System.out.println("Created menu_items.ser file.");
    }
}
