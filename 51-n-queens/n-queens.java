class Solution {
    private boolean isSafe(int n, int row, int col, char[][] board){
        for(int i =0; i<n; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i = row-1, j= col-1; i>= 0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    private void solve(int row, int n, char[][] board, List<List<String>> output){
        if(row == n){
            List<String> ans = new ArrayList<>();
            for(char[] rowans : board){
                ans.add(new String(rowans));
            }
            output.add(ans);
            return;
        }

        for(int col = 0; col<n; col++){

            if(isSafe(n , row , col, board)){
                board[row][col] = 'Q';
                solve(row+1, n , board, output);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i =0; i<n; i++){
            Arrays.fill(board[i], '.');
        }

        solve(0, n, board, output);

        return output;
    }
}