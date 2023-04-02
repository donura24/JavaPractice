package JavaPractice.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> comp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complimentIndex = comp.get(nums[i]);
            if (complimentIndex != null) return new int[]{i, complimentIndex};
            comp.put(target - nums[i], i);
        }
        return nums;
    }
}
