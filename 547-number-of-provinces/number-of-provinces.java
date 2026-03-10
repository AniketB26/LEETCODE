class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int cnt =0;
        boolean[] visited = new boolean[n];

        for(int i =0; i<n; i++){
            
                if(!visited[i]){
                    bfs(isConnected, visited, i);
                    cnt++;
                }
            
        }

        return cnt;
    }

    void bfs(int[][] isc, boolean[] vis , int i){

        Queue<Integer> q = new LinkedList<>();

        q.offer(i);
        vis[i] = true;

        while(!q.isEmpty()){

            int cc = q.poll();

            for(int j =0; j<isc[0].length; j++){
                if(isc[cc][j] == 1 && !vis[j]){
                    vis[j] = true;
                    q.offer(j);
                }
            }
        }
    }
}