/* Given a binary tree, populate an array to represent its level-by-level traversal in 
reverse order, i.e., the lowest level comes first.*/

public static List<List<Integer>> traverse(TreeNode root) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
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
        result.add(0, l);
    }
    return result;
}