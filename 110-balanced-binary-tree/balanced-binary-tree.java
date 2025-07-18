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
    class Pair<K, V> {
        public K first;
        public V second;

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }
        public Pair() {
            this.first = null;
            this.second = null;
        }
    }

    Pair<Boolean,Integer> isBal(TreeNode root){
        if(root== null){
            return new Pair<>(true,0);
        }

        Pair<Boolean,Integer> left = isBal(root.left);
        Pair<Boolean,Integer> right = isBal(root.right);

        boolean leftans = left.first;
        boolean rightans = right.first;

        boolean diff = Math.abs(left.second - right.second) <=1;

        Pair<Boolean, Integer> ans = new Pair<>();
        ans.second = Math.max(left.second,right.second)+1;

        if(leftans && rightans && diff){
            ans.first = true;

        } 
        else{
            ans.first = false;
        }

        return ans;
    }

    public boolean isBalanced(TreeNode root) {
        return isBal(root).first;
    }
}