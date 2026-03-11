class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i =0; i<m; i++){

            dfs(i,0,board, m,n);
            dfs(i,n-1,board,m,n);
        }

        for(int j =0; j<n; j++){
            dfs(0,j,board,m,n);
            dfs(m-1,j,board,m,n);
        }

        for(int i  =0; i<m; i++){
            for(int j =0; j<n ; j++){

                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        

        
    }

    void dfs(int r, int c, char[][] g, int m, int n){

        if(r < 0 || r >= m || c < 0 || c>= n || g[r][c] != 'O') return;

        g[r][c] = '#';

        dfs(r+1,c,g,m,n);
        dfs(r-1,c,g,m,n);
        dfs(r,c-1,g,m,n);
        dfs(r,c+1,g,m,n);
    }
}