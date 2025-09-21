class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }


        List<Integer> list = new ArrayList<>(set);


        Collections.sort(list, Collections.reverseOrder());

        k = Math.min(k, list.size());

        int[] res = new int[k];

        for(int i =0; i<k; i++){

            res[i] = list.get(i);

        }


        return res;
    }
}