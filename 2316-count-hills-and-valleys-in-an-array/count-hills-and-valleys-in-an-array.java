class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int cnt =0;
        int prev = 0;
        

        for(int i =1; i<n ; i++){
            if(nums[prev] == nums[i]) continue;

            int next = i+1;

            while(next < n && nums[i] == nums[next]){
                next++;
            }


            if(next >= n) break;


            if((nums[prev] < nums[i] && nums[i] > nums[next]) || 
            (nums[prev] > nums[i] && nums[i] < nums[next])){
                cnt++;
            }

            prev = i;
            i = next-1;
        }

        return cnt;
    }
}