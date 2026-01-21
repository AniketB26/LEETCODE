class Solution {
    public int longestSubarray(int[] nums) {
        
        int zeroCnt =0;
        
        int max =0;

        int l =0, r=0;

        while(r<nums.length){

            if(nums[r]==0) zeroCnt++;

            while(zeroCnt > 1){

                if(nums[l]==0) zeroCnt--;
                l++;
            }

             r++;
            max = Math.max(max,r-l);

           
        }


        return max-1;
        
    }
}