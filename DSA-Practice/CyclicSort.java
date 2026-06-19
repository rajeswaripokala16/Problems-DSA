import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
