class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones){
            pq.add(s);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            int a = x-y;

            if(a != 0){
                pq.add(a);
            }
        }
        
        return pq.isEmpty() ? 0 : pq.peek();
    }
}