/* We are given an unsorted array containing ‘n+1’ numbers taken from the 
range 1 to ‘n’. The array has only one duplicate but it can be repeated multiple times. 
Find that duplicate number without using any extra space. You are, however, allowed to 
modify the input array. */

class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int j = nums[i] - 1;
            if(nums[i] != nums[j])
                swap(nums, i, j);
            else
                i++;
        }
        for(int k = 0; k < nums.length; k++) {
            if(nums[k] != k+1)
                return nums[k];
        }
        return nums.length;
    }
    
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}