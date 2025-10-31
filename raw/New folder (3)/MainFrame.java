package gui;
import service.UserService;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Food Delivery System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("User Registration");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(titleLabel, constraints);

        JLabel userIdLabel = new JLabel("User ID:");
        constraints.gridy = 1;
        panel.add(userIdLabel, constraints);

        JTextField userIdField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(userIdField, constraints);

        JLabel nameLabel = new JLabel("Name:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(nameLabel, constraints);

        JTextField nameField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(nameField, constraints);

        JLabel emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(emailLabel, constraints);

        JTextField emailField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(emailField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(passwordLabel, constraints);

        JPasswordField passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        panel.add(passwordField, constraints);

        JButton registerButton = new JButton("Register");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(registerButton, constraints);

        registerButton.addActionListener(e -> {
            String userId = userIdField.getText();
            String name = nameField.getText();
            String email = emailField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars); // Convert char array to String

            // Call UserService to register user
            userService.registerUser(userId, name, email, password, "");

            // Show confirmation dialog
            JOptionPane.showMessageDialog(this, "User registered successfully!");

            // Clear fields after registration
            userIdField.setText("");
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        });

        add(panel);
    }
}
