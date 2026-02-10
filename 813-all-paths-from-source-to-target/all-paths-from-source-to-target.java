class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();

        dfs(0, graph, path);
        return ans;
    }

    void dfs(int node , int[][] graph, List<Integer> path){

        path.add(node);

        if(node == graph.length - 1){
            ans.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }


        for(int ni : graph[node]){
            dfs(ni, graph, path);
        }

        path.remove(path.size() -1);
    }
}