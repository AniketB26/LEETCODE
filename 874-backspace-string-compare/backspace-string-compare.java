class Solution {

    public StringBuilder helper(String s){
        Stack<Character> stk1 = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '#' ){
                if(!stk1.isEmpty())
                    stk1.pop();               
            }
            else{
                stk1.push(i);
            }

        }

        StringBuilder str = new StringBuilder();

        for(char i: stk1){
            str.append(i);
        }

        return str;

    }


    public boolean backspaceCompare(String s, String t) {
        
        StringBuilder ss = helper(s);
        StringBuilder tt = helper(t);

        return ss.toString().equals(tt.toString());
    }
}