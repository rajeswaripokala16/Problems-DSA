import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 6, 0, 8, 0, 4, 7 };
        int[] ans = new int[nums.length];

        int len = nums.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                ans[i] = nums[i];
                cnt++;
            }
        }

        while (cnt <= len) {
            ans[cnt] = 0;
            cnt++;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }

    }

}
