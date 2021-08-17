/* Given a binary tree, connect each node with its level order successor. 
The last node of each level should point to a null node. */

public static void connect(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()) {
        TreeNode prev = null;
        int s = q.size();
        for(int i = 0; i < s; i++) {
            TreeNode cur = q.poll();
            if(prev != null)
                prev.next = cur;
            prev = cur;
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
    }
}