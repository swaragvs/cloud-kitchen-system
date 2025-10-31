package service;

import model.MenuItem;
import model.Restaurant;
import util.FileUtil;

import java.util.HashMap;

public class RestaurantService {
    private HashMap<String, Restaurant> restaurants;

    public RestaurantService() {
        restaurants = FileUtil.loadRestaurants();
    }

    public void addRestaurant(String restaurantId, String name, String address) {
        Restaurant restaurant = new Restaurant(restaurantId, name, address);
        restaurants.put(restaurantId, restaurant);
        FileUtil.saveRestaurants(restaurants);
    }

    public void addMenuItem(String restaurantId, String itemId, String name, String description, double price) {
        Restaurant restaurant = restaurants.get(restaurantId);
        if (restaurant != null) {
            MenuItem menuItem = new MenuItem(itemId, name, description, price);
            restaurant.getMenu().put(itemId, menuItem);
            FileUtil.saveRestaurants(restaurants);
        }
    }

    // Other methods to manage restaurant data
}
