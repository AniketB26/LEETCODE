class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt = k;
        int len =0;
        int max = 0;

        int r =0, l =0;
        for(r =0; r<nums.length; r++){

            if(nums[r]==0) cnt--;

            


            while(cnt < 0){
                if(nums[l] == 0) cnt++;
                l++;
            }

            max = Math.max(max, r-l+1);
        }

        return max;


    }
}