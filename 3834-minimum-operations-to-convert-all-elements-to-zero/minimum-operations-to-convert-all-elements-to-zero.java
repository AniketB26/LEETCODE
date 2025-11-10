class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int ans = 0;
        stk.push(0);

        for(int n : nums){

            while(!stk.isEmpty() && stk.peek() > n){
                stk.pop();
            }

            if(stk.isEmpty() || stk.peek() < n){
                
                
                ans++;
                stk.push(n);
            }
        }

        return ans;
    }
}