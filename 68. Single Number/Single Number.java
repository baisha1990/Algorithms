/* In a non-empty array of integers, every number appears twice except for one, find that single number. */

public static int findSingleNumber(int[] arr) {
    int res = arr[0];
    for(int i = 1; i < arr.length; i++)
        res = res ^ arr[i];
    return res;
}