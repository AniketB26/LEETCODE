class Solution {

    int helper(int[] cost, int n, int st, int[] cnt){

        if(cnt[st] != -1) return cnt[st];

        if(st == n) return 0;
        if(st == n-1) return cost[n-1];

        int left = helper(cost,n, st+1, cnt);
        int right = helper(cost,n,st+2, cnt);

        cnt[st] = cost[st] + Math.min(left,right);

        return cnt[st];
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] cnt = new int[n+1];

        Arrays.fill(cnt,-1);

        int zero = helper(cost, n,1, cnt);
        int one = helper(cost,n,0, cnt);


        return Math.min(zero,one);
    }


}