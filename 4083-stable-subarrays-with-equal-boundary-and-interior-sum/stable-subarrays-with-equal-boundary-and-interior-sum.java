class Solution {
    public long countStableSubarrays(int[] capacity) {
        HashMap<Long, HashMap<Integer, Integer>> map = new HashMap<>();

        long alpha = 0;
        long ans = 0;

        long prevBeta = 0;
        int prevVal = Integer.MIN_VALUE;

        for (int i = 0; i < capacity.length; i++) {

            // Query using prefix[i]
            if (map.containsKey(alpha)) {
                ans += map.get(alpha).getOrDefault(capacity[i], 0);
            }

            // Update prefix to prefix[i + 1]
            alpha += capacity[i];

            // Now insert the previous index
            if (prevVal != Integer.MIN_VALUE) {
                map.putIfAbsent(prevBeta, new HashMap<>());
                HashMap<Integer, Integer> inner = map.get(prevBeta);
                inner.put(prevVal, inner.getOrDefault(prevVal, 0) + 1);
            }

            // Save current index for the next iteration
            prevBeta = alpha + capacity[i];
            prevVal = capacity[i];
        }

        return ans;
    }
}