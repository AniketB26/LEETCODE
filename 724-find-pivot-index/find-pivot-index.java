class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        for(int i =0; i<nums.length; i++){
            tot += nums[i];
        }
        int leftsum = 0;
        for(int i =0; i<nums.length; i++){
            
            int rightsum = tot - leftsum - nums[i];

            if(rightsum == leftsum) return i;

            leftsum += nums[i];

        }

        return -1;
    }
}