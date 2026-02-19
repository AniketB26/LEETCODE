class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];


    //    for (int i = 0; i < dp.length; i++) {
    //         Arrays.fill(dp[i], -1);
    //     }

    //     return helper(m,n, 0,0, dp);

            for(int i = m-1; i >=0; i--){
                for(int j =n-1; j>=0; j--){

                    if(i == m-1 && j == n-1){
                        dp[i][j] = 1;
                        continue;
                    }

                    int ra = 0,  da = 0;

                    if( j< n-1) ra = dp[i][j+1];
                    if(i< m-1) da = dp[i+1][j];

                    dp[i][j] = ra + da;
                }
            }

            return dp[0][0];

    }

    int helper(int m, int n, int sr, int sc, int[][] dp){

        if(sr == m-1 && sc == n-1) return 1;

        if(sr > m-1 || sc > n-1) return 0;

        if(dp[sr][sc] != -1) return dp[sr][sc];

        int ra = helper(m,n,sr,sc+1, dp);
        int da = helper(m,n,sr+1, sc, dp);

        dp[sr][sc] = ra+da;

        return dp[sr][sc];
    }
}