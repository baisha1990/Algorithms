/* Given a list of intervals representing the start and end time of ‘N’ meetings, 
find the minimum number of rooms required to hold all the meetings.*/

public static int findMinimumMeetingRooms(List<Meeting> meetings) {
	int res = 0;
    Collections.sort(meetings, (a,b) -> Integer.compare(a.start, b.start));
    PriorityQueue<Meeting> pq = new PriorityQueue<>(meetings.size(), (a,b) -> Integer.compare(a.end, b.end));
    for(Meeting meeting : meetings) {
        while(!pq.isEmpty() && meeting.start >= pq.peek().end)
            pq.poll();
        pq.offer(meeting);
        res = Math.max(res, pq.size());
    }    
    return res;
}