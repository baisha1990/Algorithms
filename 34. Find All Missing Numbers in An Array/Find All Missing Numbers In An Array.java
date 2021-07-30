/* We are given an unsorted array containing numbers taken from the range 1 to ‘n’. 
The array can have duplicates, which means some numbers will be missing. 
Find all those missing numbers. */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> res = new ArrayList<>();
        while(i < nums.length) {
            int j = nums[i] - 1;
            if(nums[i] != nums[j])
                swap(nums, i, j);
            else
                i++;
        }
        for(int k =0; k < nums.length; k++) {
            if(nums[k] != k + 1)
                res.add(k+1);
        }
        return res;
    }
    
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}