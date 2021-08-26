/* Given a binary tree, find the length of its diameter. The diameter 
of a tree is the number of nodes on the longest path between any two 
leaf nodes. The diameter of a tree may or may not pass through the root. */

static int t = 0;
public static int findDiameter(TreeNode root) {
    find(root);
	return t;
}

public static int find(TreeNode cur) {
    if(cur == null)
        return 0;
    int l = find(cur.left);
    int r = find(cur.right);
    if(l != 0 && r != 0) {
        int d = l + r + 1;
        t = Math.max(d, t);
    }
    return Math.max(l, r) + 1;
}