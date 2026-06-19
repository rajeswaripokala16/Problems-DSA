import java.util.Scanner;

public class PowerRecur {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter u r val1:");
        int pow = sin.nextInt();
        System.out.println("Enter u r val1:");
        int val = sin.nextInt();
        int ans = power(pow, val);
        System.out.println(ans);
    }

    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }
}
