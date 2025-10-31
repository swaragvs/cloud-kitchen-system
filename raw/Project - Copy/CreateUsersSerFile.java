package util;

import model.User;
import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateUsersSerFile {
    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap<>(); // Create an empty HashMap

        // Path to where you want to save the users.ser file
        String filePath = "users.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            
            // Write the HashMap to the file
            objectOut.writeObject(users);
            System.out.println("Empty users.ser file created successfully.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
