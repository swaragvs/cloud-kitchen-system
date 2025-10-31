package main;

import model.User;
import model.Restaurant;
import model.MenuItem;
import service.UserService;
import service.RestaurantService;
import service.OrderService;
import service.DeliveryService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserService userService = new UserService();
    private static final RestaurantService restaurantService = new RestaurantService();
    private static final OrderService orderService = new OrderService();
    private static final DeliveryService deliveryService = new DeliveryService();

    public static void main(String[] args) {
        // Basic menu to interact with the system
        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("3. Add Restaurant");
            System.out.println("4. Add Menu Item");
            System.out.println("5. Place Order");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    addRestaurant();
                    break;
                case 4:
                    addMenuItem();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void registerUser() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        userService.registerUser(userId, name, email, password, address);
        System.out.println("User registered successfully.");
    }

    private static void loginUser() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userService.loginUser(email, password) != null) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    private static void addRestaurant() {
        System.out.print("Enter restaurant ID: ");
        String restaurantId = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        restaurantService.addRestaurant(restaurantId, name, address);
        System.out.println("Restaurant added successfully.");
    }

    private static void addMenuItem() {
        System.out.print("Enter restaurant ID: ");
        String restaurantId = scanner.nextLine();
        System.out.print("Enter item ID: ");
        String itemId = scanner.nextLine();
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        restaurantService.addMenuItem(restaurantId, itemId, name, description, price);
        System.out.println("Menu item added successfully.");
    }

    private static void placeOrder() {
        System.out.print("Enter order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter restaurant ID: ");
        String restaurantId = scanner.nextLine();

        orderService.placeOrder(orderId, userId, restaurantId);
        System.out.println("Order placed successfully.");
    }
}
