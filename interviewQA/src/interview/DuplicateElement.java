package interview;

import java.util.HashMap;

public class DuplicateElement {
    public static void main(String args[]){
        int[] nums = {1,2,3,1};
        int k= 3;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (hashMap.containsKey(nums[i]) && Math.abs(i-hashMap.get(nums[i]))<=k){
                System.out.println("true");
            }else{
                hashMap.put(nums[i],i);
            }
        }
        System.out.println("false");
    }
}
