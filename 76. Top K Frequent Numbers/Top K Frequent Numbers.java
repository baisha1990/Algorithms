/* Given an unsorted array of numbers, find the top ‘K’ frequently occurring numbers in it. */

public static List<Integer> findTopKFrequentNumbers(int[] nums, int k) {
    List<Integer> topNumbers = new ArrayList<>(k);
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
    PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer, Integer>> ((a,b) -> b.getValue()-a.getValue());
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        maxHeap.add(entry);
    }
    while(k > 0) {
        topNumbers.add(maxHeap.poll().getKey());
        k--;
    }
    return topNumbers;
}