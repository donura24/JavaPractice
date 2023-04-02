package JavaPractice.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {3, 5, 2, 7, 3, 1};
        int target = 4;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
