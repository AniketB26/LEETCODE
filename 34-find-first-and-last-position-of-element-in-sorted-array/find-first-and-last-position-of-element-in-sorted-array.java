class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       int first = getfirst(nums,target);
       int last = getlast(nums,target);

       return new int[]{first,last};
    }


    int getfirst(int[] nums, int tar){
        int left = 0;
        int right = nums.length-1;
        int ind = -1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(nums[mid] == tar){
                ind = mid;
                right = mid-1;
            }
            else if(nums[mid] < tar){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return ind;
    }

    int getlast(int[] nums, int tar){
        int left = 0;
        int right = nums.length-1;
        int ind = -1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(nums[mid] == tar){
                ind = mid;
                left = mid+1;
            }
            else if(nums[mid] < tar){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return ind;
    }
}