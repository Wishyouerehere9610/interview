package interview;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        int j = k-1;
        int i = nums.length-1;
        int k1=k;
        // 把元素提上来先
        do {
            result[j] = nums[i];
            j--;
            i--;
            k1--;
        } while (k1 != 0);

        int right = nums.length - k;
        int p = 0;
        int left = k;
        while (p < right) {
            result[left] = nums[p];
            left++;
            p++;
        }
        for (int z=0;z<nums.length;z++){
            nums[z]=result[z];
        }
    }


}
