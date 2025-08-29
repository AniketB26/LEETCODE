class Solution {
    public static void nextSmallest(int[] h, int[] arr){
        Stack<Integer> stk = new Stack<>();


        for(int i =0; i<h.length; i++){

            if(stk.isEmpty()){
                stk.add(i);
            }
            else{
                while(!stk.isEmpty() && h[stk.peek()] > h[i]){
                    int idx = stk.pop();
                    arr[idx] = i;
                }
                stk.add(i);
            }
        }

         while (!stk.isEmpty()) {
            arr[stk.peek()] = h.length;
            stk.pop();
        }
    }

    public static void prevSmallest(int[] h, int[] arr){
        Stack<Integer> stk = new Stack<>();

        for(int i = h.length-1; i>=0; i--){
            if(stk.isEmpty()){
                stk.add(i);
            }
            else{
                while(!stk.isEmpty() && h[stk.peek()] > h[i]){
                    int idx = stk.pop();
                    arr[idx] = i;
                }
                stk.add(i);
            }
        }
        while (!stk.isEmpty()) {
            arr[stk.peek()] = -1;
            stk.pop();
        }
    }
    public int largestRectangleArea(int[] heights) {


        


        int n = heights.length;
        int[] next = new int[n];
        int[] prev = new int[n];

        nextSmallest(heights, next);
        prevSmallest(heights, prev);
        

        int area = -1;

        for(int i =0; i<n; i++){
            int width = next[i] - prev[i] -1;

            int newarea = width * heights[i];

            area = Math.max(area,newarea);
        }

        return area;
    }
}