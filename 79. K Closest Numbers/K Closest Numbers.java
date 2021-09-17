/* Given a sorted number array and two integers ‘K’ and ‘X’, find ‘K’ 
closest numbers to ‘X’ in the array. Return the numbers in the sorted 
order. ‘X’ is not necessarily present in the array. */

class Entry {
  int key;
  int value;

  public Entry(int key, int value) {
    this.key = key;
    this.value = value;
  }
}

class Solution {

	public static List<Integer> findClosestElements(int[] arr, int K, Integer X) {
		List<Integer> result = new ArrayList<>();
		int index = binSearch(arr, X);
		int l = index - K, h = index + K;
		l = Math.max(l, 0);
		h = Math.min(h, arr.length - 1);
		PriorityQueue<Entry> minHeap = new PriorityQueue<>((a,b) -> a.key - b.key);
		for(int i = l; i <= h; i++) {
			minHeap.add(new Entry(Math.abs(arr[i] - X), i));
		}
		for(int i = 0; i < K; i++) {
			result.add(arr[minHeap.poll().value]);
		}
		Collections.sort(result);
		return result;
	}

	public static int binSearch(int[] arr, int X) {
		int low = 0, high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == X)
				return mid;
			else if(arr[mid] < X)
				low = mid + 1;
			else
				high = mid - 1;
		}
		if(low > 0)
			return low - 1;
		else
			return low;
	}
}