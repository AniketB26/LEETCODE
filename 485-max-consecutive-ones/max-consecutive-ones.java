class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int len = 0;
        // int maxlen =0;
        // int l =0;
        // int r;
        // for(r =0; r< nums.length; r++){

        //     if(nums[r] == 1){
        //         len++;
        //     }

        //     else{
                
        //         if(maxlen < len) {
        //             maxlen = len;
        //         }
        //         len =0;
        //         l = r+1;
        //     }
        // }

        // maxlen = Math.max(maxlen, r-l);

        // return maxlen;

        int i =0; 
        int max =0;

        while(i < nums.length){

            int j =i;

            while(j< nums.length && nums[j]==1){
                j++;
            }

            max = Math.max(max, j-i);

            i= j+1;
        }

        return max;
    }
}