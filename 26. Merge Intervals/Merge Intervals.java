/* Given a set of intervals, find out if any two intervals overlap. */

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] cur = intervals[0];
        List<int[]> res = new ArrayList<>();
        res.add(cur);

        for(int[] it : intervals) {
            if(it[0] <= cur[1]) {
                cur[1] = Math.max(it[1], cur[1]);
            }
            else {
                cur = it;
                res.add(it);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}