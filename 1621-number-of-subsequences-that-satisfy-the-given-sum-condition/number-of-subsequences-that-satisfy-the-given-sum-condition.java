class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int i =0;
        int j = nums.length - 1;
        int tot = 0;
        int mod = 1_000_000_007;
        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;
        for(int z =1; z<n; z++ ){
            pow[z] = (pow[z-1] * 2) % mod;
        }
        
        while(i<=j){
            
            if(nums[i] + nums[j] > target){
                j--;
            }

            else{
                tot = (tot + pow[j-i])%mod;
                i++;
            }
        }

        return (int)tot;
    }
}