class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int uni = 0;

        for(int n : nums) uni ^= n;

        return uni;
    }
};