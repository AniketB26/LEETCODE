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
    public void helper(TreeNode node, List<Integer> arr, int lvl){
        if(node == null){
            return;
        }

        if(lvl == arr.size()){
            arr.add(node.val);
        }

        helper(node.right,arr,lvl+1);
        helper(node.left,arr,lvl+1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(root,arr,0);
        return arr;
    }
}