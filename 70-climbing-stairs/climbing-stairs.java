class Solution {

    int helper(int n, int[] cnt ){

        if(cnt[n] != 0) return cnt[n];
        
        if(n==0) return 1;
        if(n==1) return 1;

        int left = helper(n-1, cnt);
        int right = helper(n-2, cnt);

        cnt[n] = left+right;
        return cnt[n];
    }

    public int climbStairs(int n) {
        
        int[] cnt = new int[n+1];
        return helper(n, cnt);

        
    }
}