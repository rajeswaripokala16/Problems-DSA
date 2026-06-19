
import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

        String filename = "MinValidParenthesis.java";
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("File is already exists:" + filename);
        } else {
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