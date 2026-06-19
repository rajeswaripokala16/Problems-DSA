import java.util.*;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 6 };
        // int n = arr.length;
        int ans = FindmissNum(arr);
        System.out.println(ans + " ");
    }

    public static int FindmissNum(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i];
            if (arr[i] < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // serach for the first missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return n;
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
