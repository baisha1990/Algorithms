/*Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.*/

class MaxSumSubArrayOfSizeK {
	  public static int findMaxSumSubArray(int k, int[] arr) {
			int sum = 0, wS = 0 maxSum = 0;
			for(int wE = 0; wE < arr.length; wE++) {
			  sum = sum + arr[wE];
				  if(wE >= k-1) {
						maxSum = Math.max(sum, maxSum);
						sum = sum - arr[wS];
						wS++;
				  }
			}
			return findMax(res);
	  }
}
