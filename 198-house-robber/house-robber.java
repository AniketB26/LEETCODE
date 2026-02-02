class Solution {
    public int rob(int[] nums) {
        // int first = 0;
        // int second = 0;


        // for(int i=0; i<nums.length; i += 2){
        //     first += nums[i];
        // }

        // for(int i =1; i<nums.length ; i += 2){
        //     second += nums[i];
        // }


        // int ans = Math.max(first,second);

        // return ans;

        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums, 0, dp);


    }


    int helper(int[] nums, int i, int[] dp){

        if(i >= nums.length ) return 0;

        if(dp[i] != -1) return dp[i];



        

        int rob = nums[i] + helper(nums, i+2, dp);
        int skip = helper(nums, i+1, dp);

        dp[i] = Math.max(rob,skip);

        return dp[i];
    }
}