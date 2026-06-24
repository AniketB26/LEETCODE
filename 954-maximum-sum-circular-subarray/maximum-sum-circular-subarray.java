class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int nk = Integer.MIN_VALUE , rk = Integer.MAX_VALUE;

        int nkcs = 0, rkcs = 0;

        int ts =0;

        for(int i : nums){
            nkcs += i;
            rkcs += i;
            ts += i;
            nk = Math.max(nk,nkcs);
            rk = Math.min(rk,rkcs);

            if(nkcs < 0) nkcs = 0;
            if(rkcs > 0) rkcs = 0;

        }

        return ts == rk ? nk : Math.max(nk, ts-rk);
    }
}