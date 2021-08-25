/* Given a binary tree and a number ‘S’, find all paths in the 
tree such that the sum of all the node values of each path equals ‘S’. */

public static int countPaths(TreeNode root, int S) {
    List<Integer> l = new ArrayList<>();
    return count(root, S, l);
}

public static int count(TreeNode root, int S, List<Integer> curPath) {
    if(root == null)
        return 0;
    curPath.add(root.val);
    int pathSum = 0, pathCount = 0;
    ListIterator<Integer> listIt = curPath.listIterator(curPath.size());
    while(listIt.hasPrevious()) {
        pathSum += listIt.previous();
        if(pathSum == S)
            pathCount++;
    }
    pathCount += count(root.left, S, curPath);
    pathCount += count(root.right, S, curPath);

    curPath.remove(curPath.size() - 1);
    return pathCount;
}