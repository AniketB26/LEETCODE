class Solution {
    Boolean[][] dp;
    boolean helper(int tar, int[] nums, int sum, int i, int n){

        if(sum == tar) return true;
        if(i >= n || sum > tar) return false;

        if(dp[i][sum] != null) return dp[i][sum];


        dp[i][sum] = helper(tar, nums, sum+nums[i], i+1,n) || helper(tar,nums,sum,i+1,n);

        return dp[i][sum];

    }
    public boolean canPartition(int[] nums) {
        
        int sum =0;
        for(int i : nums){
            sum += i;
        }


        if(sum%2 != 0) return false;

        int tarsum = sum/2;
        int n = nums.length;

        dp = new Boolean[n][tarsum+1];

        return helper(tarsum, nums,0, 0,n);
    }
}