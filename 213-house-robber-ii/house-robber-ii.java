class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int first = helper2(nums, 0, n-2);
        int sec = helper2(nums, 1, n-1);

        return Math.max(first, sec);

    }

    int helper2(int[] nums, int st, int end){
        int[] dp = new int[nums.length];

        Arrays.fill(dp,-1);

        return helper(nums, st, end, dp);
    }


    int helper(int[] nums, int i, int end, int[] dp){

        if(i > end) return 0;

        if(dp[i] != -1) return dp[i];

        int rob = nums[i] + helper(nums, i+2, end, dp);
        int skip = helper(nums,i+1, end, dp);

        dp[i] = Math.max(rob, skip);

        return Math.max(rob,skip); 
    }
}