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
    int max = 0;
    int height(TreeNode node){
        if(node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        max = Math.max(max, left+right);
        int ans = Math.max(left, right) +1;

        return ans;
    }

    Pair<Integer, Integer> diameter(TreeNode root){
        if(root == null){
           return new Pair<>(0,0);
        }


        Pair<Integer,Integer> left = diameter(root.left);
        Pair<Integer,Integer> right = diameter(root.right);

        int op1 = left.first;
        int op2 = right.first;
        int op3 = left.second + right.second;

        Pair<Integer,Integer> ans = new Pair<>();
        ans.first = Math.max(op1, Math.max(op2,op3));
        ans.second = Math.max(left.second, right.second)+1;

        return ans;

        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
       return diameter(root).first;
    }
}