

import java.io.File;
import java.io.IOException;

public class FileUpdate {
    public static void main(String[] args) {
        String filename = "MinValidParenthesis.java";
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("File exists. Updating the file: " + filename);
            // Here you can add code to update the file if needed
        } else {
            System.out.println("File does not exist. Creating the file: " + filename);
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully: " + filename);
                } else {
                    System.out.println("File creation failed: " + filename);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file: " + e.getMessage());
            }
        }
    }
}
