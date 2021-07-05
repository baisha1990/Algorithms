/*Given an array nums of n integers and an integer target, find three integers in 
nums such that the sum is closest to target. Return the sum of the three integers. 
You may assume that each input would have exactly one solution.*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while(l < r) {
                int targetSum = nums[i] + nums[l] + nums[r];
                
                if(Math.abs(target - targetSum) < Math.abs(minDiff)) {
                    minDiff = target - targetSum;
                }
                if(targetSum < target)
                    l++;
                else
                    r--;        
            }
        }
        return target - minDiff;
    }
}