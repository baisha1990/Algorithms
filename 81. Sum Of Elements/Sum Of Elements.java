/* Given an array, find the sum of all numbers between the K1’th and K2’th smallest elements of that array. */

public static int findSumOfElements(int[] nums, int k1, int k2) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a - b);
    int res = 0;
    for(int i : nums) {
        minHeap.add(i);
    }
    for(int i = 0; i < k1; i++) {
       minHeap.poll();
    }
    for(int i = 0; i < k2 - k1 - 1; i++) {
        res += minHeap.poll();
    }
    return res;
}