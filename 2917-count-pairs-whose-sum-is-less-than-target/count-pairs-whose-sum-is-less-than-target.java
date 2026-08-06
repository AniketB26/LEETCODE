class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        nums.sort(Comparator.naturalOrder());

        int left = 0, right = nums.size()-1;
        int cnt = 0;

        while(left < right){

            if(nums.get(left) + nums.get(right) < target){
                cnt += right - left;
                left++;
            }
            else if(nums.get(left) + nums.get(right) >= target){
                right--;
            }
        }

        return cnt;
    }
}