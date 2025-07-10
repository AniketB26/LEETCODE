class Solution {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];     // frequency of each char
        boolean[] inStack = new boolean[26]; // to check if a char is in stack
        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']++; // count occurrences
        }

        for (char c : s.toCharArray()) {
            count[c - 'a']--; // one less occurrence left

            if (inStack[c - 'a']) continue;

            // pop characters that are greater than current and still have remaining occurrences
            while (!stk.isEmpty() && stk.peek() > c && count[stk.peek() - 'a'] > 0) {
                inStack[stk.pop() - 'a'] = false;
            }

            stk.push(c);
            inStack[c - 'a'] = true;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        for (char ch : stk) {
            sb.append(ch);
        }

        return sb.toString();
    }
}