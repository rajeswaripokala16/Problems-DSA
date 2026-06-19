import java.util.Scanner;

public class Searchvalandprintind {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int target = sin.nextInt();
        int[] arr = { 6, 4, 5, 8, 1, 2, 14, 3 }; // 0, 1, 2, 3, 4, 5, 6, 7

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Index is:" + i);
            }

        }
    }
}

// By Using Recursion

// import java.util.*;

// public class Searchvalandprintind
// public static void main(String[] args)
// {
// Scanner sin = new Scanner(System.in);
// int target = sin.nextInt();
// int[] arr = { 6, 4, 5, 8, 1, 2, 14, 3 };// 0, 1, 2, 3, 4, 5, 6, 7
// int index = search(arr,target,0);
// if(index!=1)
// {
// System.out.println("index is:"+index);
// }
// else
// {
// System.out.println("Element not found");
// }

// public static int search(int[] arr,int target,int index)
// {
// if(index == arr.length)
// {
// return -1;
// }
// if(arr[index] == target)
// {
// return index;
// }
// search(arr, target, index+1);
// }

// }
