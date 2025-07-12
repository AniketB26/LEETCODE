class Solution {

    // public StringBuilder helper(String s){
    //     Stack<Character> stk1 = new Stack<>();
    //     for(char i : s.toCharArray()){
    //         if(i == '#' ){
    //             if(!stk1.isEmpty())
    //                 stk1.pop();               
    //         }
    //         else{
    //             stk1.push(i);
    //         }

    //     }

    //     StringBuilder str = new StringBuilder();

    //     for(char i: stk1){
    //         str.append(i);
    //     }

    //     return str;

    // }


    public boolean backspaceCompare(String s, String t) {
        return helper2(s).equals(helper2(t));
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