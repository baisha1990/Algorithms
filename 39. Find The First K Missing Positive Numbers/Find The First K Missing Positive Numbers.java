/* Given an unsorted array containing numbers and a number ‘k’, 
find the first ‘k’ missing positive numbers in the array. */

public static List<Integer> findNumbers(int[] nums, int k) {
    List<Integer> missingNumbers = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    int i = 0;
    while(i < nums.length) {
        int j = nums[i] - 1;
        if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[j])
            swap(nums, i, j);
        else
            i++;
    }
    for(int l = 0; l < nums.length && missingNumbers.size() < k; l++) {
        if(nums[l] != l+1) {
            missingNumbers.add(l+1);
            set.add(nums[l]);
        }
    }
    for(i = 1; missingNumbers.size() < k; i++) {
        int t = nums.length + i;
        if(!set.contains(t))
            missingNumbers.add(t);
    }
    return missingNumbers;
}

public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
