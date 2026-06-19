
import java.util.*;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String filename = "MinValidParenthesis.java";
        File file = new File(filename);

        if (file.delete()) {
            System.out.println("Deleted the file: " + filename);
        } else {
            System.out.println("Failed to delete the file: " + filename);
        }
    }
}
