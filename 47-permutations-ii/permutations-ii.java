class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, set);

        return new ArrayList<>(set);
    }

    void backtrack(int[] nums, List<Integer> curr, boolean[] used, Set<List<Integer>> set){

        if(curr.size() == nums.length){
            set.add(new ArrayList<>(curr));
            return;
        }


        for(int i =0; i< nums.length; i++){

            if(used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, curr, used, set);

            curr.remove(curr.size() -1);
            used[i] = false;

        }
    }
}