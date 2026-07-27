class Solution {
    public int minOperations(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int cnt = 0;

        for (int n : nums) {

            while (!st.isEmpty() && st.peek() > n) {
                st.pop();
                cnt++;
            }

            if (n != 0 && (st.isEmpty() || st.peek() != n)) {
                st.push(n);
            }
        }

        return cnt + st.size();
    }
}