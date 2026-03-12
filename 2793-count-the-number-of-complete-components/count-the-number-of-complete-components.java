class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0; i<n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u = e[0];
            int v = e[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int ans = 0;

        boolean[] vis = new boolean[n];

        for(int i = 0; i < n; i++){

            if(!vis[i]){

                int[] res = dfs(i, graph, vis);

                int nodes = res[0];
                int edgesCount = res[1] / 2;

                if(edgesCount == nodes * (nodes - 1) / 2)
                    ans++;
            }
        }

        return ans;
    }

    int[] dfs(int node, List<List<Integer>> graph, boolean[] vis){

        vis[node] = true;

        int nodes = 1;
        int edges = graph.get(node).size();

        for(int nei : graph.get(node)){

            if(!vis[nei]){

                int[] res = dfs(nei, graph, vis);
                nodes += res[0];
                edges += res[1];
            }
        }

        return new int[]{nodes, edges};
    }
}