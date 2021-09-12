/* Given an unsorted array of numbers, find Kth smallest number in it. */

public static int findKthSmallestNumber(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);
    for(int i : nums) {
        minHeap.add(i);
    }
    int res = 0;
    while(k > 0) {
        res = minHeap.poll();
        k--;
    }
    return res;
}