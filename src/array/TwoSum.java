package array;// 1. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> inputPosition = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            inputPosition.put(num, index);
            index = index + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (inputPosition.containsKey(complement) && inputPosition.get(complement) != i) {
                return new int[]{i, inputPosition.get(complement)};
            }
        }
        return new int[]{-1, -1};
    }
}

