/* We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. 
The array originally contained all the numbers from 1 to ‘n’, but due to a data error, 
one of the numbers got duplicated which also resulted in one number going missing. 
Find both these numbers.*/

public static int[] findNumbers(int[] nums) {
	List<Integer> res = new ArrayList<>();
    int i = 0;
    while(i < nums.length) {
        int j = nums[i] - 1;
        if(nums[i] != nums[j])
            swap(nums, i , j);
        else
            i++;
    }
    for(int k = 0; k < nums.length; k++) {
        if(nums[k] != k+1)
            return new int[] {nums[k], k+1};
    }
    return new int[] { -1, -1 };
}

public static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
}