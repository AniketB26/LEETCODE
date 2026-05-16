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

    int helper(TreeNode root){

        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);


        
        int max = Math.max(left,right);
        return max+1;

       
    }

    public int maxDepth(TreeNode root) {
        
        return helper(root);
        
    }
}