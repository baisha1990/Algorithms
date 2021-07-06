/*Given an array arr of unsorted numbers and a target sum, count all triplets in it such that 
arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. 
Write a function to return the count of such triplets.*/


class Solution {

	public static int searchTriplets(int[] arr, int target) {
		int tc = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 2; i++) {
			int l = i + 1;
			int r = arr.length - 1;
			while(l < r) {
				int curSum = arr[i] + arr[l] + arr[r];
				if(curSum < target) {
					tc += r - l;
					l++;
				}
				else
					r--;
			}
		}
		return tc;
	}
}

