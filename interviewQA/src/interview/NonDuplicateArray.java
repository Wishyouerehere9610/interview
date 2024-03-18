package interview;

import java.util.Arrays;

public class NonDuplicateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(method(new int[]{1, 2, 3, 3, 4, 4, 5})));
    }

    public static int[] method(int[] nums) {
        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast]!=nums[fast]-1) {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return nums;
    }
}
