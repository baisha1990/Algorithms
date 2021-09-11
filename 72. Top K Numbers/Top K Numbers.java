/* Given an unsorted array of numbers, find the ‘K’ largest numbers in it. */

public static List<Integer> findKLargestNumbers(int[] nums, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
    for(int i : nums)
        maxHeap.add(i);
    List<Integer> res = new ArrayList<>();
    while(k > 0) {
        res.add(maxHeap.poll());
        k--;
    }
    return res;
}