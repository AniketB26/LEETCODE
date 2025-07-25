class Solution {
    public int[] dailyTemperatures(int[] temp) {

       int n = temp.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int prev =  stack.pop();
                output[prev] = i - prev;
            }
            
            stack.push(i);
        }

        return output;
    

    }
}