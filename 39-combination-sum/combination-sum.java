class Solution {
    private void com(int ind, int[] arr, int tar, List<List<Integer>> ans, List<Integer> ds ){
        if(ind == arr.length){
            if(tar == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind] <= tar){
            ds.add(arr[ind]);
            com(ind, arr, tar-arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }

        com(ind+1, arr, tar, ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        com(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}