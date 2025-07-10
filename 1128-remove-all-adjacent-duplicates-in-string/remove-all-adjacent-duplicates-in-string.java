class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();

        char[] arr = s.toCharArray();

        for(char i : arr){
            if(stk.isEmpty() || stk.peek() != i){
                stk.push(i);
            }
            else{
                stk.pop();
            }
        }
       StringBuilder sb = new StringBuilder();


        for(char i : stk){
            sb.append(i);
        }

        return sb.toString();
    }
}