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
        String ss = helper2(s);
        String tt = helper2(t);
        System.out.println(ss);
        System.out.println(tt);
        return ss.equals(tt);
    }

    public String helper2(String s){
        StringBuilder sb = new StringBuilder();

        for(char i : s.toCharArray()){
            if(i == '#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(i);
            }
        }

        return sb.toString();
    }

}