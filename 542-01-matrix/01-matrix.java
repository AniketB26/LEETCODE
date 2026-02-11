class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        int[][] dist = new int[m][n];

        boolean[][] visited = new boolean[m][n];

        for(int i =0; i<m ; i++){
            for(int j =0; j<n; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                    dist[i][j] = 0;
                }
                
            }
        }


        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        
        while(!q.isEmpty()){

            int[] cell = q.poll();
            int r = cell[0], c = cell[1];


            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];


                if(nr >= 0 && nr < m && nc >= 0 && nc < n && (!visited[nr][nc])){
                    visited[nr][nc] = true;

                    dist[nr][nc] = dist[r][c] +1;

                    q.offer(new int[]{nr,nc});

                }



            }
        } 

        return dist;
    }
}