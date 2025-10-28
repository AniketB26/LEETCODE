class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        long res = 0;
        int k = (nums.length/2) ;
        System.out.println(k);
        for(int i =0; i<nums.length; i++){
            if(k > 0){
                res -= nums[i]*nums[i];
                k--;
            }
            else{
                res += nums[i]*nums[i];
            }
        }
        return res;
    }
}