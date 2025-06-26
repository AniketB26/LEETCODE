class Solution {
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int i =0, j=1;

        while(j< nums.length){
            if(nums[i] == nums[j]){
                j++;
            }
            else if(nums[i] != nums[j]){
                swap(nums, ++i, j);
                j++;
            }
        }

        return i+1;
    }
}