class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        
        List<List<Integer>> ll= new ArrayList<>();

        for(int i =0; i<numCourses; i++){
            ll.add(new ArrayList<>());
        }

        

        

        int[] indgree = new int[numCourses];

        for(int pree[] : pre){
            int c = pree[0];
            int p = pree[1];

            indgree[c]++;
            ll.get(p).add(c);
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<numCourses; i++){
            if(indgree[i]==0){
                q.offer(i);
            }
        }

        
        int[] res = new int[numCourses];
        int in =0;
        while(!q.isEmpty()){
            int pol = q.poll();
            res[in++] = pol;
            

            for(int nei : ll.get(pol)){

                indgree[nei]--;

                if(indgree[nei] == 0){
                    q.offer(nei);
                }
            }

        }


        if(in == numCourses){
            return res;
        }

        return new int[0];
    }
}