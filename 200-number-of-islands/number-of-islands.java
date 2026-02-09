class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int cnt = 0;

        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j] != '0'){
                    fnc(grid, i, j);
                    cnt++;
                }
                
            }
        }

        return cnt;
    }

    void fnc(char[][] grid, int r, int c){

        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c]=='0'){
            return;
        }

        grid[r][c] = '0';


        fnc(grid, r+1,c);
        fnc(grid, r-1,c);
        fnc(grid, r,c+1);
        fnc(grid, r, c-1);
    }
}