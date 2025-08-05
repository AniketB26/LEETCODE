class Solution {

    public int findfirst(int[] nums, int tar){
        int left =0;
        int right = nums.length-1;
        int idx = -1;
        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == tar){
                idx = mid;
                right--;
            }

            else if(nums[mid] < tar){
                left++;
            }

            else{
                right--;
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
                left++;
            }

            else if(nums[mid] < tar){
                left++;
            }

            else{
                right--;
            }
        } 
        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums,target);
        int last = findlast(nums,target);


        return new int[]{first,last};
    }
}