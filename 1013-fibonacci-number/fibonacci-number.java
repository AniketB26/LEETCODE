class Solution {
    int helper(int n, int[] dp){
        if(n==0) return 0;
        if(n == 1) return 1;
        int first = dp[n-1];
        int second = dp[n-2];
        if(first == -1){
            first = helper(n-1,dp);
        }
        if(second == -1){
            second = helper(n-2,dp);
        }


        return first + second;
            
        
    }

    int helper2(int n ){
        if(n==0) return 0;
        if(n==1) return 1;

        return helper2(n-1) + helper2(n-2);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        

        return helper2(n);
    }
}