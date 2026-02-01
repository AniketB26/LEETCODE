class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atmost(nums, k) - atmost(nums, k-1);
    }


    int atmost(int[] nums, int k){

        int n = nums.length;
        int l =0, cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int r =0; r<n; r++){

            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){
                map.put(nums[l] , map.get(nums[l])-1);

                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }

            cnt += r-l+1;
        }

        return cnt;
    } 
}