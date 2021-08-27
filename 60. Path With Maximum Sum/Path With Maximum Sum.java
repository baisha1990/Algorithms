/* Find the path with the maximum sum in a given binary tree. 
Write a function that returns the maximum sum. */

static int sum = 0;
public static int findMaximumPathSum(TreeNode root) {
    sum = Integer.MIN_VALUE;
    find(root);
    return sum;
}

public static int find(TreeNode cur) {
	if(cur == null)
       return 0;
    int l = find(cur.left);
    int r = find(cur.right);

    l = Math.max(l, 0);
    r = Math.max(r, 0);
    int ll = l + r + cur.val;
    sum = Math.max(sum, ll);

    return Math.max(l, r) + cur.val;
}