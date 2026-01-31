class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int cnt =0;
        int pro = 1;


        int l =0, r=0;
        
        for(r =0; r<nums.length; r++){

            pro *= nums[r];

            while(pro >= k && l < nums.length){
                pro /= nums[l];
                l++;
            }
            cnt += (r-l+1);
            
        }


        return cnt;

    }
}