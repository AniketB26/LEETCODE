class Solution {
    public int largestRectangleArea(int[] heights) {
        // int left = 0;
        // int right = 0;
        // int n = heights.length;
        
        // int maxarea = 0;
        // for(int i =0; i< n; i++){
        //     int min = heights[i];
        //     left =i;
        //     right =i;

        //     while(left > 0 && heights[left-1] >= min){
        //         left--;
        //     }

        //     while(right < n-1 && heights[right+1] >= min){
        //         right++;
        //     }


        //     int width = right - left +1;
        //     int area = min * width;

        //     maxarea = Math.max(maxarea, area);

            
        // }

        // return maxarea;


        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];


        Stack<Integer> stk = new Stack<>();

        for(int i =0; i<n ; i++){
            
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }

            left[i] = stk.isEmpty() ? -1:stk.peek();
            stk.push(i);
        }

        stk.clear();

        for(int i =n-1; i>=0; i--){

            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }

            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        int max = 0;
        for(int i =0; i<n; i++){
            int width = right[i] - left[i] -1;
            int area = heights[i] * width;

            max = Math.max(max,area); 
        }

        return max;
    }
}