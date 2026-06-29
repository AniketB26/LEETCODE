class Solution {
    public long countStableSubarrays(int[] capacity) {
        HashMap<Long, HashMap<Integer, Integer>> map = new HashMap<>();

        long alpha = 0;
        long ans = 0;

        for (int i = 0; i < capacity.length; i++) {
            int ai = capacity[i];

            // Query using prefix[i]
            if (map.containsKey(alpha)) {
                ans += map.get(alpha).getOrDefault(ai, 0);
            }

            // Remove the invalid length-2 subarray [0, 0]
            if (i > 0 && ai == 0 && capacity[i - 1] == 0) {
                ans--;
            }

            // Update prefix to prefix[i + 1]
            alpha += ai;

            // Store prefix[i + 1] + capacity[i]
            long beta = alpha + ai;

            map.putIfAbsent(beta, new HashMap<>());
            HashMap<Integer, Integer> inner = map.get(beta);
            inner.put(ai, inner.getOrDefault(ai, 0) + 1);
        }

        return ans;
    }
}