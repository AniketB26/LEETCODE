class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1;
        int ele = nums[0];

        for(int i =1; i<nums.length; i++){

            if(cnt == 0){
                ele = nums[i];
                cnt=1;
            }

            else if(nums[i]==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        return ele;
    }
}