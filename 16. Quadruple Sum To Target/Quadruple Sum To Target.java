/* Given an array of unsorted numbers and a target number, find all 
unique quadruplets in it, whose sum is equal to the target number. */

public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    Arrays.sort(arr);
    
    for(int i = 0; i < arr.length - 3; i++) {
        for(int j = i+1; j < arr.length - 2; j++) {
            int sum = target - arr[i] - arr[j];

            int l = j+1;
            int r = arr.length - 1;
            while(l < r) {
                int asum = sum - arr[l] - arr[r];

                if(asum == 0) {
                    quadruplets.add(Arrays.asList(arr[i], arr[j], arr[l], arr[r]));
                    l++;
                    r--;
                }
                else if(asum > 0) {
                    l++;
                }
                else 
                  r--;
            }
        }
    }
    return quadruplets;
}