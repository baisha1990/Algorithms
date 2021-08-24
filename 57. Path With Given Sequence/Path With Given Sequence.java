/* Given a binary tree and a number sequence, find if the 
sequence is present as a root-to-leaf path in the given tree. */

public static boolean findPath(TreeNode root, int[] sequence) {
    if(root == null)
        return sequence.length == 0;
    return find(root, sequence, 0);
}

public static boolean find(TreeNode root, int[] sequence, int sequenceIndex) {
      if(root == null)
          return false;
      if(sequenceIndex >= sequence.length || root.val != sequence[sequenceIndex])
          return false;
      if(root.left == null && root.right == null && sequenceIndex == sequence.length - 1)
          return true;
      return find(root.left, sequence, sequenceIndex + 1) || find(root.right, sequence, sequenceIndex + 1);
  }