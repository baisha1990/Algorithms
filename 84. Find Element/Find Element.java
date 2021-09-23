/* Find the number greater than or equal to key number within a sorted array */

public static int search(int[] arr, int key) {
    int l = 0, h = arr.length - 1;
    if(key > arr[arr.length - 1])
        return -1;
    while(l <= h) {
        int mid = l + (h - l)/2;
        if(arr[mid] < key)
            l = mid + 1;
        else if(arr[mid] > key)
            h = mid - 1;
        else
            return mid;
    }
    return l;
}