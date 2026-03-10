class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        Queue<Integer> q = new LinkedList<>();

        int cnt = 0;

        q.offer(0);
        boolean[] vis = new boolean[n];
        Arrays.fill(vis,false);
        vis[0] = true;

        while(!q.isEmpty()){
            int poll = q.poll();
            
            cnt++;

            for(int nei : rooms.get(poll)){

                if(!vis[nei]){
                    q.offer(nei);
                    vis[nei] = true;
                }
            }
        }

        return cnt == n;
    }
}