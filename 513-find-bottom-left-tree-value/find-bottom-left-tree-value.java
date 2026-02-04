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
    int ans =0;
    int maxlvl = -1;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }


    void dfs(TreeNode root, int lvl){

        if(root == null) return;

        if(lvl > maxlvl){
            maxlvl = lvl;
            ans = root.val;
        }


        dfs(root.left, lvl+1);
        dfs(root.right, lvl+1);
    }
}