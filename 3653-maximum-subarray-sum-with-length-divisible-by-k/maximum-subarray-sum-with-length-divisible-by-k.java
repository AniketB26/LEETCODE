class Solution {
    long kadane(ArrayList<Long> nums) {
    if (nums.isEmpty()) return Long.MIN_VALUE;

    long curr = nums.get(0);
    long best = nums.get(0);

    for (int i = 1; i < nums.size(); i++) {
        curr = Math.max(nums.get(i), curr + nums.get(i));
        best = Math.max(best, curr);
    }

    return best;
}

    long kadane(int[] nums) {
    long curr = nums[0];
    long best = nums[0];

    for (int i = 1; i < nums.length; i++) {
        curr = Math.max((long) nums[i], curr + nums[i]);
        best = Math.max(best, curr);
    }

    return best;
}

    long sumall(int[] nums) {
    long ans = 0;

    for (int x : nums) {
        ans += x;
    }

    return ans;
}
    public long maxSubarraySum(int[] nums, int k) {
        
        int n = nums.length;
        if(n==1) return nums[0];

        if(k==1 ) return kadane(nums);
        if(k == n) return sumall(nums);

        long[] pref = new long[n];
        pref[0] = nums[0];

        for(int i =1; i<n; i++){
            pref[i] += pref[i-1] + nums[i];
        }

        ArrayList<ArrayList<Long>> helper = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            helper.add(new ArrayList<>());
        }

        for(int i =0; i<k ; i++){
            // long add = pref[k-1+i], sub = 0;
            // if(i>0) sub= pref[i-1];

            // helper.get(i).add(add - sub);

            for(int j = k-1+i; j<n; j+=k){

                long add = pref[j];
                long sub = 0;
                
                if(i>0 || j>k-1+i) sub = pref[j-k];

                helper.get(i).add(add-sub); 
            }           
        } 

        long ans = Long.MIN_VALUE;

        for(int i =0; i< k; i++) ans = Math.max(ans, kadane(helper.get(i)));


        return ans;

    }
}