import java.util.*;

class Solution {

    int dfs(ArrayList<ArrayList<Integer>> adj, int node, int dis, boolean[] vis) {

        vis[node] = true;

        if (dis == 0)
            return 1;

        int cnt = 1;

        for (int next : adj.get(node)) {

            if (!vis[next]) {
                cnt += dfs(adj, next, dis - 1, vis);
            }
        }

        return cnt;
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {

        int n1 = edges1.length + 1;
        int n2 = edges2.length + 1;

        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();

        for (int i = 0; i < n1; i++)
            adj1.add(new ArrayList<>());

        for (int i = 0; i < n2; i++)
            adj2.add(new ArrayList<>());

        for (int[] ed : edges1) {
            int u = ed[0];
            int v = ed[1];

            adj1.get(u).add(v);
            adj1.get(v).add(u);
        }

        for (int[] ed : edges2) {
            int u = ed[0];
            int v = ed[1];

            adj2.get(u).add(v);
            adj2.get(v).add(u);
        }

        int max2 = 0;

        if (k > 0) {
            for (int i = 0; i < n2; i++) {
                boolean[] vis = new boolean[n2];
                max2 = Math.max(max2, dfs(adj2, i, k - 1, vis));
            }
        }

        int[] ans = new int[n1];

        for (int i = 0; i < n1; i++) {

            boolean[] vis = new boolean[n1];

            ans[i] = dfs(adj1, i, k, vis) + max2;
        }

        return ans;
    }
}