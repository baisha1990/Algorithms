/* Given a binary tree where each node can only have a digit (0-9) value, each 
root-to-leaf path will represent a number. Find the total sum of all the numbers 
represented by all paths. */

public static int findSumOfPathNumbers(TreeNode root) {
	return find(root, 0);
}

public static int find(TreeNode root, int sum) {
    if(root == null)
		return 0;
    sum = 10 * sum + root.val;
    if(root.left == null && root.right == null) {
        return sum;
    }
    return find(root.left, sum) + find(root.right, sum);
} 