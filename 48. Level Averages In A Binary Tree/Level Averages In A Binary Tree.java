/* Given a binary tree, populate an array to represent the averages of all of its levels. */

public static List<Double> findLevelAverages(TreeNode root) {
    List<Double> result = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()) {
        List<Integer> l = new ArrayList<>();
        int s = q.size();
        for(int i = 0; i < s; i++) {
            TreeNode t = q.poll();
            l.add(t.val);
            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
        }
        double sum = 0;
        for(int j = 0; j < l.size(); j++) {
            sum += l.get(j);
        }
        result.add(sum / l.size());
    }
    return result;
}