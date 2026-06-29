class Solution {
    public long countStableSubarrays(int[] capacity) {
        HashMap<Integer, HashMap<Long, Integer>> map = new HashMap<>();

        long ans = 0;
        long prefix = 0;

        for (int i = 0; i < capacity.length; i++) {
            int x = capacity[i];

            prefix += x;
            long target = prefix - 2L * x;

            map.putIfAbsent(x, new HashMap<>());
            HashMap<Long, Integer> inner = map.get(x);

            ans += inner.getOrDefault(target, 0);

            // Remove the invalid length-2 subarray [0, 0]
            if (x == 0 && i > 0 && capacity[i - 1] == 0) {
                ans--;
            }

            inner.put(prefix, inner.getOrDefault(prefix, 0) + 1);
        }

        return ans;
    }
}