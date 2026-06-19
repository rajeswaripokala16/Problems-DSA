import java.util.*;

public class FibnacciSeries {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter u r number:");
        int n = sin.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
