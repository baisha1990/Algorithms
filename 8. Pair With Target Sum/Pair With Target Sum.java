/* Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.*/


public static int[] search(int[] arr, int targetSum) {
    int s = 0, e = arr.length - 1;
    int[] res = new int[2];
    while(s < e) {
        if(arr[s] + arr[e] < targetSum)
            s++;
        else 
            e--;
        if(arr[s] + arr[e] == targetSum) {
            res[0] = s;
            res[1] = e;
            break;
        }
    }
    return res;
}