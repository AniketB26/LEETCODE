class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            if(max < nums[i]) max = nums[i];
        }

        int cnt =0;

        for(int i =0; i<nums.length; i++){
            cnt += max-nums[i];
        }

        return cnt;
    }
}