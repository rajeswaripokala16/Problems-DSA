
import java.util.*;

public class MissingNumbrs {
    public static void main(String[] args) {
        // Scanner sin = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 5, 6 };
        int sum = 0;
        int len = arr.length;
        for (int num : arr) {
            sum += num;
        }

        int ans = len * (len + 1) / 2;

        System.out.println(ans - sum);

    }

}
