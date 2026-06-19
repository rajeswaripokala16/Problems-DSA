import java.util.*;
import java.util.Arrays;

class MostFreqElement {
    public static void main(String[] args) {
        int[] nums = { 1, 100, 200, 1, 100 };
        int key = 1;
        int ans = mostFrequent(nums, key);
        System.out.println(ans + " ");
    }

    public static int mostFrequent(int[] nums, int key) {
        int count = 0;
        int maxcount = 0, rr = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i < nums.length || i == key) {
                count++;
                maxcount = Math.max(count, maxcount);
                rr = nums[i];
            }
        }

        return rr;

    }
}
