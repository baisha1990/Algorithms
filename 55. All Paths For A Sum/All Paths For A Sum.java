/* Given a binary tree and a number ‘S’, find all paths from root-to-leaf 
such that the sum of all the node values of each path equals ‘S’.*/

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        path(root, targetSum, l, ll);
        return ll;
    }
    
    public void path(TreeNode root, int target, List<Integer> l, List<List<Integer>> ll) {
        if(root == null)
            return;
        l.add(root.val);
        if(target == root.val && root.left == null && root.right == null)
            ll.add(new ArrayList<>(l));
        else{
            path(root.left, target-root.val, l, ll);
            path(root.right, target-root.val, l, ll);
        }
        l.remove(l.size() - 1);
    }
}