/* We are given a list of Jobs. Each job has a Start time, an End time, 
and a CPU load when it is running. Our goal is to find the maximum CPU load at 
any time if all the jobs are running on the same machine.*/

public static int findMaxCPULoad(List<Job> jobs) {
    int res = 0, curLoad = 0;
    Collections.sort(jobs, (a,b) -> Integer.compare(a.start, b.start));
    PriorityQueue<Job> pq = new PriorityQueue<>(jobs.size(), (a,b) -> Integer.compare(a.end, b.end));
    for(Job job : jobs) {
        while(!pq.isEmpty() && job.start > pq.peek().end)
            curLoad -= pq.poll().cpuLoad;
        pq.offer(job);
        curLoad += job.cpuLoad;
        res = Math.max(res, curLoad);
    }
    return res;
}