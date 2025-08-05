class Solution {

    public int findfirst(int[] nums, int tar){
        int left =0;
        int right = nums.length-1;
        int idx = -1;
        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == tar){
                idx = mid;
                right = mid-1;
            }

            else if(nums[mid] < tar){
                left = mid+1;
            }

            else{
                right = mid-1;
            }
        }

        return idx;
    }


    public int findlast(int[] nums, int tar ){
        int left = 0;
        int right = nums.length-1;

        int idx = -1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == tar){
                idx = mid;
                left = mid+1;
            }

            else if(nums[mid] < tar){
                left = mid+1;
            }

            else{
                right = mid-1;
            }
        } 
        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findfirst(nums,target);
        arr[1] = findlast(nums,target);


        return arr;
    }
}