/* Given an array of numbers and a number ‘k’, find the median of all the 
‘k’ sized sub-arrays (or windows) of the array. */

class findMedian {
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
	PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> (a-b));
	public double[] findSlidingWindowMedian(int[] nums, int k) {
		double[] result = new double[nums.length - k + 1];
		for(int i = 0; i < nums.length; i++) {
			if(maxHeap.size() == 0 || maxHeap.peek() >= nums[i])
				maxHeap.add(nums[i]);
			else
				minHeap.add(nums[i]);
			
			balance();
			
			if(i - k + 1 >= 0) {
				if(maxHeap.size() == minHeap.size())
					result[i - k + 1] = (maxHeap.peek() + minHeap.peek())/2.0;
				else
					result[i - k + 1] = maxHeap.peek();
              
				int elementToBeRemoved = nums[i - k + 1];
				if(maxHeap.peek() >= elementToBeRemoved)
					maxHeap.remove(elementToBeRemoved);
				else
					minHeap.remove(elementToBeRemoved);
				
				balance();
          }
      }
	  return result;
	}

	public void balance() {
		if(maxHeap.size() > minHeap.size() + 1)
			minHeap.add(maxHeap.poll());
		else if(minHeap.size() > maxHeap.size())
			maxHeap.add(minHeap.poll());
	}
}