/* Given ‘N’ ropes with different lengths, we need to connect these ropes into one big rope with minimum cost. The cost of connecting two ropes is equal to the sum of their lengths. */

public static int minimumCostToConnectRopes(int[] ropeLengths) {
    int res = 0, temp = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);
    for(int i : ropeLengths) {
        minHeap.add(i);
    }
    while(minHeap.size() > 1) {
        temp = minHeap.poll() + minHeap.poll();
        res += temp;
        minHeap.add(temp);
    }
    return res;
}
