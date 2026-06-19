
// import java.util.*;

// class FindMissingNum1 {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 4, 5, 6 }; // 1 , 3
//         int sum = 0;
//         for (int i = 1; i < arr.length; i++) {
//             sum ^= i;
//             sum ^= arr[i];
//         }

//         System.out.println("Missing number is: " + (sum ^ (arr.length - 1)));

//     }
// }

import java.util.*;

class FindMissingNum1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7 };

        int max = 0;
        for (int x : arr) {
            if (x > max)
                max = x;
        }

        boolean[] present = new boolean[max + 1];
        for (int x : arr) {
            if (x >= 0 && x <= max) {
                present[x] = true;
            }
        }

        System.out.print("Missing numbers: ");
        for (int i = 1; i <= max; i++) {   
            if (!present[i]) { 
                System.out.print(i + " ");
            }
        }
    }
}

