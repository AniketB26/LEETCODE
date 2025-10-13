class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] fre = new int[101];
        int n = nums.length;

        for(int i =0; i<n; i++){
            fre[nums[i]]++;
        }
        int sum = 0;

        for(int i =1; i<101; i++){
            if(fre[i] == 0) continue;

            if(fre[i]%k == 0){
                sum += (fre[i]*i);
            }
        }

        return sum;
    }
}