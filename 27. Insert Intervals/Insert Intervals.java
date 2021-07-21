/* Given a list of non-overlapping intervals sorted by their start time, 
insert a given interval at the correct position and merge all necessary 
intervals to produce a list that has only mutually exclusive intervals. */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for(int[] in : intervals) {
            if(in[1] < newInterval[0]) {
                res.add(in);
            }
            else if(newInterval[1] < in[0]) {
                res.add(newInterval);
                newInterval = in;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}