class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> stk = new Stack<>();

        for(int i =0; i<ast.length; i++ ){

            boolean des = false;

            while(!stk.isEmpty() && stk.peek() > 0  && ast[i] < 0){

                if(Math.abs(stk.peek()) < Math.abs(ast[i])){
                    stk.pop();
                }

                else if(Math.abs(stk.peek()) == Math.abs(ast[i])){
                    stk.pop();
                    des = true;
                    break;
                }
                else{
                    des = true;
                    break;
                }
            }

            if(!des){
                stk.push(ast[i]);
            }

            

            

            

        }

        int[] ans = new int[stk.size()];

        for(int i =ans.length-1; i>=0; i--){
            ans[i] = stk.pop();
        }

        return ans;
    }
}