/* Given a set of numbers that might contain duplicates, find all of its distinct subsets. */

public static List<List<Integer>> findSubsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    Arrays.sort(nums);
    subsets.add(new ArrayList<>());
    int start = 0, end = 0;
    for(int i = 0; i < nums.length; i++) {
        start = 0;
        if(i > 0 && nums[i] == nums[i-1]) {
            start = end + 1;
        }
        end = subsets.size() - 1;
        for(int k = start; k <= end; k++) {
            List<Integer> p = new ArrayList<>(subsets.get(k));
            p.add(nums[i]);
            subsets.add(p);
        }
    }
    return subsets;
}