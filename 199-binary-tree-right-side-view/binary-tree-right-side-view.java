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
        if(root == null){
            return arr;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int lvl = q.size();

            for(int i =0; i< lvl; i++){
                TreeNode x = q.poll();

                if(i== lvl-1){
                    arr.add(x.val);
                }

                if(x.left != null){
                    q.offer(x.left);
                }

                if(x.right != null){
                    q.offer(x.right);
                }
            }
        }

        return arr;
    }
}