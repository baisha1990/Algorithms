/* Given a binary tree, connect each node with its level order successor. 
The last node of each level should point to the first node of the next level. */

public static void connect(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    TreeNode prev = null;
    while(!q.isEmpty()){
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