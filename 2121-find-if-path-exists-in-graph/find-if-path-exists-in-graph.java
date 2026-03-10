class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        List<List<Integer>> grid= new ArrayList<>();

        for(int i =0; i<n ; i++){
            grid.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u = e[0];
            int v = e[1];

            grid.get(u).add(v);
            grid.get(v).add(u);
        }


        Queue<Integer> q = new LinkedList<>();

        q.offer(source);

        boolean[] vis = new boolean[n];
        vis[source] = true;

        while(!q.isEmpty()){
            int poll = q.poll();

            

            for(int nei : grid.get(poll)){

                if(nei == destination ) return true;

                if(!vis[nei]){
                    q.offer(nei);
                    vis[nei] = true;
                }

            }
        }

        return false;
    }
}