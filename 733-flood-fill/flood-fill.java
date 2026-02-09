class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q = new LinkedList<>();

        int m = image.length;
        int n = image[0].length;

        int org = image[sr][sc];

        if(color == org) return image;

        q.offer(new int[]{sr,sc});


        int[][] dir = {{1,0},{-1,0}, {0,1}, {0,-1}}; 

        image[sr][sc] = color;
        while(!q.isEmpty()){

            int[] cell = q.poll();

            int r = cell[0], c = cell[1];


            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];


                if(nr >= 0 && nr < m && nc >= 0 && nc < n && image[nr][nc] == org){

                    image[nr][nc] = color;
                    q.offer(new int[]{nr,nc});
                }
            }
        }

        return image;
    }
}