class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        for(int i =0; i< nums1.length; i++){

            int val = nums1[i];
            int j =0;

            while(j< nums2.length && nums2[j] != val){
                j++;
            }

            int k = j+1;
            while(k<nums2.length && nums2[k] <= val){
                k++;
            }

            if(k< nums2.length){
                arr[i] = nums2[k];
            }
            else{
                arr[i] = -1;
            }

        }

        return arr;
    }
}