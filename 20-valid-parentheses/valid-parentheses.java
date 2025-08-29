class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        char[] ch = s.toCharArray();

        for(char c : ch){

            if(c == '(' || c == '[' || c == '{'){
                stk.add(c);
            }
            else{
                if(c == ')'){
                    if(!stk.isEmpty() && stk.pop()== '(') continue;
                    else return false;
                }
                else if(c== ']'){
                    if(!stk.isEmpty() && stk.pop() == '[') continue;
                    else return false;
                }
                else if(c== '}'){
                    if(!stk.isEmpty() && stk.pop() == '{') continue;
                    else return false;
                }
            }
        }

        return stk.isEmpty();
    }
}