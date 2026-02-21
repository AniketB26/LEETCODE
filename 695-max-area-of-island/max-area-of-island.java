class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int dist =0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i =0; i<m ; i++){
            for(int j =0; j<n ; j++){

                if(grid[i][j] == 1){
                    int[] x = {0};
                    dfs(grid, i,j , x);
                    dist = Math.max(dist, x[0]);
                    
                }
            }
        }

        return dist;
    }


    void dfs(int[][] grid, int i, int j, int[] cnt){

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||grid[i][j] == 0 ) return ;

        grid[i][j] = 0;
        cnt[0]++;

        dfs(grid, i+1, j , cnt);
        dfs(grid, i, j+1,cnt);
        dfs(grid, i-1, j , cnt);
        dfs(grid,i,j-1, cnt);

    }
}