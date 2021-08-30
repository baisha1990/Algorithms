/* Given a set of investment projects with their respective profits, we need to find the most profitable projects. We are given an initial capital and are allowed to invest only in a fixed number of projects. Our goal is to choose projects that give us the maximum profit. Write a function that returns the maximum total capital after selecting the most profitable projects.

We can start an investment project only when we have the required capital. Once a project is selected, we can assume that its profit has become our capital. */

public static int findMaximumCapital(int[] capital, int[] profits, int numberOfProjects, int initialCapital) {
    int n = profits.length;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(n, (a,b) -> capital[a] - capital[b]);
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n, (a,b) -> profits[b] - profits[a]);
    for(int i = 0; i < n; i++)
        minHeap.add(i);
     
    int res = initialCapital;
    for(int i = 0; i < numberOfProjects; i++) {
        while(!minHeap.isEmpty() && capital[minHeap.peek()] <= res)
            maxHeap.add(minHeap.poll());
        
        if(maxHeap.isEmpty())
            break;
        
        res += profits[maxHeap.poll()];
    }
      
    return res;
}