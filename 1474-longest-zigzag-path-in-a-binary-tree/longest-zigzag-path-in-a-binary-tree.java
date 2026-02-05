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

    int ans = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null) {
            helper(root.left, 1, 1);  
        }

        if (root.right != null) {
            helper(root.right, 0, 1); 
        }

        return ans;
    }

    void helper(TreeNode root, int dir, int len) {
        if (root == null) return;

        ans = Math.max(ans, len);

        if (dir == 1) {
            helper(root.right, 0, len + 1);
            helper(root.left, 1, 1);
        } else {
            helper(root.left, 1, len + 1);
            helper(root.right, 0, 1);
        }
    }
}
