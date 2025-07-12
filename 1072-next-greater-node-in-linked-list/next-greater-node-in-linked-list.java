class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // 1) Build a list of values
        List<Integer> vals = new ArrayList<>();
        for (ListNode cur = head; cur != null; cur = cur.next) {
            vals.add(cur.val);
        }

        int n = vals.size();
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();

        // 2) Monotonic‑stack pass
        for (int i = 0; i < n; i++) {
            // Resolve all smaller values waiting in the stack
            while (!stk.isEmpty() && vals.get(i) > vals.get(stk.peek())) {
                int idx = stk.pop();
                ans[idx] = vals.get(i);
            }
            // Now push this index to wait for its next larger
            stk.push(i);
        }

        // 3) Remaining indices in stk have no larger node → ans remains 0
        return ans;
    }
}
