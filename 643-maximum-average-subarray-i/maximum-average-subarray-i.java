class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k == 1 && nums.length == 1 ) return (double)nums[0];
        int sum = 0;
        int maxavg = Integer.MIN_VALUE;
        int l =0;
        for(int r =0; r<nums.length; r++){
            sum += nums[r];

            if(r-l+1 == k){

                if(sum > maxavg ){
                    maxavg = sum;
                }

                sum -= nums[l++];
            }
        }

        return (double)maxavg/k;
    }
}