/* We are given an array containing positive and negative numbers. 
Suppose the array contains a number ‘M’ at a particular index. Now, if ‘M’ is 
positive we will move forward ‘M’ indices and if ‘M’ is negative move backwards ‘M’ 
indices. You should assume that the array is circular which means two things:

If, while moving forward, we reach the end of the array, we will jump to the first 
element to continue the movement.
If, while moving backward, we reach the beginning of the array, we will jump to the 
last element to continue the movement.
Write a method to determine if the array has a cycle. */

class Solution {
    public boolean circularArrayLoop(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            boolean isFwd = nums[i] > 0;
            int slow = i, fast = i;
            while(true) {
                slow = getNext(nums, slow, isFwd);
                if(slow == -1)
                    break;
                fast = getNext(nums, fast, isFwd);
                if(fast == -1)
                    break;
                fast = getNext(nums, fast, isFwd);
                if(fast == -1)
                    break;

                if(slow == fast)
                    return true;
            }
        }
        return false;
    }
    
    public int getNext(int[] nums, int p, boolean isFwd) {
        boolean dir = nums[p] >= 0;
        
        if(dir != isFwd)
            return -1;
        
        int next = (p + nums[p]) % nums.length;
        
        if(next < 0)
            next = next + nums.length;
        
        if(next == p)
            return -1;
        
        return next;
    }
}