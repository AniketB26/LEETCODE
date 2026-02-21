class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org = image[sr][sc];

        if(org == color) return image;

        int[][] dir = {{0,1},{1,0},{-1,0}, {0,-1}};
        dfs(image, sr, sc, org, color,dir);

        return image;



    }


    void dfs(int[][] image, int r, int c, int old, int neww, int[][] dir){

        int m = image.length;
        int n = image[0].length;

        if(r < 0 || r >= m || c < 0 || c >= n || image[r][c] != old) return;

        image[r][c] = neww;

        for(int[] d : dir){
            int nr = r + d[0];
            int nc = c + d[1];

            dfs(image, nr,nc,old,neww,dir);
        }
        
    }
}