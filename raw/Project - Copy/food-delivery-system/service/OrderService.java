package service;

import model.Order;
import util.FileUtil;

import java.util.HashMap;
import java.util.LinkedList;

public class OrderService {
    private HashMap<String, Order> orders;

    public OrderService() {
        orders = FileUtil.loadOrders();
    }

    public void placeOrder(String orderId, String userId, String restaurantId) {
        Order order = new Order(orderId, userId, restaurantId);
        orders.put(orderId, order);
        FileUtil.saveOrders(orders);
    }

    public void updateOrderStatus(String orderId, String newStatus) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.setStatus(newStatus);
            FileUtil.saveOrders(orders);
        }
    }

    // Other methods to manage orders
}
