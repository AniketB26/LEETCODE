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
    int height(TreeNode node){
        if(node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);
        int ans = Math.max(left, right) +1;

        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int o1 = diameterOfBinaryTree(root.left);
        int o2 = diameterOfBinaryTree(root.right);
        int o3 = height(root.left) + height(root.right);

        return Math.max(o1, Math.max(o2,o3));
    }
}