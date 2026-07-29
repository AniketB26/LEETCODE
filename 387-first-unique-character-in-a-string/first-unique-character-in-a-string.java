class Solution {
    public int firstUniqChar(String s) {
        
        int[] frq = new int[256];

        char[] arr = s.toCharArray();

        for(int i =0; i<arr.length; i++){

            frq[arr[i]]++;
        }


        for(int i =0; i<arr.length; i++){

            if(frq[arr[i]] == 1) return i;
        }


        return -1;
    }
}