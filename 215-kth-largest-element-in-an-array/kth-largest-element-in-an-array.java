class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minH = new PriorityQueue<>();

        for(int i : nums){
            minH.add(i);

            if(minH.size() > k){
                minH.poll();
            }

        }

        return minH.peek();
}
}