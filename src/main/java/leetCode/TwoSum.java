package leetCode;

import java.util.*;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int[] output = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i<nums.length; i++){
                if(map.containsKey(target-nums[i])){
                    output[0] = map.get(target-nums[i]);
                    output[1] = i;
                    return output;
                }else{
                    map.put(nums[i],i);
                }
            }
            return output;
        }
}
