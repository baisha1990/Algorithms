/* Given an array with positive numbers and a target number, find all of its contiguous 
subarrays whose product is less than the target number. */


public static List<List<Integer>> findSubarrays(int[] arr, int target) {
    List<List<Integer>> subarrays = new ArrayList<>();
    int p = 1, l = 0;
    for(int r = 0; r < arr.length; r++) {
        p = p * arr[r];
        while(p >= target && l < arr.length) 
            p = p / arr[l++];
        List<Integer> temp = new ArrayList<>();
        System.out.println("l is: " + l);
        for(int i = r; i >= l; i--) {
            temp.add(0, arr[i]);
            System.out.println(temp);
            subarrays.add(new ArrayList<>(temp));
        }
    }
    return subarrays;
}