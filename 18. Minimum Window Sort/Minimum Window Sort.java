/*Given an array, find the length of the smallest subarray in it which when sorted will sort the whole array.*/

public static int sort(int[] arr) {
    int low = 0, high = arr.length - 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    while(low < arr.length - 1 && arr[low] <= arr[low + 1])
        low++;
    if(low == arr.length - 1)
        return 0;
    while(high > 0 && arr[high] >= arr[high - 1])
        high--;
    for(int i = low; i <= high; i++) {
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);        
    }
    while(low > 0 && arr[low - 1] > min)
        low--;
    while(high < arr.length - 1 && arr[high + 1] < max)
        high++;
    return high - low + 1;
}