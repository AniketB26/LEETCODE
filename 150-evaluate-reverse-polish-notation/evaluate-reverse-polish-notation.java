class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> stk = new Stack<>();

        int n = token.length;

        int i =0;
        while(i < n){
            if((!token[i].equals("+")) && (!token[i].equals("-")) &&(!token[i].equals("*")) && (!token[i].equals("/"))  ){
                stk.push(Integer.parseInt(token[i]));
                i++;
            }
            else{
            
                int e1 = stk.peek();
                stk.pop();
                int e2 = stk.peek();
                stk.pop();

                if(token[i].equals("+") ){
                    stk.push(e1+e2);
                    
                }
                else if(token[i].equals("-")){
                    stk.push(e2-e1);
                }
                else if(token[i].equals("*")){
                    stk.push(e2*e1);
                }
                else if(token[i].equals("/")){
                    stk.push(e2/e1);
                }

                i++;
            }
        }
        return stk.peek();
    }
}