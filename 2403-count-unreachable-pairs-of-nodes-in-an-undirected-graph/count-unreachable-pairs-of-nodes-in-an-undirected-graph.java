class Solution {
    static class DSU{

        int[] parent;
        int[] size;

        DSU(int n){
            parent = new int[n];
            size = new int[n];

            for(int i = 0; i < n; i++){
                parent[i] = i;
                size[i] = 1;
            }
        } 

        int find(int x){

            if(parent[x] == x) return parent[x];

            return parent[x] = find(parent[x]);
        }

        void union(int u, int v){

            int pu = find(u);
            int pv = find(v);

            if(pu == pv ) return;

            if(size[pu] > size[pv]){

                parent[pv] = pu;
                size[pu] += size[pv];
            }

            else{
                parent[pu] = pv;
                size[pv] += size[pu]; 
            }
        }

    }
    public long countPairs(int n, int[][] edges) {
        
        DSU dsu = new DSU(n);


        for(int[] edge : edges){

            int a = edge[0];
            int b = edge[1];

            dsu.union(a,b);
        }

        long ans = 0;
        long rem = n;

        HashMap<Integer, Integer> map = new HashMap<>();



        for(int i =0; i<n; i++){

            int parent = dsu.find(i);

            map.put(parent, map.getOrDefault(parent, 0) +1);
        }


        for(int size : map.values()){

            ans += size * (rem - size);

            rem -= size;
        }

        return ans;
    }
}