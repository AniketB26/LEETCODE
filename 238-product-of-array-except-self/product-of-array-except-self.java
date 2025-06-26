class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int[] preFix = new int[nums.length];
        int[] sufFix = new int[nums.length];
        preFix[0] = 1;

         for(int i =1; i<nums.length; i++){
            preFix[i] = preFix[i-1] * nums[i-1];
         }
        
        sufFix[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            sufFix[i] = sufFix[i + 1] * nums[i+1];
        }


        for(int i =0; i<nums.length; i++){
            arr[i] = preFix[i] * sufFix[i];
        }

        return arr;
    }
}