class Solution {
    class DSU {

        int[] parent;

        DSU(int n) {

            parent = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {

            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        void union(int a, int b) {

            int pa = find(a);
            int pb = find(b);

            if (pa != pb) {
                parent[pb] = pa;
            }
        }
    }
    public boolean equationsPossible(String[] equations) {

        DSU dsu = new DSU(26);

        
        for(String s : equations){

            if(s.charAt(1) == '='){

                int u = s.charAt(0) - 'a';
                int v = s.charAt(3) - 'a';

                dsu.union(u,v);
            }
        }


        for(String s : equations){

            if(s.charAt(1) == '!'){

                int a = s.charAt(0) - 'a';
                int b = s.charAt(3) - 'a';

                if(dsu.find(a) == dsu.find(b)){
                    return false;
                }
            }
        }

        return true;
    }
}