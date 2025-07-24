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
    class info{
        TreeNode node;
        int vertical;
        int lvl;

        info(TreeNode node, int vertical, int lvl){
            this.node = node;
            this.vertical = vertical;
            this.lvl = lvl;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<info> q = new LinkedList<>();
        q.offer(new info(root,0,0));


        while(!q.isEmpty()){
            info curr = q.poll();
            TreeNode node = curr.node;
            int lvl = curr.lvl;
            int vertical = curr.vertical;


            map.putIfAbsent(vertical, new TreeMap<>());
            map.get(vertical).putIfAbsent(lvl, new PriorityQueue<>());
            map.get(vertical).get(lvl).offer(node.val);


            if(node.left != null){
                q.offer(new info(node.left, vertical-1,lvl+1 ));
            }

            if(node.right != null){
                q.offer(new info(node.right, vertical+1, lvl+1));
            }


        }


        List<List<Integer>> list = new ArrayList<>();


        for(TreeMap<Integer, PriorityQueue<Integer>> level : map.values()){
            List<Integer> clnm = new ArrayList<>();

            for(PriorityQueue<Integer> nodeLast : level.values()){
                while(!nodeLast.isEmpty()){
                    clnm.add(nodeLast.poll());
                }
            }

            list.add(clnm);
        }

        return list;

    }
}