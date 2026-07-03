class Solution {

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int node,
                        Stack<Integer> st, boolean[] vis, boolean[] pathVis) {

        vis[node] = true;
        pathVis[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!vis[neighbor]) {
                if (dfs(adj, neighbor, st, vis, pathVis))
                    return true;
            } else if (pathVis[neighbor]) {
                return true; 
            }
        }

        pathVis[node] = false;
        st.push(node); 
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++){

            adj.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites){

            int v = edge[0];
            int u = edge[1];

            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (dfs(adj, i, st, vis, pathVis))
                    return false;
            }
        }

        
        while (!st.isEmpty()) {
            st.pop();
        }

        return true;

    }
}