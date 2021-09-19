/* Given an array of numbers and a number ‘K’, we need to remove ‘K’ numbers 
from the array such that we are left with maximum distinct numbers. */

public static int findMaximumDistinctElements(int[] nums, int k) {
    int dist = 0;
    if(nums.length <= k)
        return dist;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(entry.getValue() == 1)
            dist++;
        else
            minHeap.add(entry);
    }
    while(k > 0 && !minHeap.isEmpty()) {
        Map.Entry<Integer, Integer> entry = minHeap.poll();
        k -= entry.getValue() - 1;
        if(k >= 0)
            dist++;
    }

    if(k > 0)
        dist -= k;
    return dist;
}