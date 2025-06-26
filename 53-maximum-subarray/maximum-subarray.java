class Solution {
    public int maxSubArray(int[] nums) {
        int cur = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0; i< nums.length; i++){
            cur = Math.max(nums[i], cur+nums[i]);
            max = Math.max(cur, max);
        }

        return max;
    }
}