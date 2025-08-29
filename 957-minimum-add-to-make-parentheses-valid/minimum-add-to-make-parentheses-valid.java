class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        char[] arr = s.toCharArray();
        int cnt =0;
        for(int i =0; i<s.length(); i++){
            char x = arr[i];

            if(x=='('){
                stk.add(x);
            }
            else{
                if(stk.isEmpty()) cnt++;

                else{
                    stk.pop();
                }
            }
        }

        return cnt + stk.size();
    }
}