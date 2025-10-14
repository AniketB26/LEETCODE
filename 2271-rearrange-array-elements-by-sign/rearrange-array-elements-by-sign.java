class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] res = new int[nums.length];

        for(int i =0; i<nums.length; i++){

            int ele = nums[i];

            if(ele > 0){
                res[pos] = ele;
                pos += 2;
            }
            else{
                res[neg] = ele;
                neg += 2;
            }
        }

        return res;
    }
}