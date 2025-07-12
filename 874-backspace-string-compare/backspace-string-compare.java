class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        
        
        for(char i : s.toCharArray()){
            if(i == '#' ){
                if(!stk1.isEmpty())
                    stk1.pop();               
            }
            else{
                stk1.push(i);
            }

        }

         for(char i : t.toCharArray()){
            if(i == '#' ){
                if(!stk2.isEmpty())
                    stk2.pop();               
            }
            else{
                stk2.push(i);
            }

        }

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(char i: stk1){
            str1.append(i);
        }

        for(char i: stk2){
            str2.append(i);
        }
        System.out.println(str1);
        System.out.println(str2);
        return str1.toString().equals(str2.toString());
    }
}