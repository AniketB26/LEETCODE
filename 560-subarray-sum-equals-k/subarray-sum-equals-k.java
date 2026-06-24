class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int cnt = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int b = sum - k;

            if(map.containsKey(b)){
                
                cnt += map.get(b);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return cnt;
    }
}