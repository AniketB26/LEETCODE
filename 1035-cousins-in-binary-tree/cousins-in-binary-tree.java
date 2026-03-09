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

    TreeNode findparent(TreeNode root ,int x){

        if(root == null) return null;

        if((root.left != null && root.left.val == x) ||
            (root.right != null && root.right.val == x)){
            return root;
        }

        TreeNode left = findparent(root.left,x);

        if(left != null) return left;

        return findparent(root.right, x);

    }

    int depth(TreeNode root, int x, int d){
        
        if(root == null) return -1;

        if(root.val == x) return d;

        int left = depth(root.left, x, d+1);
        
        if(left != -1) return left;

        return depth(root.right, x, d+1);

        

        
        
        
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(x==y) return false;
        TreeNode px = findparent(root,x);
        TreeNode py = findparent(root,y);

        if(px == py) return false;
        int[] maxi = new int[2];
        int dx = depth(root, x, 0);
        int dy = depth(root ,y, 0);

        return dx == dy;


    }
}