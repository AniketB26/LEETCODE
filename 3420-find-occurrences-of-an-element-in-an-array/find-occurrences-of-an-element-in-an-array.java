class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]==x){
                list.add(i);
            }
        }


        int[] ans = new int[queries.length];
        for(int i =0; i< queries.length; i++){

            int ind = queries[i];

            if(ind <= list.size()){
                ans[i] = list.get(ind-1);
            }
            else{
                ans[i] = -1;
            }

        }


        return ans;

        
    }
}