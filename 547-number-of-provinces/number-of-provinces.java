class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int cnt=0;
        int[] vis = new int[n];

        for(int i=0; i<n; i++){
            for(int j =0; j<n ; j++){

                if(vis[i] != 1){
                    dfs(i,isConnected,vis,n);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    void dfs(int x, int[][] g, int[] vis,int n){

        for(int i =0; i< n ; i++){

            if(g[x][i] == 1 && vis[i] != 1){
                vis[i] = 1;
                dfs(i,g,vis,n);
            }
        }
    }
}