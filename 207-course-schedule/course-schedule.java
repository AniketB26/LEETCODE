class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        int[] indgree = new int[numCourses];

        for(int[] p : prerequisites){
            int cou = p[0];
            int pre = p[1];

            graph.get(pre).add(cou);
            indgree[cou]++;
        }


        Queue<Integer> q = new LinkedList<>();

        for(int i =0; i<numCourses; i++){
            if(indgree[i] == 0) q.offer(i);
        }

        int cnt =0;

        while(!q.isEmpty()){
            int node = q.poll();
            cnt++;

            for(int n: graph.get(node) ){
                indgree[n]--;

                if(indgree[n] == 0) q.offer(n);

            }
        }

        return cnt == numCourses;
    }
}