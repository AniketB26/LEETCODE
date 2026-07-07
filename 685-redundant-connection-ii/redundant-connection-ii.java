class Solution {
    int[] parent;
    public int[] findRedundantDirectedConnection(int[][] edges) {
        
        int n = edges.length;

        int[] indegree = new int[n+1];

        int[] cand1 = null;
        int[] cand2 = null;

        for(int[] edge : edges){

            int u = edge[0];
            int v = edge[1];

            if(indegree[v] == 0){
                indegree[v] = u;
            }
            else{
                cand1 = new int[]{indegree[v],v};
                cand2 = new int[]{u,v};
                break;
            }
        }

        parent = new int[n+1];

        for(int i =1; i<n; i++){
            parent[i] = i;
        }

        for(int[] edge : edges){
            
            if(cand2 != null && edge[0] == cand2[0] && edge[1] == cand2[1]) continue;

            if(!union(edge[0], edge[1])){

                if(cand1 == null) return edge;

                return cand1;
            }

            
        }

        return cand2;
    }

     int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    boolean union(int u, int v) {

        int pu = find(u);
        int pv = find(v);

        if (pu == pv)
            return false;

        parent[pv] = pu;
        return true;
    }
}