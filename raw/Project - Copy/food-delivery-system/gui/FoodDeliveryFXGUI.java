package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FoodDeliveryFXGUI extends Application {

    private Button registerUserButton;
    private Button loginUserButton;
    private Button addRestaurantButton;
    private Button addMenuItemButton;
    private Button placeOrderButton;
    private Button exitButton;

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        registerUserButton = new Button("Register User");
        loginUserButton = new Button("Login User");
        addRestaurantButton = new Button("Add Restaurant");
        addMenuItemButton = new Button("Add Menu Item");
        placeOrderButton = new Button("Place Order");
        exitButton = new Button("Exit");

        // Create layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(
                registerUserButton,
                loginUserButton,
                addRestaurantButton,
                addMenuItemButton,
                placeOrderButton,
                exitButton
        );

        // Create scene and set layout
        Scene scene = new Scene(vbox, 300, 250);

        // Set stage title and scene, then show stage
        primaryStage.setTitle("Food Delivery System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
