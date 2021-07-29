/* given an array containing ‘n’ distinct numbers taken from the range 0 to ‘n’. 
Since the array has only ‘n’ numbers out of the total ‘n+1’ numbers, find the missing 
number.*/

public static int findMissingNumber(int[] nums) {
    int i = 0;
    while (i < nums.length) {
		if (nums[i] < nums.length && nums[i] != nums[nums[i]])
			swap(nums, i, nums[i]);
		else
			i++;
    }

    for (i = 0; i < nums.length; i++) {
		if (nums[i] != i)
			return i;
	}
    return nums.length;
}

private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}