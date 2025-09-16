class Solution {
    public int singleNumber(int[] nums) {
        int uni = 0;

        for(int n : nums){
            uni ^= n;
        }

        return uni;
    }
}