/*Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. 
Return 0 if no such subarray exists.*/

class MinSizeSubArraySum {
	public static int findMinSubArray(int S, int[] arr) {
		int sum = 0, wS = 0, res = Integer.MAX_VALUE;
		for(int wE = 0; wE < arr.length; wE++) {
			sum = sum + arr[wE];
			while(sum >= S) {
				res = Math.min(res, wE - wS + 1);
				sum = sum - arr[wS];
				wS++;
			}
		}
		return res == Integer.MAX_VALUE ? 0 : res;
	}
}
