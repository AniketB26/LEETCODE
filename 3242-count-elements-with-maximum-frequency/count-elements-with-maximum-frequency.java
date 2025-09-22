class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = -1;

        int res =0;
        for(int i =0; i<nums.length; i++ ){

            int ele = nums[i];

            arr[ele]++;

            max = Math.max(max, arr[ele]);
        }

        

        for(int i =1; i< arr.length; i++){

            if(arr[i] == max) res += max;
        }


        return res;

    }
}