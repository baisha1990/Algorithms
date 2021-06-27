/* You can start with any tree, but you can’t skip a tree once you have started. 
You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
Write a function to return the maximum number of fruits in both baskets.*/

class Solution {
    public int totalFruit(int[] tree) {
        int wS = 0, res = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int wE = 0; wE < tree.length; wE++) {
            map.put(tree[wE], map.getOrDefault(tree[wE], 0) + 1);
            while(map.size() > 2) {
                System.out.println("Inside while");
                map.put(tree[wS], map.get(tree[wS]) - 1);
                if(map.get(tree[wS]) == 0)
                    map.remove(tree[wS]);
                wS++;
            }
            res = Math.max(res, wE-wS+1);
        }
        return res;
    }
}