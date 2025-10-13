class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n = nums.length;
        int len = 0;
        for(int i =0; i<n; i++){
            len = Math.max(len, nums[i]);
        }
        int[] fre = new int[len+1];
        int m = fre.length;
        

        for(int i =0; i<n; i++){
            fre[nums[i]]++;
        }
        int sum = 0;

        for(int i =1; i<m; i++){
            // if(fre[i] == 0) continue;

            if(fre[i]%k == 0){
                sum += (fre[i]*i);
            }
        }

        return sum;
    }
}