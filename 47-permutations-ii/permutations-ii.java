class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Set<List<Integer>> set = new HashSet<>();

        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, ans);

        return ans;
    }

    void backtrack(int[] nums, List<Integer> curr, boolean[] used, ArrayList<List<Integer>> set){

        if(curr.size() == nums.length){
            set.add(new ArrayList<>(curr));
            return;
        }


        for(int i =0; i< nums.length; i++){

            if(used[i]) continue;

            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, curr, used, set);

            curr.remove(curr.size() -1);
            used[i] = false;

        }
    }
}