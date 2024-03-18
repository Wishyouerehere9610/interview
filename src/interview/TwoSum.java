package interview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String arg[]) {
        int[] nums = {2, 3, 4, 5};
        int target = 8;
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
            } else {
                hashMap.put(nums[i], i);
            }
        }
        System.out.println(Arrays.toString(result));
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            int findNum = target - nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == findNum) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(result));
    }
}

