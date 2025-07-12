class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        Arrays.fill(res,-1);
        for(int i =0; i< n*2; i++){
            int idx = i%n;
            
            while(!stk.isEmpty() && nums[idx] > nums[stk.peek()]){
                res[stk.pop()] = nums[idx];
            }

            if(i<n){
                stk.push(i);
            }
        }

        return res;
    }
}