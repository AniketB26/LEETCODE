class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;

        long ts = 0;
        for(int i =0; i<n; i++){
            ts += nums[i];
        }

        int tar = (int)(ts%p);
        if(tar == 0) return 0;



        int ans = n;

        int alpha = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i<n; i++){
            alpha = (alpha+nums[i])%p;

            int beta = ((alpha-tar)%p+p)%p;

            if(map.containsKey(beta)){

                ans = Math.min(ans, i-map.get(beta));
            }

            map.put(alpha,i);
        }

        return ans == n ? -1:ans;
    }
}