/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        return minn(root);
    }

    int minn(TreeNode root){
        if(root == null) return 0;

        int leftmin = minn(root.left);
        int rightmin = minn(root.right);

        if (root.left == null || root.right == null) {
            return leftmin + rightmin + 1;
        }

        return Math.min(leftmin,rightmin)+1;

    }
}