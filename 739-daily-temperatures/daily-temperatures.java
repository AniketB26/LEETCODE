class Solution {
    public int[] dailyTemperatures(int[] temp) {

        Stack<Integer> stk = new Stack<>();
        int n = temp.length;
        int[] res = new int[n];

        
        for(int i =0; i< n ; i++){
            while(!stk.isEmpty() && temp[i] > temp[stk.peek()]){
               int idx = stk.pop();
               res[idx] = i - idx;
            }

            stk.push(i);
        }


        return res;
        


    }
}