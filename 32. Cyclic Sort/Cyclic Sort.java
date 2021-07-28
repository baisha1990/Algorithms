/* We are given an array containing ‘n’ objects. Each object, assigned a unique number from 1 to ‘n’ based on their creation sequence. 
Write a function to sort the objects in-place on their creation sequence number in O(n)O(n) and without any extra space.*/

public static void sort(int[] nums) {
    int i = 0;
    while(i < nums.length) {
        int j = nums[i] - 1;
        if(nums[i] != nums[j]) 
            swap(nums, i, j);
        else
            i++;
    }
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}