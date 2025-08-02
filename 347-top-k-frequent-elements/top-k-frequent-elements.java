class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }


       PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            pq.offer(en);

            if(pq.size()>k){
                pq.poll();
            }
        }


        int[] n = new int[k];
        int i =0;
        while(!pq.isEmpty()){
            n[i++] = pq.poll().getKey();
        }
        return n;
    }
}