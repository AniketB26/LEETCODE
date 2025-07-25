/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode leftans = lowestCommonAncestor(root.left,p,q);
        TreeNode rightans = lowestCommonAncestor(root.right,p,q);

        if(leftans != null && rightans != null){
            return root;
        }

        if(leftans != null && rightans == null){
            return leftans;
        }

        if(leftans == null && rightans != null){
            return rightans;
        }

        return null;
    }
}