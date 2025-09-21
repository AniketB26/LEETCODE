class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
         TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) {
            set.add(num);
        }


        

        k = Math.min(k, set.size());

        int[] res = new int[k];

        int i = 0;

        for(int val : set){
            if(i == k) break;
            res[i++] = val;
        }


        return res;
    }
}