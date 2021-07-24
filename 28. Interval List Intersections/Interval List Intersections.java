/* Given two lists of intervals, find the intersection of these two lists. 
Each list consists of disjoint intervals sorted on their start time. */

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i < firstList.length && j < secondList.length) {
            int[] a = firstList[i];
            int[] b = secondList[j];
            if(!(a[0] > b[1] || b[0] > a[1])) {
                res.add(new int[]{Math.max(a[0], b[0]), Math.min(a[1], b[1])});
            }
            if(a[1] > b[1])
                j++;
            else
                i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}