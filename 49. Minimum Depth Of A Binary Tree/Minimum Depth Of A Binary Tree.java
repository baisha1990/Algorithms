/* Find the minimum depth of a binary tree. The minimum depth is the number of nodes 
along the shortest path from the root node to the nearest leaf node. */

public static int findDepth(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int d = 0;
    while(!q.isEmpty()) {
        d++;
        int s = q.size();
        for(int i = 0; i < s; i++) {
            TreeNode t = q.poll();
            if(t.left == null && t.right == null)
                return d;

            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
        }
    }
    return -1;
}