class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxwat = 0;
        int leftmax = height[0];
        int rightmax = height[n-1];

        int left = 0;
        int right = n-1;

        while(left < right){

            if(height[left] < height[right]){

                if(height[left] >= leftmax){
                    leftmax = height[left];
                }
                else{
                    maxwat += leftmax - height[left];
                }

                left++;
            }

            else{

                if(height[right] >= rightmax){
                    rightmax = height[right];
                }
                else{
                    maxwat += rightmax - height[right];
                }

                right--;
            }
        }

        return maxwat;
    }
}