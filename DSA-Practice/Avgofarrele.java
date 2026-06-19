
import java.util.*;

class Avgofarrele {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 8, 6, 4, 3, 7 };
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Avg of arr ele's are :" + sum / len);

    }
}