/* Given an array of unsorted numbers, find all unique triplets in it that add up to zero.*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            search(nums, -nums[i], i+1, l);
        }
        return l;
    }
    public void search(int[] arr, int targetSum, int left, List<List<Integer>> l) {
        int r = arr.length - 1;
        while(left < r) {
            int cs = arr[left] + arr[r];
            if(cs == targetSum) {
                l.add(Arrays.asList(-targetSum, arr[left], arr[r]));
                left++;
                r--;
                while(left < r && arr[left] == arr[left-1])
                    left++;
                while(left < r && arr[r] == arr[r+1])
                    r--;
            }
            else if(cs < targetSum)
                left++;
            else
                r--;
        }
    }
}