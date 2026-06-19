import java.util.Scanner;

public class FactRecur {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter u r fact numr:");
        int n = sin.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }
}
