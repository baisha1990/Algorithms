/* Given a sorted array of numbers, find if a given number ‘key’ is present in the array. Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. You should assume that the array can have duplicates.

Write a function to return the index of the ‘key’ if it is present in the array, otherwise return -1. */

public static int search(int[] arr, int key) {
    int l = 0, h = arr.length - 1;
    boolean isAscending = arr[l] < arr[h];
    while(l <= h) {
        int mid = l + (h - l)/2;
        if(arr[mid] == key)
            return mid;
        if(isAscending) {
            if(arr[mid] < key) 
                l = mid + 1;
            else
                h = mid - 1;
        } 
        else {
            if(arr[mid] < key) 
                h = mid - 1;
            else
                l = mid + 1;
        }
    }
    return -1;
}