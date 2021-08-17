/* Given a binary tree and a node, find the level order successor of the given node in 
the tree. The level order successor is the node that appears right after the given node 
in the level order traversal. */

public static TreeNode findSuccessor(TreeNode root, int key) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()) {
        int s = q.size();
        TreeNode t = q.poll();
        if(t.left != null)
            q.add(t.left);
        if(t.right != null)
            q.add(t.right);
        if(t.val == key)
            break;
    }
    return q.peek();    
}