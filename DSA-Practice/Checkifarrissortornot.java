import java.util.*;

public class Checkifarrissortornot {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        // int[] arr = { 6, 8, 4, 6, 3, 2, 1 };
        int[] arr = { 1, 2, 3, 4, 6, 7, 9 };
        int cc = checkifsort(arr, 0);
        boolean isSorted = (checkifsort(arr, cc) == 1);
        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Arrays is not sorted.");
        }
    }

    public static int checkifsort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return 1;
        }
        if (arr[index] > arr[index + 1]) {
            return 0;
        }
        return checkifsort(arr, index + 1);
    }
}
