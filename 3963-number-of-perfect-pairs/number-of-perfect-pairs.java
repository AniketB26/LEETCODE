class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        
        for(int i =0; i<n; i++){

            if(nums[i] < 0){
                nums[i] *= -1;
            }
        }

        Arrays.sort(nums);
        long ans = 0;

        for(int i =0; i<n; i++){

            int tar = 2 * nums[i];

            int last = i;

            int left = i+1;
            int right = n-1;


            while(left<=right){

                int mid = left + (right-left)/2;

                if(nums[mid] <= tar){
                    last = mid;
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }


            }

            ans += (last-i);
        }

        return ans;
    }
}