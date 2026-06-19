import java.util.*;

public class Copyofonearrtoanoarrele {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 6, 9, 4, 3, 2, 1 };
        int len = arr.length - 1;
        int[] arr1 = new int[2 * len];
        for (int i = 0; i < arr.length - 1; i++) {
            // arr1[i] = arr[i];
            arr1[i] = arr[i];
            System.out.print(arr1[i] + " ");

        }
        // System.out.print("Arrar2 elements are:" + arr1[i] + " ");
        // System.out.println(arr[i]+" ");

    }
}
