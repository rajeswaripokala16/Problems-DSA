import java.util.*;

public class Maxsubarrsum {
    public static void main(String[] args) {
        int[] arr = { 5, 6, -3, 7, -13, 8, -2, 5, -6, 7, -11, 3, 10, -10, -6, -10, 7, 2 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // int maxsum = arr[i];
        // int sum = arr[i];
        // sum += arr[i + 1];
        // maxsum = Math.max(maxsum, sum);
        // System.out.println("SubArr Max Sum Is:" + maxsum); // 16

        // }
        int maxsum = 0, sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (sum >= 0) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }
            maxsum = Math.max(sum, maxsum);
        }
        System.out.println("Subarr Max Sum Is:" + maxsum);

    }
}
