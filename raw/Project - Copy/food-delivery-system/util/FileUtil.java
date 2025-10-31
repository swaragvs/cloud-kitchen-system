package util;

import java.io.*;
import java.util.HashMap;
import model.User;
import model.Restaurant;
import model.Order;
import model.DeliveryPerson;

public class FileUtil {
    public static HashMap<String, User> loadUsers() {
        HashMap<String, User> users = new HashMap<>();
        try (FileInputStream fis = new FileInputStream("data/users.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            users = castObjectToHashMap(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void saveUsers(HashMap<String, User> users) {
        try (FileOutputStream fos = new FileOutputStream("data/users.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Restaurant> loadRestaurants() {
        HashMap<String, Restaurant> restaurants = new HashMap<>();
        try (FileInputStream fis = new FileInputStream("data/restaurants.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            restaurants = castObjectToHashMap(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return restaurants;
    }

    public static void saveRestaurants(HashMap<String, Restaurant> restaurants) {
        try (FileOutputStream fos = new FileOutputStream("data/restaurants.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(restaurants);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Order> loadOrders() {
        HashMap<String, Order> orders = new HashMap<>();
        try (FileInputStream fis = new FileInputStream("data/orders.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            orders = castObjectToHashMap(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public static void saveOrders(HashMap<String, Order> orders) {
        try (FileOutputStream fos = new FileOutputStream("data/orders.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(orders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, DeliveryPerson> loadDeliveryPeople() {
        HashMap<String, DeliveryPerson> deliveryPeople = new HashMap<>();
        try (FileInputStream fis = new FileInputStream("data/delivery_people.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            deliveryPeople = castObjectToHashMap(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deliveryPeople;
    }

    public static void saveDeliveryPeople(HashMap<String, DeliveryPerson> deliveryPeople) {
        try (FileOutputStream fos = new FileOutputStream("data/delivery_people.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(deliveryPeople);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> HashMap<String, T> castObjectToHashMap(Object obj) {
        return (HashMap<String, T>) obj;
    }
}
