/* Given a binary tree, populate an array to represent its zigzag level order traversal. */

public static List<List<Integer>> traverse(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Queue<TreeNode> q = new LinkedList<>();
    int lvl = 0;
    q.add(root);
    while(!q.isEmpty()) {
        List<Integer> l = new ArrayList<>();
        int s = q.size();
        for(int i = 0; i < s; i++) {
            TreeNode t = q.poll();
            if(lvl%2 == 0)
                l.add(t.val);
            else
                l.add(0, t.val);
            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
        }
        lvl++;
        result.add(l);
    }
    return result;
}