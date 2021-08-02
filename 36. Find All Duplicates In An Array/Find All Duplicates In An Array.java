/* We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. 
The array has some numbers appearing twice, find all these duplicate numbers without 
using any extra space. */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
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
                res.add(nums[k]);
        }
        return res;
    }
    
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}