/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class LC_0543_DiameterOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            deepOfTree(root);
            return max;
        }
        return 0;
    }
    public int deepOfTree(TreeNode root) {
        if (root != null) {
            int right = deepOfTree(root.right);
            int left = deepOfTree(root.left);
            max = Math.max(max, right + left);
            return Math.max(right, left) + 1;
        }
        return 0;
    }
}
