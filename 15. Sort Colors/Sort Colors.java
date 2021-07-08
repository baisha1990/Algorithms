/* Given an array containing 0s, 1s and 2s, sort the array in-place. You 
should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to 
recreate the array. */

class Solution {
    public void sortColors(int[] nums) {
        int l = 0, high = nums.length - 1;
        for(int i = 0; i <= high;) {
            if(nums[i] == 0) {
                swap(nums, i, l);
                i++;
                l++;
            } else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, high);
                high--;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}