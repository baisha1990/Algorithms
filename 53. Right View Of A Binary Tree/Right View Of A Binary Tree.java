/* Given a binary tree, return an array containing nodes in its right view. 
The right view of a binary tree is the set of nodes visible when the tree is 
seen from the right side. */

public static List<TreeNode> traverse(TreeNode root) {
    List<TreeNode> result = new ArrayList<>();
    if(root == null)
        return result;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int s = q.size();
        for(int i = 0; i < s; i++) {
            TreeNode t = q.poll();
            if(i == (s - 1))
                result.add(t);
            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
        }
    }
    return result;
}