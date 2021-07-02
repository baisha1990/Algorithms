/* Given an array of sorted numbers, remove all duplicates from it. 
You should not use any extra space; after removing the duplicates in-place 
return the length of the subarray that has no duplicate in it. */

class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;
        for(int e = 1; e < nums.length; e++) {
            if(nums[e] != nums[s]) {
                s++;
                nums[s] = nums[e];
            }
        }
        return s+1;
    }
}