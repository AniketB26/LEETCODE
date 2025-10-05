class Solution {
    public int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }

    public int climbStairs(int n) {
        
        int[] dp = new int[n+2];

        dp[0] =0;
        dp[1] = 1;
        int i =2;
        for(i =2; i<= n+1; i++){
            dp[i] = dp[i-1] +dp[i-2];
        }

        return dp[i-1];
    }
}