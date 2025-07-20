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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }


        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean ltor = true;

        while(!q.isEmpty()){
            int lsize = q.size();
            LinkedList<Integer> l = new LinkedList<>() ;

            for(int i =0; i<lsize ; i++){
                TreeNode temp = q.poll();
                

                if (ltor) {
                    l.addLast(temp.val);
                } else {
                    l.addFirst(temp.val);
                }

                if (temp.left != null) q.offer(temp.left);
                if (temp.right != null) q.offer(temp.right);
                
                
                
            }
            
            res.add(l);
            ltor = !ltor;
        }

        return res;
    }
}