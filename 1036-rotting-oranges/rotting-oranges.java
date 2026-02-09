class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        int m = grid.length, n = grid[0].length;

        int fresh = 0;

        for(int i=0; i<m ; i++){
            for(int j =0; j<n; j++){

                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                }
                if(grid[i][j] == 1) fresh++;
            }
        }

        if(fresh == 0) return 0;
        int min =0;

        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!q.isEmpty()){
            int[] cell = q.poll();

            int r = cell[0], c = cell[1], time = cell[2];
            min = time;


            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];


                if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    fresh--;
                    q.offer(new int[]{nr,nc, time+1});
                }
            }
        }

        return fresh == 0 ? min : -1;
    }
}