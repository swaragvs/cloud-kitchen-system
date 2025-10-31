import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodDeliverySwingGUI extends JFrame {

    public FoodDeliverySwingGUI() {
        setTitle("Food Delivery System");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton registerUserButton = new JButton("Register User");
        JButton loginUserButton = new JButton("Login User");
        JButton addRestaurantButton = new JButton("Add Restaurant");
        JButton addMenuItemButton = new JButton("Add Menu Item");
        JButton placeOrderButton = new JButton("Place Order");
        JButton exitButton = new JButton("Exit");

        registerUserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement action for registering user
            }
        });

        // Other action listeners...

        panel.add(registerUserButton);
        panel.add(loginUserButton);
        panel.add(addRestaurantButton);
        panel.add(addMenuItemButton);
        panel.add(placeOrderButton);
        panel.add(exitButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FoodDeliverySwingGUI();
            }
        });
    }
}
