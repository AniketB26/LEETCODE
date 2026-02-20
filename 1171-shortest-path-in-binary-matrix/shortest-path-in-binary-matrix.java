class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        q.offer(new int[]{0,0,1});

        int[][] dir = {{1,0},{0,1}, {1,1}, {-1,0}, {0,-1}, {1,-1}, {-1,1}, {-1,-1}};

        while(!q.isEmpty()){

            int[] cell = q.poll();

            int r = cell[0], c = cell[1], dist = cell[2];

            if(r == n-1 && c == n-1) return dist;


            for(int[] d: dir){

                int nr = r+ d[0] , nc = c + d[1];

                if(nr >=0 && nr < n && nc >=0 && nc < n && grid[nr][nc] == 0){
                    grid[nr][nc] = 1;

                    q.offer(new int[] {nr,nc, dist+1});
                }
            }
        }

        return -1;
    }
}