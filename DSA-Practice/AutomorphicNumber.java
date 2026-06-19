import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number!");
        } else {
            System.out.println(num + " is NOT an automorphic number.");
        }
    }
}
