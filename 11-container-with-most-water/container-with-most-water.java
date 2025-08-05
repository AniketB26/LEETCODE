class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;

        int maxarea = 0;


        while(left < right){
            int h = Math.min(height[left] ,height[right]);
           
            int area = h*(right-left);

            maxarea = Math.max(maxarea,area);

            while(left<right && height[left]<= h) left++;
            while(left<right && height[right] <= h) right--;
        }

        return maxarea;
    }
}