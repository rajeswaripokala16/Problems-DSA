import java.util.*;
import java.util.Arrays;

public class Sortarrasedsc {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 8, 4, 3, 2, 1 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ase order arr ele's:" + arr[i] + " ");
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print("Dse order arr ele's:" + arr[j] + " ");
        }
    }
}
