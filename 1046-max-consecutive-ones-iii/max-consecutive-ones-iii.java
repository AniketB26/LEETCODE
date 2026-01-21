class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt =0;


        int l =0;
        int maxx = 0;

        for(int r =0; r<nums.length; r++){

            if(nums[r]==0) cnt++;

            while(cnt > k){

                if(nums[l]==0) cnt--;

                l++;
            }

            maxx = Math.max(maxx, r-l+1);
        }


        return maxx;


    }
}