/* Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s 
with 1s, find the length of the longest contiguous subarray having all 1s. */

class Solution {
    public int longestOnes(int[] nums, int k) {
		int wS = 0, res = 0, max = 0;
		int[] a = new int[2];
		for(int wE = 0; wE < nums.length; wE++) {
			if(nums[wE] == 0)
				a[0]++;
			else
				a[1]++;
			max = Math.max(max, a[0]);
			while(wE - wS + 1 - a[1] > k) {
				if(nums[wS] == 0)
					a[0]--;
				else
					a[1]--;
				wS++;
			}
			res = Math.max(res, wE - wS + 1); 
		}
		return res;
    }
}