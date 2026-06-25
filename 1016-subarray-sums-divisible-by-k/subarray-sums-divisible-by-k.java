class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        arr[0] = 1;


        int sum = 0;
        int ans = 0;

        for(int i =0; i<nums.length; i++){
            sum = ((sum +nums[i])%k + k)%k;

            int b = sum%k;

            ans += arr[b];

            arr[sum]++;
        }

        return ans;
    }
}