/* Design a class to efficiently find the Kth largest element in a stream of numbers. */


class Solution {
	PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a - b);
	final int k;
	public Solution(int[] nums, int k) {
		this.k = k;
		for(int i : nums) 
			add(i);
	}

	public int add(int num) {
		minHeap.add(num);
		if(minHeap.size() > k) 
			minHeap.poll();
      
		return minHeap.peek();
	}
}