class Solution {
     class DSU {

        int[] parent;
        int[] rank;

        DSU(int n) {

            parent = new int[n + 1];
            rank = new int[n + 1];

            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {

            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        boolean union(int u, int v) {

            int pu = find(u);
            int pv = find(v);

            // already connected -> redundant edge
            if (pu == pv) {
                return false;
            }

            // union by rank
            if (rank[pu] < rank[pv]) {
                parent[pu] = pv;
            }
            else if (rank[pv] < rank[pu]) {
                parent[pv] = pu;
            }
            else {
                parent[pv] = pu;
                rank[pu]++;
            }

            return true;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        DSU dsu = new DSU(n);
        
        for(int[] edge : edges ){

            int a = edge[0];
            int b = edge[1];

            if(dsu.find(a) == dsu.find(b)){
                return edge;
            }

            dsu.union(a,b);
        }

        return new int[]{};
    }
}