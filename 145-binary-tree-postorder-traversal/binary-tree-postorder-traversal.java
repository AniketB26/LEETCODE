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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr = root;
        List<Integer> ans = new ArrayList<>();
        TreeNode last = null;

        if(curr == null) return ans;


        while(curr != null || st.size() > 0){
            
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                curr = st.peek();

                while(curr != null && (curr.right == null || curr.right == last)){

                    ans.add(curr.val);
                    last = curr;
                    st.pop();

                    if(st.size() > 0){
                        curr = st.peek();
                    }
                    else{
                        curr = null;
                    }

                }

                if(curr != null) curr = curr.right;
            }

        }

        return ans;

    }
}