/* Given a binary tree, populate an array to represent its level-by-level traversal. */

public static List<List<Integer>> traverse(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    TreeNode temp = root;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(temp);
    while(!q.isEmpty()) {
        int s = q.size();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < s; i++) {
            TreeNode t = q.poll();
            l.add(t.val);
            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
        }
        result.add(l);
    }
    return result;
}