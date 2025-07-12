class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length*2];
        
        for(int i =0; i<arr.length; i++){
            int j = i%nums.length;

            arr[i] = nums[j];
        }
        int[] res = new int[nums.length];
        

        for(int i =0; i<nums.length; i++){
            res[i] = -1;

            for(int j = i+1; j< i+ nums.length; j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        

        return res;
    }
}