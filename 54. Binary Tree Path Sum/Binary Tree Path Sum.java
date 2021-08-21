/* Given a binary tree and a number ‘S’, find if the tree has a path from 
root-to-leaf such that the sum of all the node values of that path equals ‘S’. */

public static boolean hasPath(TreeNode root, int sum) {
    if(root == null)
        return false;
    if(sum == root.val && root.left == null && root.right == null)
        return true;
    
    return hasPath(root.left, sum-root.val) || hasPath(root.right, sum - root.val);
}